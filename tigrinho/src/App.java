import java.util.Random;
import java.util.Scanner;

public class App {
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static double recaregar(Scanner scanner, double saldo) {
        int opcao = 0;

        System.out.println("\n====================================");
        System.out.println("           PLATAFORMA FINANCEIRA   ");
        System.out.println("====================================");
        System.out.println("1.  Depositar R$10");
        System.out.println("2.  Depositar R$50");
        System.out.println("3.  Depositar R$100");
        System.out.println("4.  Ver saldo");
        System.out.println("5.  Sair");
        System.out.println("------------------------------------");
        System.out.print("👉 Escolha uma opção: ");

        opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                saldo += 10;
                System.out.println("Depósito de R$10 realizado!");
                break;

            case 2:
                saldo += 50;
                System.out.println("Depósito de R$50 realizado!");
                break;

            case 3:
                saldo += 100;
                System.out.println("Depósito de R$100 realizado!");
                break;

            case 4:
                System.out.println("Seu saldo atual é: R$ " + saldo);
                break;

            case 5:
                System.out.println("Saindo da plataforma...");
                scanner.close();
                System.exit(0);
                break;

            default:
                System.out.println("X Opção inválida!");
        }
        clear();
        return saldo;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        String[] simbolos = {"7", "$", "@", "#", "%", "&"};

        int  resposta = 0;
        double saldo = 0;

        clear();
        saldo = recaregar(scanner, saldo);

        do {

            for(int i = 0; i < 50; i++) {
                int random = r.nextInt(6); // gera número de 0 até 5
                int r1 = r.nextInt(simbolos.length);
                int r2 = r.nextInt(simbolos.length);
                int r3 = r.nextInt(simbolos.length);
                int r4 = r.nextInt(simbolos.length);
                int r5 = r.nextInt(simbolos.length);
                int r6 = r.nextInt(simbolos.length);
                int r7 = r.nextInt(simbolos.length);
                int r8 = r.nextInt(simbolos.length);
                int r9 = r.nextInt(simbolos.length);
                System.out.println("╔════════════════════════════════════╗");
                System.out.println("║             CAÇA NÍQUEL            ║");
                System.out.println("╠════════════════════════════════════╣");
                System.out.println("║     WIN = x2    ROLL = R$ 5,00     ║");
                System.out.println("║        ┌─────┬─────┬─────┐         ║");
                System.out.println("║        │  " + simbolos[r1] + "  │  " + simbolos[r2] + "  │  " + simbolos[r3] + "  │         ║");
                System.out.println("║        ├─────┼─────┼─────┤         ║");
                System.out.println("║      ->│  " + simbolos[r4] + "  │  " + simbolos[r5] + "  │  " + simbolos[r6] + "  │<-       ║");
                System.out.println("║        ├─────┼─────┼─────┤         ║");
                System.out.println("║        │  " + simbolos[r7] + "  │  " + simbolos[r8] + "  │  " + simbolos[r9] + "  │         ║");
                System.out.println("║        └─────┴─────┴─────┘         ║");
                System.out.println("║                                    ║");
                System.out.println("║                                    ║");
                System.out.println("╚════════════════════════════════════╝");
                System.out.println("\n\nSeu saldo é de R$ " + ( saldo - 5));
                if (i == 9) {
                    if(r4 == r5 && r5 == r6) {
                        System.out.println("Parabéns! Você ganhou!");
                        saldo = saldo * 2;
                    } else {
                        System.out.println("Que pena! Tente novamente!");
                        saldo -= 5;

                    }
                    break;
                }
                Thread.sleep(120);
                clear();
            }

            System.out.println("╔════════════════════════════╗");
            System.out.println("║        NOVA RODADA?        ║");
            System.out.println("╠════════════════════════════╣");
            System.out.println("║                            ║");
            System.out.println("║   1 > Girar novamente      ║");
            System.out.println("║   2 > Recarregar saldo     ║");
            System.out.println("║   9 > Sair do jogo         ║");
            System.out.println("║                            ║");
            System.out.println("╚════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            resposta = scanner.nextInt();

            if (resposta == 2) {
                saldo = recaregar(scanner, saldo);
                resposta = 1;
            }

        } while(resposta == 1);

    }
}
