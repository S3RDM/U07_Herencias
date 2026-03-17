package a01;

public class Main {
    public static void main(String[] args) {
        Hora h = new Hora(23, 58);

        System.out.println(h);
        h.inc();
        System.out.println(h);
        h.inc();
        System.out.println(h);
    }
}