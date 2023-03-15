import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SkillfactoryNavTest {

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
    public void allCourses() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.allCourses();
        Assertions.assertEquals("https://skillfactory.ru/courses", getElementMethods.getUrl());
    }

    @Test
    public void dataScience() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.dataScience();
        Assertions.assertEquals("https://skillfactory.ru/courses/data-science", getElementMethods.getUrl());
    }

    @Test
    public void dataAnalysis() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.dataAnalysis();
        Assertions.assertEquals("https://skillfactory.ru/courses/analitika-dannyh", getElementMethods.getUrl());
    }

    @Test
    public void programming() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.programming();
        Assertions.assertEquals("https://skillfactory.ru/courses/programmirovanie", getElementMethods.getUrl());
    }

    @Test
    public void python() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.python();
        Assertions.assertEquals("https://skillfactory.ru/courses/python", getElementMethods.getUrl());
    }

    @Test
    public void intensive() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.intensive();
        Assertions.assertEquals("https://skillfactory.ru/courses/intensive", getElementMethods.getUrl());
    }

    @Test
    public void frontend() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.frontend();
        Assertions.assertEquals("https://skillfactory.ru/courses/web-razrabotka", getElementMethods.getUrl());
    }

    @Test
    public void backend() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.backend();
        Assertions.assertEquals("https://skillfactory.ru/courses/backend-razrabotka", getElementMethods.getUrl());
    }

    @Test
    public void testing() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.testing();
        Assertions.assertEquals("https://skillfactory.ru/courses/testirovanie", getElementMethods.getUrl());
    }

    @Test
    public void applications() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.applications();
        Assertions.assertEquals("https://skillfactory.ru/courses/razrabotka-mobilnyh-prilozheniy", getElementMethods.getUrl());
    }

    @Test
    public void webSecurity() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.webSecurity();
        Assertions.assertEquals("https://skillfactory.ru/courses/kiberbezopasnost", getElementMethods.getUrl());
    }

    @Test
    public void networkInfrastructure() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.networkInfrastructure();
        Assertions.assertEquals("https://skillfactory.ru/courses/network-infrastructure", getElementMethods.getUrl());
    }

    @Test
    public void gameDevelopment() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.gameDevelopment();
        Assertions.assertEquals("https://skillfactory.ru/courses/razrabotka-igr", getElementMethods.getUrl());
    }

    @Test
    public void marketing() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.marketing();
        Assertions.assertEquals("https://skillfactory.ru/courses/marketing", getElementMethods.getUrl());
    }

    @Test
    public void design() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.design();
        Assertions.assertEquals("https://skillfactory.ru/courses/design", getElementMethods.getUrl());
    }

    @Test
    public void management() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.management();
        Assertions.assertEquals("https://skillfactory.ru/courses/management-i-upravlenie", getElementMethods.getUrl());
    }

    @Test
    public void higherEducation() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.higherEducation();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/vyssheye-obrazovaniye?"));
    }

    @Test
    public void websiteDevelopment() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.websiteDevelopment();
        Assertions.assertEquals("https://skillfactory.ru/courses/sozdanie-saytov", getElementMethods.getUrl());
    }

    @Test
    public void menuFree() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.menuFree();
        Assertions.assertEquals("https://skillfactory.ru/free-events", getElementMethods.getUrl());
    }

    @Test
    public void menuCorporateTraining() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.menuCorporateTraining();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/corporativnoye-obuchenye?"));
    }

    @Test
    public void menuCooperation() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.menuCooperation();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/partnership?"));
    }

    @Test
    public void menuBlog() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        GetElementMethods getElementMethods = skillfactoryNav.menuBlog();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://blog.skillfactory.ru/?"));
    }

    @Test
    public void menuPhone1() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        String clickToCall = skillfactoryNav.menuPhone1();
        Assertions.assertEquals("tel:+74952910912", clickToCall);
    }

    @Test
    public void menuPhone2() {
        SkillfactoryNav skillfactoryNav = new SkillfactoryNav(driver);
        skillfactoryNav.openPage();
        String clickToCall = skillfactoryNav.menuPhone2();
        Assertions.assertEquals("tel:+79585770417", clickToCall);
    }


    @AfterEach
    public void closeBrowser() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            driver.close();
        }

    }

}