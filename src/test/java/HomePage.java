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
        driver.get("https://www.sendwave.com");
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

    public void ourStory() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        WebElement lang = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/nav[1]/div[1]/div[1]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(lang).click().build().perform();
        Thread.sleep(1000);
        WebElement es = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/nav[1]/a[1]"));
        actions.moveToElement(es).click().build().perform();
        Thread.sleep(5000);
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
        Assert.assertEquals(s, "Today's rate: $1.00 = 84.94 BDT with no fees");
    }

    public void changeCountry() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        WebElement flag = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-6']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(flag).perform();
        List<WebElement> flags = driver.findElements(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/nav[1]/li[1]/a[1]"));
        actions.moveToElement(flags.get(1)).click().build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='send-amount']//input[@id='field']")).sendKeys("100");
//        String s = driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[3]")).getText();
//        Assert.assertEquals(s,"Today's rate: $1.00 = 66.14 BDT with no fees");
    }

    public void clickDownloadApp() {
        driver.get("https://www.sendwave.com");
        driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-5']")).click();
        String s = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[3]/nav[1]/a[3]/div[1]")).getText();
        Assert.assertEquals(s, "Scan this QR code with your phone to download our app!");
    }

    public void rightArrow() throws InterruptedException {
        driver.get("https://www.sendwave.com");
        WebElement arrow = driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/div[2]/div[3]"));
        Thread.sleep(10000);
        arrow.click();
        arrow.click();
        arrow.click();
    }

    public void socialMedia() {
        driver.get("https://www.sendwave.com");
        WebElement insta = driver.findElement(By.xpath("//body/div[10]/div[1]/div[1]/div[1]/div[9]/a[1]"));
        insta.click();
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



}
