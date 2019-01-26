package fixtures.requiredoptional;

import com.microsoft.rest.v3.http.HttpPipeline;
import com.microsoft.rest.v3.policy.DecodingPolicyFactory;
import fixtures.requiredoptional.implementation.AutoRestRequiredOptionalTestServiceImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.fail;

public class ImplicitTests {
    private static AutoRestRequiredOptionalTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestRequiredOptionalTestServiceImpl(HttpPipeline.build(new DecodingPolicyFactory()));
    }

    @Test
    public void getRequiredPath() throws Exception {
        try {
            client.implicits().getRequiredPath(null);
            fail();
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter pathParameter is required"));
        }
    }

    @Test
    public void putOptionalQuery() throws Exception {
        client.implicits().putOptionalQuery(null);
    }

    @Test
    public void putOptionalHeader() throws Exception {
        client.implicits().putOptionalHeader(null);
    }

    @Test
    public void putOptionalBody() throws Exception {
        client.implicits().putOptionalBody(null);
    }

    @Test
    public void getRequiredGlobalPath() throws Exception {
        try {
            client.implicits().getRequiredGlobalPath();
            fail();
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("this.client.requiredGlobalPath() is required"));
        }
    }

    @Test
    public void getRequiredGlobalQuery() throws Exception {
        try {
            client.implicits().getRequiredGlobalQuery();
            fail();
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("this.client.requiredGlobalQuery() is required"));
        }
    }

    @Test
    public void getOptionalGlobalQuery() throws Exception {
        client.implicits().getOptionalGlobalQuery();
    }
}
