import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj rok");
        int rok= scan.nextInt();
                if (rok<0) {
                    System.out.println("rok nie moze byc ujemny");}
                    else if (rok % 4==0 && rok % 100 !=0) {
                        System.out.println("rok jest przestepny");}
                        else if (rok % 400 ==0) {
                            System.out.println("rok jest przestepny");}
                            else {
                                System.out.println("rok jest nieprzestepny");}
    }
}
