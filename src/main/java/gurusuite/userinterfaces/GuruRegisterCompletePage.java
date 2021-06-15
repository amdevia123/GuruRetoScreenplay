package gurusuite.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GuruRegisterCompletePage extends PageObject {

    public static final Target BTN_SIGN_OFF = Target.the("Sign Off Button").locatedBy("//a[contains(text(),'SIGN-OFF')]");
}
