public class PuertaAscensor extends Puerta {

    private int nAscensor;

    public PuertaAscensor(int nAscensor) {
        super();
        this.nAscensor = nAscensor;
    }

    @Override
    public void abrir() {
        abierta = true;
        System.out.println("[PuertaAscensor] Puerta de la cabina abierta.");
    }

    @Override
    public void cerrar() {
        abierta = false;
        System.out.println("[PuertaAscensor] Puerta de la cabina cerrada.");
    }

    public int getnAscensor() {
        return nAscensor;
    }
}