package a00;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Empleado("Carlos", 30, 1.75, "Española", 2000);
        Persona p2 = new Cliente("Ana", 25, 1.65, "Mexicana", 5000);
        
        p1.mostrarDatos();
        System.out.println("\n");
        p2.mostrarDatos();
    }
}