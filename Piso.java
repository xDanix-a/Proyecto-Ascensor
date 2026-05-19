public class Piso {

    private int numero;
    private PuertaPiso puerta;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero) {
        this.numero = numero;
        this.puerta = new PuertaPiso(numero);
        this.botonSubir = new BotonPiso(numero, "SUBIR");
        this.botonBajar = new BotonPiso(numero, "BAJAR");
    }

    public int getNumero() { return numero; }
    public PuertaPiso getPuerta() { return puerta; }
    public BotonPiso getBotonSubir() { return botonSubir; }
    public BotonPiso getBotonBajar() { return botonBajar; }
}