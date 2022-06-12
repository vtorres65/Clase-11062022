package co.edu.sena.ejercicios.Eje7;

import java.util.Objects;

public class TipoDocumento {
    private long id;

    private String nombre;

    private String sigla;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public TipoDocumento(long id, String nombre, String sigla) {
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocumento that = (TipoDocumento) o;
        return id == that.id && nombre.equals(that.nombre) && sigla.equals(that.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, sigla);
    }
}
