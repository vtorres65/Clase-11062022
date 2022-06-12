package co.edu.sena.ejercicios.Eje7;

import java.util.HashSet;
import java.util.Set;

public class Conjunto03 {
    public static void main(String[] args) {
        Set<TipoPerro> perroSet = new HashSet<>();
        perroSet.add(new TipoPerro(1, "Lucas", "pastor"));
        perroSet.add(new TipoPerro(1, "Lucas", "pastor"));
        perroSet.add(new TipoPerro(2, "Tony", "Bull dog"));
        perroSet.add(new TipoPerro(3, "Luna", "criolla"));
        perroSet.add(new TipoPerro(3, "Mily", ""));

        for (TipoPerro tipoPerro : perroSet) {
            System.out.println(perroSet.toString());
        }
    }
}
