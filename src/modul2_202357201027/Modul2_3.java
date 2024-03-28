package modul2_202357201027;
import javax.swing.JOptionPane;

public class Modul2_3 {

    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double luasLingkaran(double diameter) {
        double jari2 = diameter / 2.0;
        return Math.PI * Math.pow(jari2, 2);
    }

    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Pilih bangun:\n1. Persegi Panjang\n2. Lingkaran\n3. Segitiga");
        int pilihan = Integer.parseInt(input);

        double luas = 0;    

        if (pilihan == 1) {
            double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
            double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
            luas = luasPersegiPanjang(panjang, lebar);
        } else if (pilihan == 2) {
            double diameter = Double.parseDouble(JOptionPane.showInputDialog("Masukkan diameter lingkaran:"));
            luas = luasLingkaran(diameter);
        } else if (pilihan == 3) {
            double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
            double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
            luas = luasSegitiga(alas, tinggi);
        } else {
            JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Luas bangun tersebut adalah: " + luas);
    }
}
