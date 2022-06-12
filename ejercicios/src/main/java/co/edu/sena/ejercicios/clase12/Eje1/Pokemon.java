package co.edu.sena.ejercicios.clase12.Eje1;

import java.util.Objects;

public class Pokemon {
    private String nombre;
    private DeckDetails deckDetails;

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DeckDetails getDeckDetails() {
        return deckDetails;
    }

    public void setDeckDetails(DeckDetails deckDetails) {
        this.deckDetails = deckDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(nombre, pokemon.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
