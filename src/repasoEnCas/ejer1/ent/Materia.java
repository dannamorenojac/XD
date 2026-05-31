package repasoEnCas.ejer1.ent;

import java.util.Objects;

public class Materia {
    //atributos
    private String codigo;
    private String nombre;
    private String descripcion;
    private int numCreditos;

    //constructor
    public Materia(String codigo, String nombre, String descripcion, int numCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numCreditos = numCreditos;
    }

    //getter y setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return codigo == materia.codigo && Objects.equals(nombre, materia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, descripcion, numCreditos);
    }

    //escritura
    @Override
    public String toString() {
        return "Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numCreditos=" + numCreditos +
                '}';
    }
}
