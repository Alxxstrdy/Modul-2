package modul2_202357201027;
import java.util.Scanner;

public class Modul2_2 {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    public double volume_bangun(int diameter, double tinggi, String jenisBangun) {
        double volume = 0;
        int jari2 = diameter / 2;
        if (jenisBangun.equalsIgnoreCase("tabung")) {
            volume = luas_lingkaran(diameter) * tinggi;
        } else if (jenisBangun.equalsIgnoreCase("kerucut")) {
            volume = (luas_lingkaran(diameter) * tinggi) / 3;
        } else if (jenisBangun.equalsIgnoreCase("bola")) {
            volume = (4 * Math.PI * Math.pow(jari2, 3)) / 3;
        } else {
            System.out.println("Jenis bangun tidak ada");
        }
        return volume;
    }

    public static void main(String[] args) {
        Modul2_2 mt = new Modul2_2();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan diameter lingkaran:");
        int diameter = scanner.nextInt();
        
        System.out.println("Masukkan tinggi bangun:");
        double tinggi = scanner.nextDouble();
        
        System.out.println("Masukkan jenis bangun (tabung/kerucut/bola):");
        String jenisBangun = scanner.next();
        
        double volume = mt.volume_bangun(diameter, tinggi, jenisBangun);
        System.out.println("Volume bangun tersebut adalah: " + volume);

        scanner.close();
        System.exit(0);
    }
}
