import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("================== **** ==================");
        System.out.println("Jogo do Adivinha");
        System.out.println("================== **** ==================");
        System.out.println("Adivinhe o numero que foi sorteado de 1 a 10: ");
        Random random = new Random();
        int anynumber = random.nextInt(10);
        Scanner scn1 = new Scanner(System.in);
        int guessNum = scn1.nextInt();

    }
    public static void numberDraw(int anynumber, int guessNUm){
        if (anynumber == guessNUm){
            System.out.println("Parabéns você acertou!");
        }

    }
}