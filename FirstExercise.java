import java.util.Random;
import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        int[] arrRandom = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Ecco l'array casuale iniziale:");
        System.out.print("[");
        for (int i = 0; i < arrRandom.length; i++) {
            Random randomNum = new Random();
            arrRandom[i] = randomNum.nextInt(1, 10);
            if (i != arrRandom.length - 1) {
                System.out.print(arrRandom[i] + ", ");
            } else {
                System.out.print(arrRandom[i]);
            }
        }
        System.out.print("]\n");

        int n = 12;
        while (n != 0) {
            System.out.println("Scrivi un numero a partire da 1 o scrivi 0 per terminare il programma");
            n = Integer.parseInt(input.nextLine());
            try {
                if (n == 0) {
                    System.out.println("Programma terminato con successo");
                    return;
                } else {
                    System.out.println("Scrivi in che posizione vuoi metterlo");
                    int pos1 = Integer.parseInt(input.nextLine());
                    arrRandom[pos1 - 1] = n;
                    System.out.print("[");
                    for (int i = 0; i < arrRandom.length; i++) {
                        if (i != arrRandom.length - 1) {
                            System.out.print(arrRandom[i] + ", ");
                        } else {
                            System.out.print(arrRandom[i]);
                        }
                    }
                    System.out.print("]\n");
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Hai inserito un numero che eccede (o + o -) la lunghezza dell'array. Riprova");
            }

        }

        input.close();
    }


}
