package fixtures.headexceptions;

import com.microsoft.rest.v3.RestException;
import com.microsoft.rest.v3.credentials.BasicAuthenticationCredentials;
import com.microsoft.rest.v3.http.HttpPipeline;
import com.microsoft.rest.v3.policy.CredentialsPolicyFactory;
import com.microsoft.rest.v3.policy.PortPolicyFactory;
import com.microsoft.rest.v3.policy.ProtocolPolicyFactory;
import fixtures.headexceptions.implementation.AutoRestHeadExceptionTestServiceImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeadExceptionTests {
    private static AutoRestHeadExceptionTestServiceImpl client;

    @BeforeClass
    public static void setup() {
        final HttpPipeline httpPipeline = HttpPipeline.build(
                new ProtocolPolicyFactory("http"),
                new PortPolicyFactory(3000),
                new CredentialsPolicyFactory(new BasicAuthenticationCredentials(null, null)));
        client = new AutoRestHeadExceptionTestServiceImpl(httpPipeline);
    }

    @Test
    public void headException200() throws Exception {
        client.headExceptions().head200();
    }

    @Test
    public void headException204() throws Exception {
        client.headExceptions().head204();
    }

    @Test(expected = RestException.class)
    public void headException404() throws Exception {
        client.headExceptions().head404();
    }
}
