package gurusuite.tasks;

import gurusuite.models.Data;
import gurusuite.userinterfaces.GuruHomePage;
import gurusuite.userinterfaces.GuruRegisterCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    private List<Data> dataList;

    public LogIn(List<Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GuruRegisterCompletePage.BTN_SIGN_OFF),
                Enter.theValue(dataList.get(0).getUsuario()).into(GuruHomePage.USER_BOX),
                Enter.theValue(dataList.get(0).getContrasena()).into(GuruHomePage.PASSWD_BOX),
                Click.on(GuruHomePage.BTN_LOG_IN)
        );
    }

    public static LogIn GuruPage(List<Data> dataList) {
        return instrumented(LogIn.class, dataList);
    }


}
