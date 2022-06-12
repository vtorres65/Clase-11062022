package co.edu.sena.ejercicios.clase12.Eje1;

import java.util.Set;
public class Deck {
    private Set<DeckDetails> deckDetails;

    public Deck(Set<DeckDetails> deckDetails) {
        this.deckDetails = deckDetails;
    }
    public void addPokemon(DeckDetails deckDetails) {
        if (!this.deckDetails.contains(deckDetails))
            this.deckDetails.add(deckDetails);
        else
            for (DeckDetails deckDetails1 : this.deckDetails
            ) {
                if (deckDetails1.getPokemon().equals(deckDetails.getPokemon())) {
                    deckDetails1.setAmount(deckDetails1.getAmount() + deckDetails.getAmount());
                }
            }
    }
    public void removePokemon(Pokemon pokemon) {
        DeckDetails remover = null;
        for (DeckDetails details:this.deckDetails){
            if (details.getPokemon().equals(pokemon)){
                remover = details;
            }
        }
        if (remover!=null){
            this.deckDetails.remove(remover);
        }
    }

    public void removeOnePokemon(Pokemon pokemon, int cantidad){
        for (DeckDetails deckDetails1:this.deckDetails){
            if (deckDetails1.getPokemon().getNombre().equals(pokemon.getNombre())){
                deckDetails1.setAmount(deckDetails1.getAmount()-cantidad);
                if (deckDetails1.getAmount()==0){
                    removePokemon(pokemon);
                }
            }else {
                System.out.println("La cantidad ingresada no puede ser mayor");
            }
        }
    }
    public Set<DeckDetails> getDeckDetails() {
        return deckDetails;
    }

    public void setDeckDetails(Set<DeckDetails> deckDetails) {
        this.deckDetails = deckDetails;
    }

}
