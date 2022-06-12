package co.edu.sena.ejercicios.Eje7;

import java.util.Objects;

public class TipoPerro {
    public int id;
    private String nombre;

    private String raza;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoPerro tipoPerro = (TipoPerro) o;
        return id == tipoPerro.id && nombre.equals(tipoPerro.nombre) && raza.equals(tipoPerro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, raza);
    }

    @Override
    public String toString() {
        return "TipoPerro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    public TipoPerro(int id, String nombre, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }
}
