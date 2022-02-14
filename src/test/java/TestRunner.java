import org.testng.annotations.Test;

public class TestRunner extends Setup {

    HomePage homePage;


    @Test(description = "Get website title")
    public void getTitle() {
        homePage = new HomePage(driver);
        homePage.readTitle();
    }

    @Test(description = "Changing website language")
    public void changeLanguage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.languageDropDown();
    }

    @Test(description = "Go to Our Story page")
    public void ourStoryPage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.ourStory();
    }

    @Test(description = "Go to rating page")
    public void ratingPage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.goToRatingPage();
    }

    @Test(description = "Click on view countries")
    public void availableCountry() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.viewCountries();
    }

    @Test(description = "Check if an image exists")
    public void imageExist() {
        homePage = new HomePage(driver);
        homePage.checkIfImageExist();
    }

    @Test(description = "Checking valid transaction")
    public void validTrans() {
        homePage = new HomePage(driver);
        homePage.validTransaction();
    }

    @Test(enabled = false, description = "Changing country from dropdown") //Not working
    public void countryChange() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.changeCountry();
    }

    @Test(description = "Clicking Download App section")
    public void downloadApp() {
        homePage = new HomePage(driver);
        homePage.clickDownloadApp();
    }

    @Test(description = "Clicking right arrow to swipe pictures")
    public void clickRightArrow() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.rightArrow();
    }

    @Test(description = "Clicking on instagram icon")
    public void clickOnSocialMedia() {
        homePage = new HomePage(driver);
        homePage.socialMedia();
    }

    @Test(description = "Testing the FAQ section")
    public void clickFAQ() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.faqClick();
    }

    @Test(description = "Testing the Contact Us section")
    public void clickOnContactUs() {
        homePage = new HomePage(driver);
        homePage.contactusClick();
    }

    @Test(description = "Checking the customer complain section")
    public void customerComplains() {
        homePage = new HomePage(driver);
        homePage.complains();
    }



}
