package co.edu.sena.ejercicios.clase12.Eje1;

import java.util.Objects;
public class DeckDetails {
    private Deck deck;
    private Pokemon pokemon;
    private int amount;

    public DeckDetails(Pokemon pokemon, int amount) {
        this.pokemon = pokemon;
        this.amount = amount;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeckDetails that = (DeckDetails) o;
        return Objects.equals(pokemon, that.pokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemon);
    }

    @Override
    public String toString() {
        return "DeckDetails{" +
                "pokemon=" + pokemon +
                ", amount=" + amount +
                '}';
    }
}
