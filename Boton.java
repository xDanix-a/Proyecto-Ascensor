public class Boton {

    protected boolean iluminado;

    public Boton() {
        this.iluminado = false;
    }

    public void presionar() {
        iluminado = true;
        System.out.println("[Boton] Botón presionado.");
    }

    public void cancelarIluminacion() {
        iluminado = false;
        System.out.println("[Boton] Iluminación apagada.");
    }

    public boolean isIluminado() {
        return iluminado;
    }
}

