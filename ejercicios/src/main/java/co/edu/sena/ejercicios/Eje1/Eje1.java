package co.edu.sena.ejercicios.Eje1;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Eje1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(67,4,3,8,12);

        lista.stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                }).
                forEach((Integer x)-> System.out.println(x));

        lista.stream()
                .sorted(((o1, o2) -> o1 -o2)).
                forEach((Integer x)-> System.out.println(x));

        lista.stream().forEach(numero ->
                System.out.println(numero %2 == 0 ? numero + "es par" : numero + "es impar"));

        lista.stream().forEach(
                numero ->{
                    if (numero%2 == 0){
                        System.out.println(numero+ "es par");
                    }else{
                        System.out.println(numero+ "es impar");
                    }
                });
        lista.stream().forEach(
                numero ->{
                    String primo=" es primo";
                    for (int i = 2; i < numero; i++){
                        if (numero%i==0){
                            primo=" no es primo";
                        }
                    }
                    System.out.println(numero+" "+primo);
                });
    }

    public static boolean esPar(int numero){
        return numero%2==0;
    }

}
