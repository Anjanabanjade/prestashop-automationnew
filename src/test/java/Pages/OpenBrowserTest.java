package Pages;

import org.testng.annotations.Test;
import prestashop.Config;

class OpenBrowserTest extends BaseTest {

    @Test
    public void openGoogle() {
        driver().get(Config.get("baseUrl"));
        System.out.println("Opened: " + driver().getTitle());
    }
}
