import org.testng.annotations.Test;

public class TestRunner extends Setup {

    HomePage homePage;


   @Test(priority = 0, description = "Get website title")
    public void getTitle() {
        homePage = new HomePage(driver);
        homePage.readTitle();
    }

   @Test(priority = 1,description = "Changing website language")
    public void changeLanguage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.languageDropDown();
    }

    @Test(priority = 2,description = "Go to rating page")
    public void ratingPage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.goToRatingPage();
    }

    @Test(priority = 3,description = "Click on view countries")
    public void availableCountry() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.viewCountries();
    }

    @Test(priority = 4,description = "Check if an image exists")
    public void imageExist() {
        homePage = new HomePage(driver);
        homePage.checkIfImageExist();
    }

    @Test(priority = 5,description = "Checking valid transaction")
    public void validTrans() {
        homePage = new HomePage(driver);
        homePage.validTransaction();
    }

    @Test(priority = 6,enabled = false, description = "Changing country from dropdown") //Not working
    public void countryChange() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.changeCountry();
    }

    @Test(priority = 7,description = "Clicking Download App section")
    public void downloadApp() {
        homePage = new HomePage(driver);
        homePage.clickDownloadApp();
    }

    @Test(priority = 8,description = "Clicking on instagram icon")
    public void clickOnSocialMediaInstagram(){
        homePage = new HomePage(driver);
        homePage.socialMediaInstagram();
    }

    @Test(priority = 9,description = "Clicking on facebook icon")
    public void clickOnSocialMediaFacebook(){
        homePage = new HomePage(driver);
        homePage.socialMediaFacebook();
    }

    @Test(priority = 10,description = "Clicking on linkedln icon")
    public void clickOnSocialMediaLinkedln(){
        homePage = new HomePage(driver);
        homePage.socialMediaLinkedln();
    }

    @Test(priority = 11,description = "Testing the Contact Us section")
    public void clickOnContactUs() {
        homePage = new HomePage(driver);
        homePage.contactusClick();
    }
    @Test(priority = 12,description = "Testing the FAQ section")
    public void clickFAQ() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.faqClick();
    }

   @Test(priority = 13,description = "Checking the customer complain section")
    public void customerComplains() {
        homePage = new HomePage(driver);
        homePage.complains();
    }

    @Test(priority = 14,description = "Checking the  our story page work properly")
    public void checkOurStoryPage() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.ourStory();
    }

    @Test(priority = 15,description = "Checking the security page work properly")
    public void checkWebSecurityPage() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.webSecurity();
    }

    @Test(priority = 16,description = "Checking the career page work properly")
    public void checkCareerPage() throws InterruptedException {

        homePage = new HomePage(driver);
        homePage.careerPage();
    }


}
