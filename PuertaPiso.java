public class PuertaPiso extends Puerta {

    private int numeroPiso;

    public PuertaPiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }

    @Override
    public void abrir() {
        abierta = true;
        System.out.println("[PuertaPiso] Puerta del piso " + numeroPiso + " abierta.");
    }

    @Override
    public void cerrar() {
        abierta = false;
        System.out.println("[PuertaPiso] Puerta del piso " + numeroPiso + " cerrada.");
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }
}