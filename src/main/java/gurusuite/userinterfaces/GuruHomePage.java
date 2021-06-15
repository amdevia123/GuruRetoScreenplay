package gurusuite.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")

public class GuruHomePage extends PageObject {

    public static final Target REGISTERBUTTON = Target.the("Register Button").locatedBy("//a[contains(text(),'REGISTER')]");

    public static final Target USER_BOX = Target.the("User Box").locatedBy("//tbody/tr[2]/td[2]/input[1]");

    public static final Target PASSWD_BOX = Target.the("Passwd Box").locatedBy("//tbody/tr[3]/td[2]/input[1]");

    public static final Target BTN_LOG_IN = Target.the("Log In Button").locatedBy("//tbody/tr[4]/td[2]/div[1]/input[1]");

}
