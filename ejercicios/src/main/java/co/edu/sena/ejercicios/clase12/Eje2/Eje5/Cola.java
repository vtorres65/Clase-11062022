package co.edu.sena.ejercicios.clase12.Eje2.Eje5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Cola {
    public static void main(String[] args) {
        Deque<String> colaBanco = new ArrayDeque<>();
        colaBanco.push("Jose");
        colaBanco.push("Miguel");
        colaBanco.push("Ana");
        colaBanco.push("Will");

        for (String persona: colaBanco){
            System.out.println(persona);
        }
        colaBanco.remove();
        for (String persona: colaBanco){
            System.out.println(persona);
        }
    }
}
