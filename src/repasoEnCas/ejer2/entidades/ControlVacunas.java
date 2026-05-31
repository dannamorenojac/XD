package repasoEnCas.ejer2.entidades;

import java.util.*;

public class ControlVacunas implements CrudVacuna {

    Scanner sc = new Scanner(System.in);
    private Set<Mascota> mascotas = new HashSet<>();
    private Map<String, String> vacunas = new HashMap<>();


    @Override
    public void registrarMascota() {
        try {
            System.out.println("---REGISTRAR MASCOTA---");
            System.out.println("Ingrese el codigo: ");
            String codigo = sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el tipo: ");
            String tipo = sc.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            Mascota newMascota = new Mascota(codigo,nombre,tipo,edad);
            if(mascotas.add(newMascota)){
                System.out.println("Mascota registrada correctamente");
            }else{
                System.out.println("La mascota ya existe.");
            }

        }catch (InputMismatchException e){
            System.out.println("La edad debe ser un numero.");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void registrarVacuna() {
        System.out.println("---REGISTRAR VACUNA---");
        System.out.println("Ingrese el codigo de la mascota a vacunar: ");
        String codigo = sc.nextLine();
        boolean existe = false;
        for (Mascota mascota : mascotas) {
            if (mascota.getCodigo().equals(codigo)) {
                existe = true;
                break;
            }
        }
        if(existe) {
            System.out.println("Mascota encontrada se procede con el registro:");
            System.out.println("Codigo de la mascota a vacunar: " + codigo);
            System.out.println("Ingrese el tipo de vacuna: ");
            String tipo = sc.nextLine();
            System.out.println("Vacuna registrada correctamente");
            vacunas.put(codigo, tipo);
        }else {
            System.out.println("La mascota no existe, registrela.");
        }
    }

    @Override
    public void mostrarVacunas() {
        System.out.println("---MOSTRAR VACUNAS---");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
            String vacuna = vacunas.get(mascota.getCodigo());
            if(vacuna != null){
                System.out.println("Vacuna: "+vacuna);
            }else {
                System.out.println("La vacuna no existe.");
            }
            System.out.println("-----------------------------");
        }
    }

    @Override
    public void actualizarVacunas() {
        System.out.println("---ACTUALIZAR VACUNA---");
        System.out.println("Ingrese el codigo de la mascota a actualizar: ");
        String codigo = sc.nextLine();
        if(vacunas.containsKey(codigo)) {
            System.out.println("Vacuna actual: "+vacunas.get(codigo));
            System.out.println("Ingrese el nombre del vacuna a actualizar: ");
            String nuevaVacuna = sc.nextLine();
            vacunas.put(codigo, nuevaVacuna);
            System.out.println("Vacuna actual: "+vacunas.get(codigo));
            System.out.println("vacuna actualizada correctamente");
        }else {
            System.out.println("La vacuna no existe.");
        }
    }

    @Override
    public void eliminarVacunas() {
        System.out.println("---ELIMINAR VACUNA---");
        System.out.println("Ingrese el codigo de la mascota a eliminar: ");
        String codigo = sc.nextLine();
        if(vacunas.containsKey(codigo)) {
            vacunas.remove(codigo);
            System.out.println("Vacuna eliminada correctamente");
        }else  {
            System.out.println("La vacuna no existe.");
        }
    }
}
