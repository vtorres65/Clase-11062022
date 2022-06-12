package co.edu.sena.ejercicios.Eje3;

public class ClaseGenericosDos <T1, T2>{

    private T1 atributo1;

    private T2 atributo2;

    public T1 getAtributo1(){
        return atributo1;
    }

    public T2 getAtributo2(){
        return atributo2;
    }

    public void SetAtributo1(T1 atributo1){
        this.atributo1 = atributo1;
    }

    public void setAtributo2(T2 atributo2){
        this.atributo2 = atributo2;
    }


}
