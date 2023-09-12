package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface HomePageElements {

    String HOME_DROPDOWN = "//div[@id='nav-icon']";

    String HOME_COOKIES_I_UNDERSTAND = "//div[@class='cookie__floating__buttons']/button[2]";
    String HOME_DROPDOWN_FIELD_LOGIN = "//div[text()='Login']";
    String HOME_DROPDOWN_FIELD_PROFILE = "//div[text()='Profile']";

    String HOME_DROPDOWN_FIELD_SETTINGS = "//div[text()=' Settings ']";

    String HOME_DROPDOWN_FIELD_QA = "//div[text()='Q & A']";

    String HOME_DROPDOWN_FIELD_CONTACT = "//div[text()='Contact']";

    String HOME_DROPDOWN_FIELD_BLOG = "//div[text()='Blog']";

    String HOME_DROPDOWN_FIELD_LEARN = "//div[text()='Learn']";

    String HOME_DROPDOWN_FIELD_THE_STORY = "//div[text()='The Story']";

    String HOME_DROPDOWN_FIELD_THE_HOME = "//div[text()='Home']";

    String HOME_FIELD_SETTINGS = "//div[contains(text(),'Settings')]";


}
