import java.util.Scanner;

public class NowyProjekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Podaj liczbe całkowita");
        int liczba1 =scan.nextInt();
        int liczba2 =scan.nextInt();
        double result=Math.sqrt(liczba1*liczba2);
        System.out.print("Twoje liczby to " + liczba1);
        System.out.println(" i "+ liczba2);
        System.out.println("wunik mnożenia to "+ liczba1*liczba2);
        System.out.println("reszta z dzielenia to "+ liczba1 % liczba2);
        System.out.println("srednia arytmetyczna to " +  (liczba1*1.0 + liczba2)/2);
        System.out.println("srednia geometryczna to" + result);
    }
}
