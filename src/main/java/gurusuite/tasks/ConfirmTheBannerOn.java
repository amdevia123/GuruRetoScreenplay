package gurusuite.tasks;

import gurusuite.userinterfaces.GuruLogInComplete;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmTheBannerOn implements Task {

    private String banner;

    public ConfirmTheBannerOn(String banner) {
        this.banner = banner;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(GuruLogInComplete.BANNER_LOGIN_SUCCESS).text().isEqualTo(banner)
        );
    }

    public static ConfirmTheBannerOn GuruPage(String banner) {
        return instrumented(ConfirmTheBannerOn.class, banner);
    }

}
