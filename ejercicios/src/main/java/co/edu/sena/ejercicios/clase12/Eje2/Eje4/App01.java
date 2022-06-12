package co.edu.sena.ejercicios.clase12.Eje2.Eje4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App01 {
    public static void main(String[] args) {
        Map<Long, String> aprendices =new TreeMap<>();
        aprendices.put(123_123_123L, "Jose Miguel");
        aprendices.put(123_123_123L, "Jose Miguel");
        aprendices.put(456_123_123L, "Jose Miguel");
        aprendices.put(789_123_123L, "Jose Miguel");

        Set<Long> llaves= aprendices.keySet();

        for (Long key : llaves){
            System.out.println("Key: "+key);
            System.out.println("value: "+aprendices.get(key));
        }
    }
}
