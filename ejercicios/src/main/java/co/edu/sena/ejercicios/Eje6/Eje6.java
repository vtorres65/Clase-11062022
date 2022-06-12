package co.edu.sena.ejercicios.Eje6;

import java.util.HashSet;
import java.util.Set;

public class Eje6 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(3);
        conjunto.add(4);
        System.out.println(conjunto);
        conjunto.remove(3);
        System.out.println(conjunto);
        System.out.println(conjunto.contains(3));
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto.size());

        Set<String> apellidos = new HashSet<>();
        apellidos.add("lopez");
        apellidos.add("lopez");
        apellidos.add("Mora");
        apellidos.add("Perez");
        apellidos.add("Villalobos");
        System.out.println(apellidos);
        apellidos.remove("Perez");
        System.out.println(apellidos);
        System.out.println(apellidos.contains(2));
    }
}
