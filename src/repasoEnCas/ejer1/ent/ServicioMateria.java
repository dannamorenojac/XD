package repasoEnCas.ejer1.ent;

import java.util.ArrayList;
import java.util.List;

public class ServicioMateria implements CrudMateria{

    private List<Materia> materias = new ArrayList<>();

    @Override
    public List<Materia> leer() {
        return materias;
    }

    @Override
    public Materia buscarMateria(String codigo) {
        for (Materia materia : materias) { //busca en materias una materia
            if (materia.getCodigo().equals(codigo)) {//materia le compara el codigo con el codigo ingresado
                return materia; //si se encontro devuelve la materia sino
            }
        }
        return null;//retorna nulo
    }

    @Override
    public void crearMateria(Materia materia) {
        Materia existente = buscarMateria(materia.getCodigo());
        if (existente == null){
            materias.add(existente);
        }else {
            System.out.println("La materia ya existe, no se puede agregar.");
        }
    }

    @Override
    public void modificarMateria(Materia materia) {
        Materia materiaModificar = buscarMateria(materia.getCodigo());
        if (materiaModificar != null){
            materiaModificar.setCodigo(materia.getCodigo());
            materiaModificar.setNombre(materia.getNombre());
            materiaModificar.setNumCreditos(materia.getNumCreditos());
            materiaModificar.setDescripcion(materia.getDescripcion());
        }
    }

    @Override
    public void eliminarMateria(String codigo) {
        Materia materiaEliminar = buscarMateria(codigo);
        if (materiaEliminar != null){
            materias.remove(materiaEliminar);
        }
    }

}
