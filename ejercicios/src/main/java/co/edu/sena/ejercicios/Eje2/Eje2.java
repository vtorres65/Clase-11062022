package co.edu.sena.ejercicios.Eje2;

import java.util.Arrays;
import java.util.List;

public class Eje2 {
    public static void main(String[] args) {
        List<String>listNombre =
                Arrays.asList("Jose", "Pedro", "Miguel", "Ana", "William", "Omar", "Maria");

        // declaraciones funcionales
        listNombre.stream()
                .sorted((o1, o2) ->o1.compareTo(o2)
                ).forEach(x-> System.out.println(x));

        //imperativo estructurado
        for (int i = 0; i <listNombre.size()-1; i++){
            for (int k = i+1; k <listNombre.size(); k ++){
                if (listNombre.get(i).compareTo(listNombre.get(k))>0){
                    String burbuja = listNombre.get(i);
                    listNombre.set(i,listNombre.get(k));
                    listNombre.set(k,burbuja);
                }
            }
        }
        for (String nombre:listNombre){
            System.out.println(nombre);
        }
    }
}
