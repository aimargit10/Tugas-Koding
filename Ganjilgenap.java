public class Ganjilgenap {

    public static void main(String[] args) {
        // Deklarasi variabel
        int angka = 1;

        // Perulangan while
        while (angka <= 27) {
            // Cek apakah angka genap
            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " adalah genap");
            } else {
                System.out.println("Angka " + angka + " adalah ganjil");
            }

            // Increment angka
            angka++;
        }
    }
}
