package fixtures.azurespecials;

import com.microsoft.rest.v3.credentials.TokenCredentials;
import com.microsoft.rest.v3.http.HttpPipeline;
import com.microsoft.rest.v3.policy.CredentialsPolicyFactory;
import com.microsoft.rest.v3.policy.DecodingPolicyFactory;
import com.microsoft.rest.v3.policy.PortPolicyFactory;
import com.microsoft.rest.v3.policy.ProtocolPolicyFactory;
import com.microsoft.rest.v3.policy.RequestIdPolicyFactory;
import fixtures.azurespecials.implementation.AutoRestAzureSpecialParametersTestClientImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.fail;

public class SubscriptionInMethodTests {
    private static AutoRestAzureSpecialParametersTestClientImpl client;

    @BeforeClass
    public static void setup() {
        final HttpPipeline httpPipeline = HttpPipeline.build(
                new ProtocolPolicyFactory("http"),
                new PortPolicyFactory(3000),
                new CredentialsPolicyFactory(new TokenCredentials(null, UUID.randomUUID().toString())),
                new RequestIdPolicyFactory(),
                new DecodingPolicyFactory());
        client = new AutoRestAzureSpecialParametersTestClientImpl(httpPipeline);
        client.withSubscriptionId("1234-5678-9012-3456");
    }

    @Test
    public void postMethodLocalValid() throws Exception {
        client.subscriptionInMethods().postMethodLocalValid("1234-5678-9012-3456");
    }

    @Test
    public void postMethodLocalNull() throws Exception {
        try {
            client.subscriptionInMethods().postMethodLocalNull(null);
            fail();
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter subscriptionId is required"));
        }
    }

    @Test
    public void postPathLocalValid() throws Exception {
        client.subscriptionInMethods().postPathLocalValid("1234-5678-9012-3456");
    }

    @Test
    public void postSwaggerLocalValid() throws Exception {
        client.subscriptionInMethods().postSwaggerLocalValid("1234-5678-9012-3456");
    }
}
