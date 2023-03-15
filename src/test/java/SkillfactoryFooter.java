import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillfactoryFooter {
    private final WebDriver driver;
    private final By footerPhone1Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[3]/div/a[1]");
    private final By footerPhone2Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[3]/div/text()[1]");
    private final By footerEmailLocator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[3]/div/a[2]");
    private final By prEmailLocator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[3]/div/text()[3]");
    private final By schoolProgrammingPhone1Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[80]/div/a");
    private final By schoolProgrammingPhone2Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[81]/div/a");
    private final By schoolAnalysisPhone1Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[83]/div/a");
    private final By schoolAnalysisPhone2Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[84]/div/a");
    private final By schoolAnalysisPhone3Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[85]/div/a");
    private final By schoolAnalysisPhone4Locator = By.xpath("//*[@id=\"rec298827602\"]/div/div/div[86]/div/a");
    private final By checkboxSubscribeLocator = By.xpath("//*[@id=\"form298827602\"]/div[2]/div[2]/div/label/div");
    private final By subscribeFormLocator = By.xpath("//*[@id=\"form298827602\"]/div[2]/div[1]/div/input");
    private final By subscribeButtonLocator = By.xpath("//*[@id=\"form298827602\"]/div[2]/div[4]/button");


    public void sendKeysSubscribeEmailField(String email) {

        driver.findElement(subscribeFormLocator).sendKeys(email);
    }
    public GetElementMethods clickSubscribeButton() {
        driver.findElement(subscribeButtonLocator).click();
        return new GetElementMethods(driver);
    }
    public void subscribeAgreementToSendPersonalData()  {

        driver.findElement(checkboxSubscribeLocator).click();
    }
    public SkillfactoryFooter (WebDriver driver) {

        this.driver = driver;
    }
    public void openPage() {

        driver.get("https://skillfactory.ru/");
    }
    public String footerPhone1() {
        String phoneLink = driver.findElement(footerPhone1Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerPhone2() {
        String phoneLink = driver.findElement(footerPhone2Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerEmail() {
        String mailTo = driver.findElement(footerEmailLocator).getAttribute("href");
        return mailTo;
    }
    public String footerPREmail() {
        String mailTo = driver.findElement(prEmailLocator).getAttribute("href");
        return mailTo;
    }
    public String footerSchoolProgPhone1() {
        String phoneLink = driver.findElement(schoolProgrammingPhone1Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerSchoolProgPhone2() {
        String phoneLink = driver.findElement(schoolProgrammingPhone2Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerAnalysisPhone1() {
        String phoneLink = driver.findElement(schoolAnalysisPhone1Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerAnalysisPhone2() {
        String phoneLink = driver.findElement(schoolAnalysisPhone2Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerAnalysisPhone3() {
        String phoneLink = driver.findElement(schoolAnalysisPhone3Locator).getAttribute("href");
        return phoneLink;
    }
    public String footerAnalysisPhone4() {
        String phoneLink = driver.findElement(schoolAnalysisPhone4Locator).getAttribute("href");
        return phoneLink;
    }

    public GetElementMethods subscribeForm (String email, boolean subscribeAgreement) {
        sendKeysSubscribeEmailField(email);
        if (subscribeAgreement == false) {
            subscribeAgreementToSendPersonalData();
        }
        return clickSubscribeButton();
    }

}
