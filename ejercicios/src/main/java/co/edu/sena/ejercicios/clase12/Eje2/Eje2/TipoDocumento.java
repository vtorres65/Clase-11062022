package co.edu.sena.ejercicios.clase12.Eje2.Eje2;

import java.util.Objects;

public class TipoDocumento implements Comparable<TipoDocumento>{
    private long id;
    private String nombre;
    private String apellodo;
    private String sigla;

    public TipoDocumento(long id, String nombre, String apellodo, String sigla){
        this.id = id;
        this.nombre = nombre;
        this.apellodo = apellodo;
        this.sigla = sigla;
    }

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

    public String getApellodo() {
        return apellodo;
    }

    public void setApellodo(String apellodo) {
        this.apellodo = apellodo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocumento documento = (TipoDocumento) o;
        return id == documento.id && Objects.equals(nombre, documento.nombre) && Objects.equals(apellodo, documento.apellodo) && Objects.equals(sigla, documento.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellodo, sigla);
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellodo='" + apellodo + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
    @Override
    public int compareTo(TipoDocumento o){
        if (this.id>o.id)
            return 1;
        else if (this.id<o.id)
            return -1;
        else
            return 0;
    }

}
