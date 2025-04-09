import java.util.Scanner;

public class Oat02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: R$");
        double salarioc = scanner.nextDouble();

        double percentualAumento;
        double saltest = salarioc;

        while (true) {
            if (saltest <= 280) {
                percentualAumento = 20;
                break;
            }

            saltest -= 280;

            if (saltest <= 420) {
                percentualAumento = 15;
                break;
            }

            saltest -= 420;

            if (saltest <= 800) {
                percentualAumento = 10;
                break;
            }

            percentualAumento = 5;
            break;
        }

        double valorAumento = (percentualAumento / 100) * salarioc;
        double novoSalario = salarioc + valorAumento;
        double aumentoReal = valorAumento - ((3.8 / 100) * salarioc);

        System.out.println("\nResumo do Reajuste Salarial:");
        System.out.println("Salário antes do reajuste: R$" + salarioc);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após aumento: R$" + novoSalario);
        System.out.println("Valor do aumento real (descontando inflação): R$" + aumentoReal);

        scanner.close();
    }
}
