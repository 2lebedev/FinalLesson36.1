import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetElementMethods {
    private final WebDriver driver;
    private final By subscribeEmailErrorLocator = By.xpath("//*[@id=\"form298827602\"]/div[2]/div[1]/div/div");
    private final By subscribeAgreementErrorLocator = By.xpath("//*[@id=\"form298827602\"]/div[2]/div[2]/div/div");
    private final By successTextLocator = By.xpath("//*[@id=\"form456746058\"]/div[1]");
    private final By nameErrorLocator = By.xpath("//*[@id=\"form540013577\"]/div[2]/div[1]/div/div");
    private final By phoneErrorLocator = By.xpath("//*[@id=\"form540013577\"]/div[2]/div[2]/div/div[2]");
    private final By emailErrorLocator = By.xpath("//*[@id=\"form540013577\"]/div[2]/div[3]/div/div");
    private final By agreementErrorLocator = By.xpath("//*[@id=\"form540013577\"]/div[2]/div[4]/div/div");
    private final By nameMainPageFormLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[1]/div/div");
    private final By emailMainPageFormLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[2]/div/div");
    private final By phoneMainPageFormLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[3]/div/div[2]");
    private final By agreementMainPageFormLocator = By.xpath("//*[@id=\"form456746058\"]/div[2]/div[1]/div/div");

    public GetElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public String getSubscribeEmailError() {
        return driver.findElement(subscribeEmailErrorLocator).getAttribute("style");
    }
    public String getSubscribeAgreementError() {
        return driver.findElement(subscribeAgreementErrorLocator).getAttribute("style");
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
    public String getNameError() {
        return driver.findElement(nameErrorLocator).getAttribute("style");
    }
    public String getPhoneError() {
        return driver.findElement(phoneErrorLocator).getAttribute("style");
    }
    public String getEmailError() {
        return driver.findElement(emailErrorLocator).getAttribute("style");
    }
    public String getAgreementError() {
        return driver.findElement(agreementErrorLocator).getAttribute("style");
    }
    public String getNameMainPageFormError() {
        return driver.findElement(nameMainPageFormLocator).getAttribute("style");
    }
    public String getEmailMainPageFormError() {
        return driver.findElement(emailMainPageFormLocator).getAttribute("style");
    }
    public String getPhoneMainPageFormError() {
        return driver.findElement(phoneMainPageFormLocator).getAttribute("style");
    }
    public String getAgreementMainPageFormError() {
        return driver.findElement(agreementMainPageFormLocator).getAttribute("style");
    }

}