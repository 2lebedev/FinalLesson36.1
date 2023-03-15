import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SkillfactoryNav {
    private final WebDriver driver;
    private final By onlineCourses = By.xpath("//a[contains(text(),'Онлайн-курсы')]");
    private final By allCoursesLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[1]/div/a");
    private final By dataScienceLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[2]/div/a");
    private final By dataAnalysisLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[3]/div/a");
    private final By programmingLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[4]/div/a");
    private final By pythonLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[5]/div/a");
    private final By intensiveLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[6]/div/a");
    private final By frontendLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[7]/div/a");
    private final By backendLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[8]/div/a");
    private final By testingLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[9]/div/a");
    private final By applicationsLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[10]/div/a");
    private final By webSecurityLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[11]/div/a");
    private final By networkInfrastructureLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[12]/div/a");
    private final By gameDevelopmentLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[13]/div/a");
    private final By marketingLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[14]/div/a");
    private final By designLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[15]/div/a");
    private final By managementLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[16]/div/a");
    private final By higherEducationLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[17]/div/a");
    private final By websiteDevelopmentLocator = By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[18]/div/a");
    private final By menuFreeLocator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[41]/a");
    private final By menuCorporateTrainingLocator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[42]/a");
    private final By menuCooperationLocator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[44]/a");
    private final By menuBlogLocator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[43]/a");
    private final By menuPhone1Locator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[39]/div/a");
    private final By menuPhone2Locator = By.xpath("//*[@id=\"rec456746055\"]/div/div/div[40]/div/a");


    public SkillfactoryNav(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage() {

        driver.get("https://skillfactory.ru/");
    }

    public GetElementMethods allCourses() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(allCoursesLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataScience() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(dataScienceLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods dataAnalysis() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(dataAnalysisLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods programming() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(programmingLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods python() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(pythonLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods intensive() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(intensiveLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods frontend() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(frontendLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods backend() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(backendLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods testing() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(testingLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods applications() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(applicationsLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods webSecurity() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(webSecurityLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods networkInfrastructure() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(networkInfrastructureLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods gameDevelopment() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(gameDevelopmentLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods marketing() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(marketingLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods design() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(designLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods management() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(managementLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods higherEducation() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(higherEducationLocator)).click().build().perform();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public GetElementMethods websiteDevelopment() {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(onlineCourses);
        action.moveToElement(we).moveToElement(driver.findElement(websiteDevelopmentLocator)).click().build().perform();
        return new GetElementMethods(driver);
    }

    public GetElementMethods menuFree() {
        driver.findElement(menuFreeLocator).click();
        return new GetElementMethods(driver);
    }

    public GetElementMethods menuCorporateTraining() {
        driver.findElement(menuCorporateTrainingLocator).click();
        return new GetElementMethods(driver);
    }

    public GetElementMethods menuCooperation() {
        driver.findElement(menuCooperationLocator).click();
        return new GetElementMethods(driver);
    }

    public GetElementMethods menuBlog() {
        driver.findElement(menuBlogLocator).click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        return new GetElementMethods(driver);
    }

    public String menuPhone1() {
        String phoneLink = driver.findElement(menuPhone1Locator).getAttribute("href");
        return phoneLink;
    }

    public String menuPhone2() {
        String phoneLink = driver.findElement(menuPhone2Locator).getAttribute("href");
        return phoneLink;
    }
}