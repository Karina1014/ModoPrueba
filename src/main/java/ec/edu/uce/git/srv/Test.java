package ec.edu.uce.git.srv;

import lombok.Data;
@Data
public class Test {

    public void ModoPrueba() {
        System.out.println("Hola Mundo, mi primer git clone");
        System.out.println("quiubo ");
        System.out.println("ELLA ES ASI JAJA LA NALLE");
        System.out.println("jaja adajdajaj");

        calculadora micalculadora = new calculadora(8,3);
        int suma = micalculadora.suma();
        System.out.println("la suma es --> "+suma);

        estudiante miestudiante = new estudiante(1,"Karina",21,'F',"F");
        estudiante miestudiante1 = new estudiante(2,"Nallely",21,'B',"F");

        System.out.println("RESULTADO --> "+miestudiante);
        System.out.println("RESULTADO --> "+miestudiante1);


        String nuevo ;
        miestudiante.setNombre(miestudiante1.getNombre());
        miestudiante1.setNombre(miestudiante.getNombre());

        System.out.println("ESTUDIANTE 0 "+ miestudiante1.toString());


        System.out.println("ESTUDIANTE 1 "+ miestudiante.toString());
    }



}
