package a00;

public class Cliente extends Persona{
    private double presupuesto;
    
    public Cliente(String nombre, int edad, double estatura, String nacionalidad, double presupuesto){
        super(edad, nombre, estatura, nacionalidad);
        this.presupuesto = presupuesto;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("\nPresupuesto: " + presupuesto);
    }
    
    public void gastar(double num){
        presupuesto -= num;
    }
}
