public class BotonAscensor extends Boton {

    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super(); // llama al constructor de Boton - iluminado = false
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {   
        iluminado = true;
        System.out.println("[BotonAscensor] Piso " + pisoDestino + " seleccionado. Botón iluminado.");
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
}