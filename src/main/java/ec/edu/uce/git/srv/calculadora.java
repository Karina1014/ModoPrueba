package ec.edu.uce.git.srv;

public class calculadora {
    private int dato1;
    private int dato2;


    public calculadora (){

    }

    public calculadora(int dato1, int dato2){
        this.dato1 = dato1;
        this.dato2 = dato2;

    }

    //metodos
    public int suma(){
        int suma = this.dato1 + this.dato2;
        return suma;
    }

    public int resta(){
        int resta = this.dato1 - this.dato2;
        return resta;
    }

    public int multplicacion(){
        int multplicacion = this.dato1 * this.dato2;
        return multplicacion;
    }

    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }
}
