package a05;

public class Piano extends Instrumento{
    @Override
    public void interpretar() {

        for (Nota n : melodia) {
            System.out.print(n + " ");
        }

        System.out.println();
    }
}