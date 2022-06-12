package co.edu.sena.ejercicios.clase12.Eje2.Eje2;

import java.util.Set;
import java.util.TreeSet;

public class App01 {
    public static void main(String[] args) {
        Set<TipoDocumento> tipoDocumentoSet = new TreeSet<>();
        tipoDocumentoSet.add(new TipoDocumento(2, "Maria", "Cruz","CC"));
        tipoDocumentoSet.add(new TipoDocumento(1, "Carlos", "Sanchez", "CE"));
        tipoDocumentoSet.add(new TipoDocumento(1, "Carlos", "Sanchez", "CE"));
        tipoDocumentoSet.add(new TipoDocumento(3, "Yenny", "Lopez", "CC"));
        tipoDocumentoSet.add(new TipoDocumento(3, "Yenny", "Lopez", "CC"));

        for (TipoDocumento documento:tipoDocumentoSet){
            System.out.println(documento.toString());
        }
    }
}
