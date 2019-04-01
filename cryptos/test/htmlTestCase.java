package Stanley;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runners.Suite;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.jupiter.api.Test;

public class htmlTestCase extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(htmlTestCase.class));
    }

    @Test
    public void homePage() throws Exception {

        try (final WebClient webClient = new WebClient()) {
            
            final HtmlPage page = webClient.getPage("http://127.0.0.1:8080");
            Assert.assertEquals("Cryptos - Cryptocurrency & Mining Template", page.getTitleText());
        }
    }
};
