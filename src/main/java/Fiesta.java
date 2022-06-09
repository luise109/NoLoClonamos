public class Fiesta {

    private int invitados;
    private boolean alcohol;

    public Fiesta() {
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public String permirPaso(int edad, boolean alcohol) {
        if(alcohol == true && edad > 17) {
            return "Pasale pa";
        }
        if (alcohol == false) {
            return "No necesitas ser mayor de edad";
        }
        return "Aun no estas listo para el proyecto X";
    }

    public String invitarProfe(boolean pasar) {
        if(pasar) {
            return "Esta invitado profe Christian :)";
        }
        return "Chale, pasenos profe :(";
    }

    public String calificarFiesta(int invitados) {
        if(invitados < 2 && invitados > 0) {
            return "Consiguete mas amigos pa";
        }
        if(invitados > 50) {
            return "tampoco tienes que invitar a todo el pueblo";
        }
        if(invitados <= 0) {
            return ("Los muertos no valen como invitados");
        }
        return "Que buena fiesta";
    }



}
