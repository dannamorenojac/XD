package repasoEnCas.ejer1.ent;

import java.util.List;

public interface CrudMateria {
    //Retorno lo que muestran información al cliente
    public List<Materia> leer();
    public Materia buscarMateria(String codigo);

    //Realizan acciones dentro del crud
    public void crearMateria(Materia materia);
    public void modificarMateria(Materia materia);
    public void eliminarMateria(String codigo);

}
