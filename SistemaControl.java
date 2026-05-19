import java.util.ArrayList;
import java.util.List;

public class SistemaControl {

    private Ascensor ascensor;
    private List<Piso> pisos;

    public SistemaControl(int totalPisos) {
        this.ascensor = new Ascensor(1, totalPisos);
        this.pisos = new ArrayList<>();
        for (int i = 1; i <= totalPisos; i++) {
            pisos.add(new Piso(i));
        }
    }

   public void irAlPiso(int destino) {
    int pisoActual = ascensor.getPisoActual();

    // 1. Usuario presiona botón en el piso para llamar al ascensor
    pisos.get(pisoActual - 1).getBotonSubir().presionar();

    // 2. Presionar botón dentro del ascensor
    ascensor.presionarBoton(destino);

    // 3. Cerrar puertas
    ascensor.cerrarPuerta();
    pisos.get(pisoActual - 1).getPuerta().cerrar();

    // 4. Mover el ascensor
    ascensor.moverA(destino);

    // 5. Abrir puertas al llegar
    ascensor.abrirPuerta();
    pisos.get(destino - 1).getPuerta().abrir();

    // 6. Apagar botones
    ascensor.apagarBoton(destino);
    pisos.get(pisoActual - 1).getBotonSubir().cancelarIluminacion();
}
    

    public String getEstado() {
        return "Ascensor en piso " + ascensor.getPisoActual()+ "  Estado: " + ascensor.getEstado();
    }
}