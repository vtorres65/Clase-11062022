package co.edu.sena.ejercicios.Eje7;

import co.edu.sena.ejercicios.Eje3.Perro;

import java.util.HashSet;
import java.util.Set;

public class Conjunto02 {
    public static void main(String[] args) {
        Set<TipoDocumento> documentoSet = new HashSet<>();
        documentoSet.add(new TipoDocumento(1, "cedula", "CC"));
        documentoSet.add(new TipoDocumento(1, "cedula", "CI"));
        documentoSet.add(new TipoDocumento(2, "cedula", "CC"));

        for (TipoDocumento tipoDocumento:documentoSet){
            System.out.println(tipoDocumento.toString());
        }
    }
}
