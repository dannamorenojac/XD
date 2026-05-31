package repasoEnCas.ejer2.entidades;

import java.util.Objects;

public class Mascota {
    private String codigo;
    private String nombre;
    private String tipo;
    private int edad;

    public Mascota(String codigo, String nombre, String tipo, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.isEmpty()){
            throw new IllegalArgumentException("El codigo es obligatorio, no puede estar vacio");
        }else {
            this.codigo = codigo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty() || nombre.length() < 3){
            throw new IllegalArgumentException("El nombre no puede estar vacio o ser corto.");
        }else {
            this.nombre = nombre;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("perro")||tipo.equalsIgnoreCase("gato") || tipo.equalsIgnoreCase("conejo") || tipo.equalsIgnoreCase("otro")){
            this.tipo = tipo;
        }else{
            throw new IllegalArgumentException("Tipo de mascota no valido");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 20){
            throw new IllegalArgumentException("Edad no valida");
        }else  {
            this.edad = edad;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return Objects.equals(codigo, mascota.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", edad=" + edad +
                '}';
    }
}
