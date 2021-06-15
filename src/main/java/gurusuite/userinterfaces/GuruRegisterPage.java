package gurusuite.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GuruRegisterPage extends PageObject {

    public static final Target NAME_BOX = Target.the("Name Box").locatedBy("//tbody/tr[2]/td[2]/input[1]");

    public static final Target LASTNAME_BOX = Target.the("Lastname Box").locatedBy("//tbody/tr[3]/td[2]/input[1]");

    public static final Target PHONE_BOX = Target.the("Phone Box").locatedBy("//tbody/tr[4]/td[2]/input[1]");

    public static final Target EMAIL_BOX = Target.the("Email Box").locatedBy("//input[@id='userName']");

    public static final Target ADDRESS_BOX = Target.the("Address Box").locatedBy("//tbody/tr[7]/td[2]/input[1]");

    public static final Target CITY_BOX = Target.the("City Box").locatedBy("//tbody/tr[8]/td[2]/input[1]");

    public static final Target DEPARTMENT_BOX = Target.the("Department Box").locatedBy("//tbody/tr[9]/td[2]/input[1]");

    public static final Target POSTAL_CODE_BOX = Target.the("Postal Code Box").locatedBy("//input[@name='postalCode']");

    public static final Target USER_BOX = Target.the("User Box").locatedBy("//input[@id='email']");

    public static final Target PASSWD_BOX = Target.the("Passwd Box").locatedBy("//tbody/tr[14]/td[2]/input[1]");

    public static final Target CONF_PASSWD_BOX = Target.the("Conf Passwd Box").locatedBy("//tbody/tr[15]/td[2]/input[1]");

    public static final Target BTN_FINISH_REGISTER = Target.the("Finish Register Button").locatedBy("//input[@name='submit']");



}
