package modul2_202357201027;
public class Modul2_202357201027 {

    public static void main(String[] args) {
int bil = 10;
String b[] = {"a", "b", "c"};
try {
System.out.println(bil / 0);
System.out.println(b[3]);
} catch (ArithmeticException ai) {
System.out.println("Error oy");
System.out.println(ai.getMessage());
} catch (ArrayIndexOutOfBoundsException n) {
System.out.println("Error");    
System.out.println(n.getMessage());
} catch (Exception e) {
System.out.println("Error cuy");
    System.out.println(e.getMessage());
            }   
        }
}
