package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.HomePageElements;

public class HomePage extends PageHelper implements HomePageElements {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = HOME_DROPDOWN)
    WebElement buttonDropDown;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_LOGIN)
    WebElement fieldLogin;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_PROFILE)
    WebElement fieldProfile;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_THE_STORY)
    WebElement fieldTheStory;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_LEARN)
    WebElement fieldLearn;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_BLOG)
    WebElement fieldBlog;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_CONTACT)
    WebElement fieldContact;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_QA)
    WebElement fieldQA;

    @FindBy(xpath = HOME_COOKIES_I_UNDERSTAND)
    WebElement buttonCookiesIUnderstand;

    @FindBy(xpath = HOME_FIELD_SETTINGS)
    WebElement fieldSettings;

    public HomePage clickButtonCookiesIUnderstand(){
        click(buttonCookiesIUnderstand, 5);
        return this;
    }

    public LoginSignUpPage clickDropdownField_Login() {
        clickDropDown();
        click(fieldLogin,3);
        return new LoginSignUpPage(driver);
    }

    public boolean isElementPresent_dropdownFieldProfile() {
        pause(5);
        click(buttonDropDown,3);
        return isElementVisible(fieldProfile,5);
    }

    public boolean isElementPresent_dropdownFieldLogin() {
        click(buttonDropDown,3);
        return isElementVisible(fieldLogin,5);
    }

    public TheStoryPage clickDropDownField_TheStory() {
        clickDropDown();
        click(fieldTheStory, 3);
        return new TheStoryPage(driver);
    }

    public LearnPage clickDropDownField_Learn() {
        clickDropDown();
        click(fieldLearn,5);
        return new LearnPage(driver);
    }

    public BlogPage clickDropDownField_Blog() {
        clickDropDown();
        click(fieldBlog, 3);
        return new BlogPage(driver);
    }

    public ContactPage clickDropDownField_Contact() {
        clickDropDown();
        click(fieldContact, 3);
        return new ContactPage(driver);
    }

    public QAPage clickDropDownField_QA() {
        clickDropDown();
        click(fieldQA,5);
        return new QAPage(driver);
    }

    public ProfilePage clickDropDownField_Profile() {
        pause(5);
        clickDropDown();
        click(fieldProfile,5);
        return new ProfilePage(driver);
    }

    public SettingsPage clickDropDownField_Settings() {
        clickDropDown();
        click(fieldSettings,5);
        return new SettingsPage(driver);
    }
}
