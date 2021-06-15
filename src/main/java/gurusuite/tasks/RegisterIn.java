package gurusuite.tasks;

import gurusuite.models.Data;
import gurusuite.userinterfaces.GuruHomePage;
import gurusuite.userinterfaces.GuruRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterIn implements Task {

    private List<Data> dataList;

    public RegisterIn(List<Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GuruHomePage.REGISTERBUTTON),
                Enter.theValue(dataList.get(0).getNombre()).into(GuruRegisterPage.NAME_BOX),
                Enter.theValue(dataList.get(0).getApellido()).into(GuruRegisterPage.LASTNAME_BOX),
                Enter.theValue(dataList.get(0).getTelefono()).into(GuruRegisterPage.PHONE_BOX),
                Enter.theValue(dataList.get(0).getEmail()).into(GuruRegisterPage.EMAIL_BOX),
                Enter.theValue(dataList.get(0).getDireccion()).into(GuruRegisterPage.ADDRESS_BOX),
                Enter.theValue(dataList.get(0).getCiudad()).into(GuruRegisterPage.CITY_BOX),
                Enter.theValue(dataList.get(0).getDepartamento()).into(GuruRegisterPage.DEPARTMENT_BOX),
                Enter.theValue(dataList.get(0).getCodigoPostal()).into(GuruRegisterPage.POSTAL_CODE_BOX),
                Enter.theValue(dataList.get(0).getUsuario()).into(GuruRegisterPage.USER_BOX),
                Enter.theValue(dataList.get(0).getContrasena()).into(GuruRegisterPage.PASSWD_BOX),
                Enter.theValue(dataList.get(0).getConfContrasena()).into(GuruRegisterPage.CONF_PASSWD_BOX),
                Click.on(GuruRegisterPage.BTN_FINISH_REGISTER)
        );
    }

    public static RegisterIn GuruPage(List<Data> dataList) {
        return instrumented(RegisterIn.class, dataList);
    }
}
