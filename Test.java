import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double max = a;
        if(b>max) { max = b;}
        if(c>max) { max = c ;}
        System.out.println("najwieksza liczba to "+ max);
    }
}
