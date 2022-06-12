package co.edu.sena.ejercicios.Eje5;

import java.util.ArrayList;
import java.util.List;

public class EjeList {
    public static void main(String[] args) {
        List<Integer> arreglo = new ArrayList<>();
        arreglo.add(2);
        arreglo.add(3);
        arreglo.add(5);
        arreglo.add(6);

        System.out.println(arreglo);

        arreglo.remove(2);
        System.out.println(arreglo);

        List<String> listaNombre = new ArrayList<>();
        listaNombre.add("Enrique");
        listaNombre.add("Jose");
        listaNombre.add("Manuel");
        listaNombre.add("Jaime");
        listaNombre.add("Ana");

        System.out.println(listaNombre);

        listaNombre.remove(4);
        listaNombre.add(0, "Ana");
        System.out.println(listaNombre);

    }
}
