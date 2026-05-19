public class Puerta {

    protected boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("[Puerta] Puerta abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("[Puerta] Puerta cerrada.");
    }

    public boolean isAbierta() {
        return abierta;
    }
}