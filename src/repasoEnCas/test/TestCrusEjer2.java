package repasoEnCas.test;

import repasoEnCas.ejer2.entidades.ControlVacunas;

import java.util.Scanner;

public class TestCrusEjer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlVacunas control = new ControlVacunas();
        int op;
        do {
            System.out.println("\n---- SISTEMA DE CONTROL DE VACUNAS ----");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Registrar vacuna");
            System.out.println("3. Mostrar vacunas");
            System.out.println("4. Actualizar vacuna");
            System.out.println("5. Eliminar vacuna");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    control.registrarMascota();
                    break;
                case 2:
                    control.registrarVacuna();
                    break;
                case 3:
                    control.mostrarVacunas();
                    break;
                case 4:
                    control.actualizarVacunas();
                    break;
                case 5:
                    control.eliminarVacunas();
                    break;
                case 6:
                    System.out.println("saliedno del sistema...");;
                    break;
                default:
                    System.out.println("Opcion NO valida.");
            }

        }while (op!=6);
        sc.close();
    }
}
