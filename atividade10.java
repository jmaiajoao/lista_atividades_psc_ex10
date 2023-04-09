
// programa de soluções computacionais.
// Lista 2 ( atividade 10, segunda lista)
//Aluno: João Victor Maia Leite
//RA: 323124931


import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        final double IR = 0.11;
        final double INSS = 0.08;
        final double SINDICATO = 0.05;
        double salarioHora, horasTrabalhadas, salarioBruto, descontoIR, descontoINSS, descontoSindicato, salarioLiquido;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor que você ganha por hora: ");
        salarioHora = input.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = input.nextDouble();

        salarioBruto = salarioHora * horasTrabalhadas;
        descontoIR = salarioBruto * IR;
        descontoINSS = salarioBruto * INSS;
        descontoSindicato = salarioBruto * SINDICATO;
        salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

        System.out.printf("Salário Bruto : R$ %.2f%n", salarioBruto);
        System.out.printf("- IR (11%%) : R$ %.2f%n", descontoIR);
        System.out.printf("- INSS (8%%) : R$ %.2f%n", descontoINSS);
        System.out.printf("- Sindicato (5%%) : R$ %.2f%n", descontoSindicato);
        System.out.printf("= Salário Liquido : R$ %.2f%n", salarioLiquido);

        input.close();
    }
}














 