import java.util.*;

public class Segitiga<T> {
    private T alas;
    private T tinggi;
    static Scanner input = new Scanner(System.in);

    Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public T getAlas() {
        return alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public static <T> Integer getResultAsInt(Segitiga<T> rumus) {
        return ((Integer) rumus.getAlas() * (Integer) rumus.getTinggi()) / 2;
    }

    public static <T> Double getResultAsDouble(Segitiga<T> rumus) {
        return ((double) rumus.getAlas() * (double) rumus.getTinggi()) / 2;
    }

    public static void main(String[] args) {
        int pilih;
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("\n=== HITUNG LUAS SEGITIGA ===\n");
            System.out.println("Mau menampilkan hasil luas dalam bentuk? ");
            System.out.println("1. Hasil to Integer");
            System.out.println("2. Hasil to Double");
            System.out.println("3. Exit");
            System.out.println("Masukkan Pilihan 1 / 2 / 3");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Luas dan Tinggi: ");
                    Segitiga<Integer> p1 = new Segitiga<Integer>(input.nextInt(), input.nextInt());
                    System.out.println(getResultAsInt(p1));
                    break;
                case 2:
                    System.out.println("Masukkan Luas dan Tinggi: ");
                    Segitiga<Double> p2 = new Segitiga<Double>(input.nextDouble(), input.nextDouble());
                    System.out.println(getResultAsDouble(p2));
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
