import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SkillfactoryFooterTest {
    private WebDriver driver;

    @BeforeAll
    static void installDriver() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void footerPhone1() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerPhone1();
        Assertions.assertEquals("tel:+79585770417", clickToCall);
    }

    @Test
    public void footerPhone2() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        Assertions.assertFalse(driver.findElements(By.linkText("tel:+74952910912")).size() < 1);
    }

    @Test
    public void footerEmail() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String mailTo = skillfactoryFooter.footerEmail();
        Assertions.assertEquals("mailto:info@skillfactory.ru", mailTo);
    }
    @Test
    public void footerPREmail() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        Assertions.assertFalse(driver.findElements(By.linkText("mailto:pr@skillfactory.ru")).size() < 1);
    }
    @Test
    public void footerSchoolProgPhone1() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerSchoolProgPhone1();
        Assertions.assertEquals("tel:+74952910912", clickToCall);
    }
    @Test
    public void footerSchoolProgPhone2() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerSchoolProgPhone2();
        Assertions.assertEquals("tel:+79585770417", clickToCall);
    }
    @Test
    public void footerAnalysisPhone1() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerAnalysisPhone1();
        Assertions.assertEquals("tel:+79067747361", clickToCall);
    }
    @Test
    public void footerAnalysisPhone2() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerAnalysisPhone2();
        Assertions.assertEquals("tel:+79067748091", clickToCall);
    }
    @Test
    public void footerAnalysisPhone3() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerAnalysisPhone3();
        Assertions.assertEquals("tel:+79067760749", clickToCall);
    }
    @Test
    public void footerAnalysisPhone4() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        String clickToCall = skillfactoryFooter.footerAnalysisPhone4();
        Assertions.assertEquals("tel:+79067764231", clickToCall);
    }
    @Test
    public void subscribeNegativeEmailTest() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        GetElementMethods getElementMethods = skillfactoryFooter.subscribeForm("sergoexample.ru", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getSubscribeEmailError());
    }

    @Test
    public void subscribeNegativeAgreementTest() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        GetElementMethods getElementMethods = skillfactoryFooter.subscribeForm("sergoexample.ru", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getSubscribeAgreementError());
    }

    @Test
    public void subscribePositiveTest() {
        SkillfactoryFooter skillfactoryFooter = new SkillfactoryFooter(driver);
        skillfactoryFooter.openPage();
        GetElementMethods getElementMethods = skillfactoryFooter.subscribeForm("sergo@example.ru", true);
        Assertions.assertEquals("", getElementMethods.getSubscribeEmailError());
        Assertions.assertEquals("", getElementMethods.getSubscribeAgreementError());
    }

    @AfterEach
    public void closeBrowser() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            driver.close();
        }

    }

}
