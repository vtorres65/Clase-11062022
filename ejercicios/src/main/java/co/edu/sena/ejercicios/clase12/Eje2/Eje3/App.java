package co.edu.sena.ejercicios.clase12.Eje2.Eje3;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Cliente> clienteSet = new TreeSet<>();
        clienteSet.add(new Cliente(1, "Jaime", "Sanchez"));
        clienteSet.add(new Cliente(1, "Jaime", "Sanchez"));
        clienteSet.add(new Cliente(1, "Miguel", "Sanchez"));
        clienteSet.add(new Cliente(1, "Milena", "Sanchez"));
        clienteSet.add(new Cliente(1, "William", "Sanchez"));

        for (Cliente c: clienteSet){
            System.out.println(c.toString());
        }
    }
}
