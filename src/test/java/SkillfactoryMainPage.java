import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillfactoryMainPage {
    private final WebDriver driver;
    private final By nameLocator = By.name("name");
    private final By emailLocator = By.name("email");
    private final By phoneMaskLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[3]/div/div[1]/div[1]");
    private final By phoneLocator = By.name("tildaspec-phone-part[]");
    private final By buttonLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[5]/button");
    private final By checkboxLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[1]/div/label/div");
    private final By allCoursesButtonLocator = By.xpath("//*[@id=\"sbs-456746055-1563735937155\"]");
    private final By freeEventsButtonLocator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[18]/div/a");
    private final By blogStory1 = By.xpath("//*[@id=\"rec456746097\"]/div/div/div[7]/div/a");
    private final By blogStory2 = By.xpath("//*[@id=\"rec456746097\"]/div/div/div[11]/div/a");
    private final By blogStory3 = By.xpath("//*[@id=\"rec456746097\"]/div/div/div[15]/div/a");
    private final By blogStory4 = By.xpath("//*[@id=\"rec456746097\"]/div/div/div[19]/div/a");

    public SkillfactoryMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {

        driver.get("https://skillfactory.ru/");
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

    public GetElementMethods clickAllCourses() {
        driver.findElement(allCoursesButtonLocator).click();
        return new GetElementMethods(driver);
    }
    public GetElementMethods clickFreeEvents() {
        driver.findElement(freeEventsButtonLocator).click();
        return new GetElementMethods(driver);
    }
    public GetElementMethods openBlogStory1() {
        driver.findElement(blogStory1).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods openBlogStory2() {
        driver.findElement(blogStory2).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }
    public GetElementMethods openBlogStory3() {
        driver.findElement(blogStory3).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }
    public GetElementMethods openBlogStory4() {
        driver.findElement(blogStory4).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods enterUserData (String name, String email, String country, String phone, boolean tickAgreement) {
        sendKeysNameField(name);
        sendKeysEmailField(email);
        sendPhoneMask(country);
        sendKeysPhoneField(phone);
        if (tickAgreement == false) {
            agreementToSendPersonalData();
        }
        return clickGetConsultButton();
    }
}