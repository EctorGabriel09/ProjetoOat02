import java.util.Scanner;

        public class Oat1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Digite o salário do colaborador: R$");
        double salario = scanner.nextDouble();

                double percentualAumento;


                if (salario <= 280) {
                    percentualAumento = 20;
                } else if (salario <= 700) {
                    percentualAumento = 15;
                } else if (salario <= 1500) {
                    percentualAumento = 10;
                } else {
                    percentualAumento = 5;
                }





                double valorAumento = (percentualAumento / 100) * salario;
                double novoSalario = salario + valorAumento;


                double aumentoReal = valorAumento - ((3.8 / 100) * salario);


                System.out.println("\nResumo do Reajuste Salarial:");
                System.out.println("Salário antes do reajuste: R$" + salario);
                System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
                System.out.println("Valor do aumento: R$" + valorAumento);
                System.out.println("Novo salário após aumento: R$" + novoSalario);
                System.out.println("Valor do aumento real (descontando inflação): R$" + aumentoReal);

                scanner.close();
            }
        }

