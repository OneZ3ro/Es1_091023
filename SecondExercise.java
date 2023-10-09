import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Inserisci quanti km hai percorso");
            double kmPercorsi = Double.parseDouble(input.nextLine());
            if (kmPercorsi == 0) {
                throw new ArithmeticException();
            }
            System.out.println("Inserisci quanti litri hai utilizzato");
            double ltUsati = Double.parseDouble(input.nextLine());
            double kmAlt = kmPercorsi / ltUsati;
            System.out.println("Km/lt = " + kmAlt);
        } catch (ArithmeticException ex) {
            System.err.println("Non puoi dividere per 0!");
        }
        input.close();
    }
}
