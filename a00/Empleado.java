package a00;

public class Empleado extends Persona{
    private double salario;
    
    public Empleado(String nombre, int edad, double estatura, String nacionalidad, double salario){
        super(edad, nombre, estatura, nacionalidad);
        this.salario = salario;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("\nSalario: " + salario);
    }
    
    public void subirSalario(double num){
        salario += num;
    }
}
