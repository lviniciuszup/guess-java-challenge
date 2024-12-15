import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;
        int score = 0;
        while(keepPlaying){
            System.out.println("================== **** ==================");
            System.out.println("Bem-vindo ao Jogo do Adivinha");
            System.out.println("================== **** ==================");
            System.out.println("Escolha uma dificuldade :");
            System.out.println("1- Fácil 2- Médio 3 - Difícil ");

            Random random = new Random();
            int anyEasy = random.nextInt(10);// Gera um número de 0 a 9 para o nivel facil
            int anyMed = random.nextInt(50);// Gera um número de 0 a 50 para o nivel medio
            int anyHard = random.nextInt(100);// Gera um número de 0 a 100 para o nivel dificil


            int difficulty = scanner.nextInt();

            // Soma a pontuação retornada pelo metodo numberDraw
            score += numberDraw(anyEasy, anyMed, anyHard, difficulty);

            System.out.println("Sua pontuação atual é: " + score);
            System.out.println("Deseja jogar novamente?" +
                    "\n 1 - Sim \n 2 - Não");
            int playAgain = scanner.nextInt();
            if (playAgain == 2){ keepPlaying = false;
                System.out.println("Obrigado por jogar!");
                System.out.println("Sua pontuação final foi: " + score);

            }
        }
    }
    // Realiza o sorteio de um número com base na dificuldade escolhida e soma os pontos
    public static int numberDraw(int anyEasy, int anyMed, int anyHard, int difficulty) {
        int points = 0;
        switch (difficulty) {
            case 1:
                System.out.println("Você escolheu o modo Fácil!" +
                        " Escolha um numero para ser sorteado de 1 a 10");
                Scanner scnEasy = new Scanner(System.in);
                int guessNumEasy = scnEasy.nextInt();
                // Verifica se o palpite está correto ou próximo
                if (anyMed == guessNumEasy) {
                    System.out.println("================== **** ==================");
                    System.out.println("Parabéns você acertou e ganhou 10 pontos!");
                    points += 10;
                    System.out.println("================== **** ==================");
                } else if (anyMed == guessNumEasy + 1) {
                    System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                            "você ganhou 5 pontos! ");
                    points += 5;
                } else if (anyMed == guessNumEasy - 1) {
                    System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                            "você ganhou 5 pontos! ");
                    points += 5;
                } else {
                    System.out.println("Você não ganhou nenhum ponto!");
                }
                break;
            case 2:
                System.out.println("Você escolheu o modo Médio!" +
                        " Escolha um numero para ser sorteado de 1 a 50");
                Scanner scnMed = new Scanner(System.in);
                int guessNumMed = scnMed.nextInt();
                if (anyMed == guessNumMed) {
                    System.out.println("================== **** ==================");
                    System.out.println("Parabéns você acertou e ganhou 10 pontos!\n" +
                            "Quer jogar outra rodada ? ");
                    points += 10;
                    System.out.println("================== **** ==================");
                } else if (anyMed == guessNumMed + 1) {
                    System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                            "você ganhou 5 pontos! ");
                    points += 5;
                } else if (anyMed == guessNumMed - 1) {
                    System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                            "você ganhou 5 pontos! ");
                    points += 5;
                } else {
                    System.out.println("Você não ganhou nenhum ponto!");
                }
                break;
            case 3:
                System.out.println("Você escolheu o modo Difícil!" +
                        " Escolha um numero para ser sorteado de 1 a 100");
                Scanner scnHard = new Scanner(System.in);
                int guessNumHard = scnHard.nextInt();
                if (anyHard == guessNumHard) {
                    System.out.println("================== **** ==================");
                    System.out.println("Parabéns você acertou e ganhou 10 pontos!\n" +
                            "Quer jogar outra rodada ? ");
                    points += 10;
                    System.out.println("================== **** ==================");
                } else if (anyHard == guessNumHard + 1) {
                    System.out.println("O número digitado é uma unidade acima do numero sorteado, " +
                            "você ganhou 5 pontos! ");
                    points += 5;
                } else if (anyHard == guessNumHard - 1) {
                    System.out.println("O número digitado é uma unidade abaixo do numero sorteado " +
                            "você ganhou 5 pontos! ");
                    points += 5;
                } else {
                    System.out.println("Você não ganhou nenhum ponto!");
                }
                break;
        }
        return points;
    }
}
