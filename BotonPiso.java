public class BotonPiso extends Boton {
    private int numeroPiso;
    private String direccion;

    public BotonPiso(int numeroPiso, String direccion) {
        super();
        this.numeroPiso = numeroPiso;
        this.direccion = direccion.toUpperCase();
    }

    @Override
    public void presionar() {
        iluminado = true;
        System.out.println("[BotonPiso] Piso " + numeroPiso + "  dirección " + direccion + ". Botón iluminado.");
    }
}