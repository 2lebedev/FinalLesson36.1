import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class DataSciencePageTest {

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
    public void dataScientistFromNothingToPro() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataScientistFromNothingToPro();
        Assertions.assertEquals("https://skillfactory.ru/data-scientist-pro-mgu", getElementMethods.getUrl());
    }

    @Test
    public void dataScientist() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataScientist();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://skillfactory.ru/data-scientist-pro"));
    }

    @Test
    public void neuralNetworksCourse() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.neuralNetworksCourse();
        Assertions.assertEquals("https://skillfactory.ru/kurs-po-nejronnim-setyam", getElementMethods.getUrl());
    }

    @Test
    public void dataEngineering() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataEngineering();
        Assertions.assertEquals("https://skillfactory.ru/data-engineer", getElementMethods.getUrl());
    }

    @Test
    public void dataScientistIn5months() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataScientistIn5Months();
        Assertions.assertEquals("https://skillfactory.ru/bootcamp-data-science", getElementMethods.getUrl());
    }

    @Test
    public void machineLearningAndNeuralNetworks() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.machineLearningAndNeuralNetworks();
        Assertions.assertEquals("https://skillfactory.ru/machine-learning-i-deep-learning", getElementMethods.getUrl());
    }

    @Test
    public void mathForDataScience() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.mathForDataScience();
        Assertions.assertEquals("https://skillfactory.ru/matematika-dlya-data-science", getElementMethods.getUrl());
    }

    @Test
    public void machineLearningEngineering() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.machineLearningEngineering();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/data-science-machine-learning-urfu?"));
    }

    @Test
    public void dataScience() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataScience();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/data-science-machine-learning-mipt?"));
    }

    @Test
    public void dataScienceSpecialist() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataScienceSpecialist();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/dpo-data-science-machine-learning-mipt?"));
    }

    @Test
    public void analysisInMedicine() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.analysisInMedicine();
        Assertions.assertTrue(getElementMethods.getUrl().contains("https://new.skillfactory.ru/newdata-science-v-medicine-mipt?"));
    }

    @Test
    public void pythonForAnalysis() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.pythonForAnalysis();
        Assertions.assertEquals("https://skillfactory.ru/python-analytics", getElementMethods.getUrl());
    }

    @Test
    public void dataScienceSpecialization() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.dataScienceSpecialization();
        Assertions.assertEquals("https://skillfactory.ru/data-science-specialization", getElementMethods.getUrl());
    }

    @Test
    public void neuralNetworksDeepLearning() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.neuralNetworksDeepLearning();
        Assertions.assertEquals("https://skillfactory.ru/nejronnye-seti-deep-learning", getElementMethods.getUrl());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "Иван, Russia, 9991234567, susanin@test.ru, true",
    }, ignoreLeadingAndTrailingWhitespace = true)
    public void dataSciencePageConsultFormPositiveTest(String name, String country, String phone, String email, boolean tickAgreement) {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.enterUserData(name, country, phone, email, tickAgreement);
        Assertions.assertEquals("", getElementMethods.getNameError());
        Assertions.assertEquals("", getElementMethods.getPhoneError());
        Assertions.assertEquals("", getElementMethods.getEmailError());
        Assertions.assertEquals("", getElementMethods.getAgreementError());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4355, Russia, 9991234567, susanin@test.ru, true",
    }, ignoreLeadingAndTrailingWhitespace = true)
    public void сonsultFormNegativeNameTest(String name, String country, String phone, String email, boolean tickAgreement) {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.enterUserData(name, country, phone, email, tickAgreement);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getNameError());
    }


    @Test
    public void сonsultFormNegativePhoneTest() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.enterUserData("Иван", "Russia", "999123", "susanin@test.ru", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getPhoneError());
    }

    @Test
    public void сonsultFormNegativeEmailTest() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.enterUserData("Иван", "Russia", "9991234567", "susanintest.ru", true);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getEmailError());
    }

    @Test
    public void сonsultFormNegativeAgreementTest() {
        DataSciencePage dataSciencePage = new DataSciencePage(driver);
        dataSciencePage.openPage();
        GetElementMethods getElementMethods = dataSciencePage.enterUserData("Иван", "Russia", "9991234567", "susanin@test.ru", false);
        Assertions.assertEquals("opacity: 0; display: block;", getElementMethods.getAgreementError());
    }

    @AfterEach
    public void closeBrowser() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            driver.close();
        }
    }
}
