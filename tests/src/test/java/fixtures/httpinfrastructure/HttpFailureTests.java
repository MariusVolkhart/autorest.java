package fixtures.httpinfrastructure;

import com.azure.core.exception.HttpResponseException;
import fixtures.httpinfrastructure.models.ErrorException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.fail;

public class HttpFailureTests {
  private static AutoRestHttpInfrastructureTestService client;

  @BeforeClass
  public static void setup() {
    client = new AutoRestHttpInfrastructureTestServiceBuilder().build();
  }

  @Test
  public void getEmptyError() throws Exception {
    try {
      client.httpFailures().getEmptyError();
      fail();
    } catch (ErrorException ex) {
      Assert.assertEquals(400, ex.getResponse().getStatusCode());
    }
  }

  @Test
  public void getNoModelError() throws Exception {
    try {
      client.httpFailures().getNoModelError();
      fail();
    } catch (HttpResponseException ex) {
      Assert.assertEquals(400, ex.getResponse().getStatusCode());
      //Assert.assertTrue(ex.getgetResponse().raw().toString().contains("NoErrorModel"));
    }
  }
}