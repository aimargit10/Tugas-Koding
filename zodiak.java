import java.util.Scanner;

public class zodiak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir (dd/mm): ");
        String tanggalLahir = input.nextLine();

        int tanggal = Integer.parseInt(tanggalLahir.split("/")[0]);
        int bulan = Integer.parseInt(tanggalLahir.split("/")[1]);

        String zodiac = "";
        switch (bulan) {
            case 1:
                if (tanggal >= 22) {
                    zodiac = "Aquarius";
                } else {
                    zodiac = "Capricorn";
                }
                break;
            case 2:
                if (tanggal >= 20) {
                    zodiac = "Pisces";
                } else {
                    zodiac = "Aquarius";
                }
                break;
            case 3:
                if (tanggal >= 21) {
                    zodiac = "Aries";
                } else {
                    zodiac = "Pisces";
                }
                break;
            case 4:
                if (tanggal >= 20) {
                    zodiac = "Taurus";
                } else {
                    zodiac = "Aries";
                }
                break;
            case 5:
                if (tanggal >= 21) {
                    zodiac = "Gemini";
                } else {
                    zodiac = "Taurus";
                }
                break;
            case 6:
                if (tanggal >= 21) {
                    zodiac = "Cancer";
                } else {
                    zodiac = "Gemini";
                }
                break;
            case 7:
                if (tanggal >= 23) {
                    zodiac = "Leo";
                } else {
                    zodiac = "Cancer";
                }
                break;
            case 8:
                if (tanggal >= 23) {
                    zodiac = "Virgo";
                } else {
                    zodiac = "Leo";
                }
                break;
            case 9:
                if (tanggal >= 23) {
                    zodiac = "Libra";
                } else {
                    zodiac = "Virgo";
                }
                break;
            case 10:
                if (tanggal >= 23) {
                    zodiac = "Scorpio";
                } else {
                    zodiac = "Libra";
                }
                break;
            case 11:
                if (tanggal >= 22) {
                    zodiac = "Sagittarius";
                } else {
                    zodiac = "Scorpio";
                }
                break;
            case 12:
                if (tanggal >= 22) {
                    zodiac = "Capricorn";
                } else {
                    zodiac = "Sagittarius";
                }
                break;
            default:
                System.out.println("Tanggal lahir yang Anda masukkan tidak valid.");
                break;
        }

        System.out.println("Zodiak Anda adalah: " + zodiac);
    }
}
