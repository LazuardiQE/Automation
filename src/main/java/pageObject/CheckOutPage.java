package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    public static WebDriver webDriver;

    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement CartButton;

    public void clickCartButton() {
        CartButton.click();
    }

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement RemoveSauce;

    public void clickRemoveSauce() {
        RemoveSauce.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
        private WebElement CheckoutButton;

    public void clickRemoveButton(){
        CheckoutButton.click();
    }

    // Untuk pengisian nama, dan postal code
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement FirstName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement LastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement ZipCode;



    //Untuk mengecek ke page selanjutnya
    public boolean verifyCheckoutStepOne(){
        boolean a = FirstName.isDisplayed();
        boolean b = LastName.isDisplayed();
        boolean c = ZipCode.isDisplayed();
        return a && b && c;
    }

    public void inputFirstName(String firstname,String lastname,String zipcode){
        FirstName.sendKeys(firstname);
        LastName.sendKeys(lastname);
        ZipCode.sendKeys(zipcode);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public void clickContinueButton(){
        continueButton.click();
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutOverview;

    public boolean verifyCheckoutOverview(){return checkoutOverview.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement summaryTotal;

    public String verifySummaryTotal(){return summaryTotal.getText();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public void clickFinishButton(){
        finishButton.click();
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement complete;

    public boolean verifyComplete(){
        return complete.isDisplayed();
    }



}
