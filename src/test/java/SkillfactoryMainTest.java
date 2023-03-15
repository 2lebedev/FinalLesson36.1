import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SkillfactoryMainTest {

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
    public void allCoursesButtonTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.clickAllCourses();
        Assertions.assertEquals("https://skillfactory.ru/courses", getElementMethods.getUrl());
    }

    @Test
    public void freeEventsButtonTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.clickFreeEvents();
        Assertions.assertEquals("https://skillfactory.ru/free-events", getElementMethods.getUrl());
    }

    @Test
    public void openBlogStory1() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.openBlogStory1();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://blog.skillfactory.ru/ya-rabotal-v-banke-a-teper-analiziruyu-dannye-v-federalnom-kaznachejstve/?"));
    }

    @Test
    public void openBlogStory2() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.openBlogStory2();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://blog.skillfactory.ru/ya-data-scientist-v-tinkoff/?"));
    }

    @Test
    public void openBlogStory3() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.openBlogStory3();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://blog.skillfactory.ru/ya-byla-marketologom-a-stala-prodakt-menedzherom-v-it/?"));
    }

    @Test
    public void openBlogStory4() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.openBlogStory4();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://blog.skillfactory.ru/kto-takoj-fullstack-razrabotchik/?"));
    }

    @Test
    public void consultingFormNegativeNameTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.enterUserData("123","test@test.ru","Rwanda", "999123456", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getNameMainPageFormError());
    }

    @Test
    public void consultingFormNegativeEmailTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.enterUserData("Ivan","testtest.ru","Rwanda", "999123456", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getEmailMainPageFormError());
    }

    @Test
    public void consultingFormNegativePhoneTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.enterUserData("Ivan","test@test.ru","Rwanda", "99912", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getPhoneMainPageFormError());
    }

    @Test
    public void consultingFormNegativeAgreementTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.enterUserData("Ivan","test@test.ru","Rwanda", "999123456", false);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getAgreementMainPageFormError());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Иван, susanin@test.ru, Russia, 9997654321, true",
            "Federico, fellini@test.it, Italy, 3331234567, true",
    }, ignoreLeadingAndTrailingWhitespace = true)
    public void consultingFormPositiveTest(String name, String email, String country, String phone, boolean tickAgreement) {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);
        skillfactoryMainPage.openPage();
        GetElementMethods getElementMethods = skillfactoryMainPage.enterUserData(name, email, country, phone, tickAgreement);
        Assertions.assertEquals("", getElementMethods.getNameMainPageFormError());
        Assertions.assertEquals("", getElementMethods.getEmailMainPageFormError());
        Assertions.assertEquals("", getElementMethods.getPhoneMainPageFormError());
        Assertions.assertEquals("", getElementMethods.getAgreementMainPageFormError());
    }

    @AfterEach
    public void closeBrowser() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            driver.close();
        }

    }

}