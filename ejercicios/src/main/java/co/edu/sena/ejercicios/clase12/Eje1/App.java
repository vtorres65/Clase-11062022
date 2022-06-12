package co.edu.sena.ejercicios.clase12.Eje1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Deck deckAsh = new Deck(new HashSet<>());
        deckAsh.addPokemon(new DeckDetails(new Pokemon("pikachu"),1));
        deckAsh.addPokemon(new DeckDetails(new Pokemon("pikachu"),1));
        deckAsh.addPokemon(new DeckDetails(new Pokemon("pikachu"),1));
        deckAsh.addPokemon(new DeckDetails(new Pokemon("sharizar"),1));
        deckAsh.addPokemon(new DeckDetails(new Pokemon("sharizar"),1));

        for (DeckDetails deckDetails:deckAsh.getDeckDetails()
        ) {
            System.out.println(deckDetails.toString());
        }
        deckAsh.removePokemon(new Pokemon("pikache"));

        for (DeckDetails deckDetails:deckAsh.getDeckDetails()
        ) {
            System.out.println("--------------------------");
            System.out.println(deckDetails.toString());
        }
        deckAsh.removeOnePokemon(new Pokemon("sharizar"),1);

        for (DeckDetails deckDetails:deckAsh.getDeckDetails()
        ) {
            System.out.println("--------------------------remove one");
            System.out.println(deckDetails.toString());
        }
    }
}
