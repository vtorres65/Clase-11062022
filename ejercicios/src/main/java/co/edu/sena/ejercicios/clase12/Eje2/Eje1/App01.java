package co.edu.sena.ejercicios.clase12.Eje2.Eje1;

import java.util.Set;
import java.util.TreeSet;

public class App01 {
    public static void main(String[] args) {
        Set<Integer> conjuntoOrdenado = new TreeSet<>();
        conjuntoOrdenado.add(6);
        conjuntoOrdenado.add(10);
        conjuntoOrdenado.add(22);
        conjuntoOrdenado.add(9);
        conjuntoOrdenado.add(70);
        conjuntoOrdenado.add(5);
        conjuntoOrdenado.add(6);

        for (Integer s: conjuntoOrdenado){
            System.out.println(s);
        }

        Set<String> setNombre = new TreeSet<>();
        setNombre.add("Camila");
        setNombre.add("Omar");
        setNombre.add("Jaime");
        setNombre.add("Maria");
        setNombre.add("Juan");
        setNombre.add("Pedro");
        setNombre.add("Camila");

        for (String nombre: setNombre){
            System.out.println(nombre);
        }
    }
}
