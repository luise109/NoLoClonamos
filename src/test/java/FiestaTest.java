import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FiestaTest {
    Fiesta fiesta = new Fiesta();

    @Test
    public void givenYongerAge_whenHaveAlcohol_thenAllOk() {
        String result = fiesta.permirPaso(0, true);
        Assertions.assertEquals("Aun no estas listo para el proyecto X", result);
    }

    @Test
    public void givenNotAlcohol_whenGoParty_thenAllOk() {
        String result = fiesta.permirPaso(15, false);
        Assertions.assertEquals("No necesitas ser mayor de edad", result);
    }

    @Test
    public void givenNoOneGuests_whenMakeParty_thenAllOk() {
        String result = fiesta.calificarFiesta(0);
        Assertions.assertEquals("Los muertos no valen como invitados", result);
    }
    
    @Test
    public void givenMuchPeople_whenMakeParty_themAllOK() {
        String result = fiesta.calificarFiesta(60);
        Assertions.assertEquals("tampoco tienes que invitar a todo el pueblo", result);
    }
    
    @Test
    public void givenFewPeople_whenMakeParty_thenAllOK() {
        String result = fiesta.calificarFiesta(1);
        Assertions.assertEquals("Consiguete mas amigos pa", result);
    }

    @Test
    public void givenAprovated_whenSendHomework_thenAllok() {
        String result = fiesta.invitarProfe(true);
        Assertions.assertEquals("Esta invitado profe Christian :)", result);
    }

    @Test
    public void givenNotAprovated_whenSendHomework_thenAllok() {
        String result = fiesta.invitarProfe(false);
        Assertions.assertEquals("Chale, pasenos profe :(", result);
    }
    
}