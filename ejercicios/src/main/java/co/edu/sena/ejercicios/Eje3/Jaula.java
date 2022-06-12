package co.edu.sena.ejercicios.Eje3;

public class Jaula<T extends Animal> {

    private T animal;

    public Jaula(){
    }

    public Jaula(T animal){
        this.animal = animal;
    }

    public T getAnimal(){
        return animal;
    }

    public void setAnimal(T animal){
        this.animal = animal;
    }
}
