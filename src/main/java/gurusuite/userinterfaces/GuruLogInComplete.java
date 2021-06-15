package gurusuite.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GuruLogInComplete extends PageObject {

    public static final Target BANNER_LOGIN_SUCCESS = Target.the("Banner Log In Success").locatedBy("//h3[contains(text(),'Successfully')]");
}
