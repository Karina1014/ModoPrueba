package ec.edu.uce.git.srv;

public class estudiante {

    private int id;
    private String nombre;
    private int edad;
    private Character paralelo;
    private String genero;
    private boolean estaMatriculado;

    public estudiante(int id, String nombre, int edad, Character paralelo, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.paralelo = paralelo;
        this.genero = genero;
        this.estaMatriculado = false;

    }

    public estudiante(int id, String nombre, int edad, Character paralelo, String genero, boolean estaMatriculado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.paralelo = paralelo;
        this.genero = genero;
        this.estaMatriculado = estaMatriculado;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Character getParalelo() {
        return paralelo;
    }

    public void setParalelo(Character paralelo) {
        this.paralelo = paralelo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstaMatriculado() {
        return estaMatriculado;
    }

    public void setEstaMatriculado(boolean estaMatriculado) {
        this.estaMatriculado = estaMatriculado;
    }

    @Override
        public String toString() {
            return "id: "+id
                    + " nombre: " + nombre
                    + " edad: " + edad
                    + " paralelo: " + paralelo
                    + " genero: " + genero
                    + " estaMatriculado: " + estaMatriculado;


    }
}
