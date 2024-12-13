import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("================== **** ==================");
        System.out.println("Bem-vindo ao Jogo do Adivinha");
        System.out.println("================== **** ==================");
        System.out.println("Adivinhe o numero que foi sorteado de 1 a 10: ");
        Random random = new Random();
        int anynumber = random.nextInt(10);


        System.out.println(anynumber);
        Scanner scn1 = new Scanner(System.in);
        int guessNum = scn1.nextInt();
        numberDraw(anynumber, guessNum);
    }
    public static void numberDraw(int anynumber, int guessNum){
        if (anynumber == guessNum){
            System.out.println("================== **** ==================");
            System.out.println("Parabéns você acertou e ganhou 10 pontos!\n" +
                    "Quer jogar outra rodada ? ");
            System.out.println("================== **** ==================");
        }else if (guessNum == anynumber +1){
            System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                    "você ganhou 5 pontos! ");
        }else if (guessNum == anynumber -1) {
            System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                    "você ganhou 5 pontos! ");
        }else {
            System.out.println("Você não ganhou nenhum ponto!");
        }

    }
}