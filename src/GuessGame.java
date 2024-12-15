import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("================== **** ==================");
        System.out.println("Bem-vindo ao Jogo do Adivinha");
        System.out.println("================== **** ==================");
        System.out.println("Escolha uma dificuldade :");
        System.out.println("1- Fácil 2- Médio 3 - Difícil ");

        Random random = new Random();
        int anyEasy = random.nextInt(10);
        int anyMed = random.nextInt(50);
        int anyHard = random.nextInt(100);

        Scanner scn1 = new Scanner(System.in);
        int difficulty = scn1.nextInt();

        numberDraw(anyEasy, anyMed, anyHard, difficulty);
    }

    public static void numberDraw(int anyEasy, int anyMed, int anyHard, int difficulty) {
        switch (difficulty) {
            case 1:
                System.out.println("Você escolheu o modo fácil!" +
                        " Escolha um numero para ser sorteado de 1 a 10");
                Scanner scnEasy = new Scanner(System.in);
                int guessNum = scnEasy.nextInt();
                if (anyEasy == guessNum) {
                    System.out.println("================== **** ==================");
                    System.out.println("Parabéns você acertou e ganhou 10 pontos!\n" +
                            "Quer jogar outra rodada ? ");
                    System.out.println("================== **** ==================");
                } else if (anyEasy == guessNum + 1) {
                    System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                            "você ganhou 5 pontos! ");
                } else if (anyEasy == guessNum - 1) {
                    System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                            "você ganhou 5 pontos! ");
                } else {
                    System.out.println("Você não ganhou nenhum ponto!");
                }
                break;
            case 2 :
                System.out.println("Você escolheu o modo Médio!" +
                        " Escolha um numero para ser sorteado de 1 a 50");
                Scanner scnMed = new Scanner(System.in);
                int guessNumMed = scnMed.nextInt();
                if (anyMed == guessNumMed) {
                    System.out.println("================== **** ==================");
                    System.out.println("Parabéns você acertou e ganhou 10 pontos!\n" +
                            "Quer jogar outra rodada ? ");
                    System.out.println("================== **** ==================");
                } else if (anyMed == guessNumMed + 1) {
                    System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                            "você ganhou 5 pontos! ");
                } else if (anyMed == guessNumMed - 1) {
                    System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                            "você ganhou 5 pontos! ");
                } else {
                    System.out.println("Você não ganhou nenhum ponto!");
                }
                break;
            case 3 :
                System.out.println("Você escolheu o modo Difícil!" +
                        " Escolha um numero para ser sorteado de 1 a 100");
                Scanner scnHard = new Scanner(System.in);
                int guessNumHard = scnHard.nextInt();
                if (anyHard == guessNumHard) {
                    System.out.println("================== **** ==================");
                    System.out.println("Parabéns você acertou e ganhou 10 pontos!\n" +
                            "Quer jogar outra rodada ? ");
                    System.out.println("================== **** ==================");
                } else if (anyHard == guessNumHard + 1) {
                    System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                            "você ganhou 5 pontos! ");
                } else if (anyHard == guessNumHard - 1) {
                    System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                            "você ganhou 5 pontos! ");
                } else {
                    System.out.println("Você não ganhou nenhum ponto!");
                }
                break;
        }
    }
}
