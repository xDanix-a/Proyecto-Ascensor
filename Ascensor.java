import java.util.ArrayList;
import java.util.List;

public class Ascensor {

    private int pisoActual;
    private String estado; // "QUIETO", "SUBIENDO", "BAJANDO"
    private PuertaAscensor puerta;
    private List<BotonAscensor> botones;

    public Ascensor(int pisoInicial, int totalPisos) {
        this.pisoActual = pisoInicial;
        this.estado = "QUIETO";
        this.puerta = new PuertaAscensor(1);
        this.botones = new ArrayList<>();
        // Boton por piso
        for (int i = 1; i <= totalPisos; i++) {
            botones.add(new BotonAscensor(i));
        }
    }

    public void moverA(int destino) {
        if (destino == pisoActual) {
            System.out.println("[Ascensor] Ya estás en el piso " + pisoActual + ".");
            return;
        }
        if (destino > pisoActual) {
            estado = "SUBIENDO";
        } else {
            estado = "BAJANDO";
        }
        System.out.println("[Ascensor] " + estado + " del piso " + pisoActual + " al piso " + destino + "...");
        pisoActual = destino;
        estado = "QUIETO";
        System.out.println("[Ascensor] Llegó al piso " + pisoActual + ".");
    }

    public void abrirPuerta() { puerta.abrir(); }
    public void cerrarPuerta() { puerta.cerrar(); }

    public void presionarBoton(int piso) {
        for (BotonAscensor b : botones) {
            if (b.getPisoDestino() == piso) {
                b.presionar();
                return;
            }
        }

    }

    public void apagarBoton(int piso) {
        for (BotonAscensor b : botones) {
            if (b.getPisoDestino() == piso) {
                b.cancelarIluminacion();
                return;
            }
        }
    }

    public int getPisoActual() { return pisoActual; }
    public String getEstado() { return estado; }
}