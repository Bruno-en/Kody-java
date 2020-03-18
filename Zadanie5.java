import java.util.Scanner;

public class Zadanie5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj współczyniki równania kwadratowego ");
        double a=scan.nextDouble();
        System.out.println("a= "+ a);
        double b =scan.nextDouble();
        System.out.println("b "+ b);
        double c=scan.nextDouble();
        System.out.println("c= "+ c);
        double delta = b*b-4*a*c;
        double wynik1 = -b/a*c;
        System.out.println(" "+ delta);
        if(delta<0) {
            System.out.println("równanie nie ma pierwiastków");}
        else if( delta<10E-8){
            System.out.println("Pierwiastek to "+ wynik1); }
        else if (delta>0) {
            System.out.print("Pierwiastki to " + (-b+delta)/2*a);
            System.out.println(" i "+ (-b-delta)/2*a);
        }
    }
}
