package co.edu.sena.ejercicios.clase12.Eje2.Eje6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilas {
    public static void main(String[] args) {
        Deque<Integer> pila = new ArrayDeque<>();
        pila.push(4);
        pila.push(6);
        pila.push(3);
        pila.push(7);
        pila.push(8);
        pila.push(50);
        pila.push(10);

        for (Integer elemento:pila){
            System.out.println(elemento);
        }
        pila.pop();
        for (Integer elemento:pila){
            System.out.println(elemento);
        }
    }
}
