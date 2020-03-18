import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double wynik = a / b;
        if (b == 0) {
            while (b == 0) {
                System.out.println("nie dziel przez 0");
                double c = scan.nextDouble();
                double d = scan.nextDouble();
                wynik = c / d;    if (d==0) {continue;} if (d !=0) {break;}
            }
            System.out.println("wynik= " + wynik);

        }
    }
}
