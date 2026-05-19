import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPisos = 9;  

        System.out.println("=== Sistema de Ascensor ===");
        System.out.println("Edificio de " + totalPisos + " pisos. Ascensor en piso 1.");

        SistemaControl sistema = new SistemaControl(totalPisos);

        boolean continuar = true;

        while (continuar) {
            System.out.print("\n¿A qué piso deseas ir? ");
            int destino = scanner.nextInt();

            // Validar que el piso exista
            if (destino < 1 || destino > totalPisos) {
                System.out.println("Piso inválido. Elige entre 1 y " + totalPisos + ".");
                continue;
            }

            // Seleccionar destino y procesar
            sistema.irAlPiso(destino);
            System.out.println("" + sistema.getEstado());

            System.out.println("\nHas llegado al piso " + destino + ".");

            System.out.print("¿Deseas ir a otro piso? (s/n): ");
            String resp = scanner.next();

            if (resp.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Fin del sistema.");
            }
        }

        scanner.close();
    }
}