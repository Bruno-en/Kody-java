import java.util.Scanner;

public class Zandanie12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double suma = 0;
        for (double i = 0; i <= 20; i++) {
            double potega = Math.pow(0.1, i);
            suma = suma + potega;
            System.out.println("Suma= " + suma);
        }
    }
}
