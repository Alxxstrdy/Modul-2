package modul2_202357201027;
import javax.swing.JOptionPane;

public class Modul2_3 {
    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double luasLingkaran(double diameter) {
        double jari2 = diameter / 2.0;
        return Math.PI * Math.pow(jari2, 2);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Pilih bangun:\n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran");
        int pilihan = Integer.parseInt(input);
        double luas = 0;

        if (pilihan == 1) {
            double sisiPersegi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang sisi:"));
            luas = luasPersegi(sisiPersegi);
        } else if (pilihan == 2) {
            double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
            double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
            luas = luasPersegiPanjang(panjang, lebar);
        } else if (pilihan == 3) {
            double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
            double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
            luas = luasSegitiga(alasSegitiga, tinggiSegitiga);
        } else if (pilihan == 4) {
            double diameterLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan diameter lingkaran:"));
            luas = luasLingkaran(diameterLingkaran);
        } else {
            JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Luas bangun tersebut adalah: " + luas);
    }
}
