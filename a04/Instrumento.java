package a04;
import java.util.ArrayList;

public abstract class Instrumento{
    protected ArrayList<Nota> melodia;

    public Instrumento() {
        melodia = new ArrayList<>();
    }

    public void add(Nota n) {
        melodia.add(n);
    }

    public abstract void interpretar();
}