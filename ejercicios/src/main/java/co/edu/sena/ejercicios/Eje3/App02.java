package co.edu.sena.ejercicios.Eje3;

public class App02 {
    public static void main(String[] args) {
        Jaula<Perro> perroJaula = new Jaula<>();
        perroJaula.setAnimal(new Perro());

        Jaula<Gato> gatoJaula = new Jaula<>();
        gatoJaula.setAnimal(new Gato());

        Jaula<Loro> loroJaula = new Jaula<>();
        loroJaula.setAnimal(new Loro());

        Jaula<Conejo> conejoJaula = new Jaula<>();
        conejoJaula.setAnimal(new Conejo());
    }
}
