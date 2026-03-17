package a02;

public class Main {
    public static void main(String[] args) {
        HoraExacta h = new HoraExacta(23, 59, 58);

        System.out.println(h);
        h.inc();
        System.out.println(h);
        h.inc();
        System.out.println(h);
    }
}