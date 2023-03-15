import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataSciencePage {
    private final WebDriver driver;
    private final By dataScientistFromNothingToProLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[103]/a");
    private final By dataScientistLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[140]/a");
    private final By neuralNetworksCourseLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[128]/a");
    private final By dataEngineeringLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[23]/a");
    private final By dataScientistIn5MonthsLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[165]/a");
    private final By machineLearningAndNeuralNetworksLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[24]/a");
    private final By mathForDataScienceLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[91]/a");
    private final By machineLearningEngineeringLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[25]/a");
    private final By dataScienceLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[22]/a");
    private final By dataScienceSpecialistLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[75]/a");
    private final By analysisInMedicineLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[74]/a");
    private final By pythonForAnalysisLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[79]/a");
    private final By dataScienceSpecializationLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[116]/a");
    private final By neuralNetworksDeepLearningLocator = By.xpath("//*[@id=\"rec520541813\"]/div/div/div[26]/a");
    private final By nameLocator = By.name("name");
    private final By phoneMaskLocator = By.xpath("//*[@id=\"form540013577\"]/div[2]/div[2]/div/div[1]/div[1]");
    private final By phoneLocator = By.name("tildaspec-phone-part[]");
    private final By emailLocator = By.name("email");
    private final By checkboxLocator = By.xpath("//*[@id=\"form540013577\"]/div[2]/div[4]/div/label/div");
    private final By buttonLocator = By.className("t-submit");

    public DataSciencePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://skillfactory.ru/courses/data-science");
    }

    public GetElementMethods dataScientistFromNothingToPro() {
        driver.findElement(dataScientistFromNothingToProLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataScientist() {
        driver.findElement(dataScientistLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods neuralNetworksCourse() {
        driver.findElement(neuralNetworksCourseLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataEngineering() {
        driver.findElement(dataEngineeringLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataScientistIn5Months() {
        driver.findElement(dataScientistIn5MonthsLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods machineLearningAndNeuralNetworks() {
        driver.findElement(machineLearningAndNeuralNetworksLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods mathForDataScience() {
        driver.findElement(mathForDataScienceLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods machineLearningEngineering() {
        driver.findElement(machineLearningEngineeringLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataScience() {
        driver.findElement(dataScienceLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataScienceSpecialist() {
        driver.findElement(dataScienceSpecialistLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods analysisInMedicine() {
        driver.findElement(analysisInMedicineLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods pythonForAnalysis() {
        driver.findElement(pythonForAnalysisLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataScienceSpecialization() {
        driver.findElement(dataScienceSpecializationLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods neuralNetworksDeepLearning() {
        driver.findElement(neuralNetworksDeepLearningLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public void sendKeysNameField(String name) {

        driver.findElement(nameLocator).sendKeys(name);
    }

    public void sendKeysEmailField(String email) {

        driver.findElement(emailLocator).sendKeys(email);
    }

    public GetElementMethods sendPhoneMask(String country) {
        driver.findElement(phoneMaskLocator).click();
        driver.findElement(By.xpath("//div[contains(text(),'" +country+ "')]")).click();
        return new GetElementMethods(driver);
    }

    public void sendKeysPhoneField(String phone) {

        driver.findElement(phoneLocator).sendKeys(phone);
    }

    public void agreementToSendPersonalData()  {

        driver.findElement(checkboxLocator).click();
    }

    public GetElementMethods clickGetConsultButton() {
        driver.findElement(buttonLocator).click();
        return new GetElementMethods(driver);
    }

    public GetElementMethods enterUserData (String name, String country, String phone, String email, boolean tickAgreement) {
        sendKeysNameField(name);
        sendPhoneMask(country);
        sendKeysPhoneField(phone);
        sendKeysEmailField(email);
        if (tickAgreement == false)
        {
            agreementToSendPersonalData();
        }
        return clickGetConsultButton();
    }
}
