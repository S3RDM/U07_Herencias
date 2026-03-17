package a00;

public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private String nacionalidad;
    
    public Persona(int edad, String nombre, double estatura, String nacionalidad){    
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }
    void mostrarDatos(){
        System.out.print("Edad: " + getEdad() + " años\nNombre: " + getNombre() + "\nEstatura: " + getEstatura() + " m\nNacionalidad: " + getNacionalidad());
    }
    protected int getEdad(){
        return edad;
    }
    protected String getNombre(){
        return nombre;
    }
    protected double getEstatura(){
        return estatura;
    }
    protected String getNacionalidad(){
        return nacionalidad;
    }
}