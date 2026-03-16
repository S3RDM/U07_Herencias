package a03;

public class Main {
    public static void main(String[] args) {
        HoraExacta h1 = new HoraExacta(10, 30, 15);
        HoraExacta h2 = new HoraExacta(10, 30, 15);
        HoraExacta h3 = new HoraExacta(10, 30, 20);

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
    }
}