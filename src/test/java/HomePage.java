import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomePage {

    public WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void readTitle() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Send money to Africa and Asia | Sendwave"));
    }

    public void languageDropDown() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        WebElement ourStory = driver.findElement(By.id("w-dropdown-toggle-4"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ourStory).perform();

        Thread.sleep(4000);
    }


    public void goToRatingPage() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
        Thread.sleep(5000);
    }

    public void viewCountries() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        driver.findElement(By.xpath("//div[contains(text(),'View available COUNTRIES')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Bangladesh')]")).click();
        Thread.sleep(5000);
    }

    public void checkIfImageExist() {
        driver.get("https://www.sendwave.com");
        driver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[1]/div[1]/div[5]/img[1]")).isDisplayed();
    }

    public void validTransaction() {
        driver.get("https://www.sendwave.com");
        driver.findElement(By.xpath("//div[@id='send-amount']//input[@id='field']")).sendKeys("100");
        String s = driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[3]")).getText();
        //Assert.assertEquals(s, "Today's rate: $1.00 = 84.95 BDT with no fees");
    }

    public void changeCountry() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        WebElement flag = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-6']"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(flag)).isDisplayed();
        flag.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(flag).perform();
        List<WebElement> flags = driver.findElements(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/nav[1]/li[1]/a[1]"));
        actions.moveToElement(flags.get(1)).click().build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='send-amount']//input[@id='field']")).sendKeys("100");

    }

    public void clickDownloadApp() {
        driver.get("https://www.sendwave.com");
        WebElement app = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-5']"));
        app.click();
        String s = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[3]/nav[1]/a[3]/div[1]")).getText();
        //Assert.assertEquals(s, "Scan this QR code with your phone to download our app!");
    }

    public void socialMediaInstagram(){
        List<WebElement> insta = driver.findElements(By.cssSelector("img"));
        insta.get(46).click();
    }

    public void socialMediaFacebook(){
        //driver.get("https://www.sendwave.com");
        WebElement fac = driver.findElement(By.xpath("//body/div[10]/div[1]/div[1]/div[1]/div[9]/a[2]"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.elementToBeClickable(fac)).isDisplayed();
        fac.click();


    }

    public void faqClick() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        WebElement faq = driver.findElement(By.xpath("//body/div[10]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/a[1]"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(faq)).isDisplayed();
        faq.click();
        driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/*[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/*[1]")).click();
    }

    public void contactusClick() {
        driver.get("https://www.sendwave.com");
        WebElement cu = driver.findElement(By.xpath("//body/div[10]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/a[1]"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(cu)).isDisplayed();
        cu.click();
        String s = driver.findElement(By.xpath("//a[contains(text(),'+1 888 966 8603 (US/CA)')]")).getText();
        Assert.assertEquals(s, "+1 888 966 8603 (US/CA)");
    }

    public void complains() {
        driver.get("https://www.sendwave.com");
        WebElement com = driver.findElement(By.xpath("//body/div[10]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/a[1]"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(com)).isDisplayed();
        com.click();
        String s = driver.findElement(By.xpath("//h3[contains(text(),'Notice Requirements by Geography')]")).getText();
        Assert.assertEquals(s, "Notice Requirements by Geography");
    }

    public void ourStory() throws InterruptedException {
        WebElement lang = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/nav[1]/div[1]/div[1]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(lang).click().build().perform();
        Thread.sleep(1000);
        String ss = driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText();
        //Assert.assertEquals(ss, "Send money to people,\n" + "not fees.");
    }

    public void webSecurity() throws InterruptedException {
        WebElement lang1 = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/nav[1]/div[1]/div[2]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(lang1).click().build().perform();
        Thread.sleep(1000);
        String txt1 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText();
        //Assert.assertEquals(txt1, "Why Trust Sendwave");
    }

    public void careerPage() throws InterruptedException {
        WebElement lang2 = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/nav[1]/div[1]/div[4]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(lang2).click().build().perform();
        Thread.sleep(1000);
        String txt2 = driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/h1[1]")).getText();
        //Assert.assertEquals(txt2, "Join us at\n"+"Sendwave");
    }


}
