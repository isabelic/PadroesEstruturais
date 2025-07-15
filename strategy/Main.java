package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
     Scanner iz = new Scanner(System.in);
        CalcularPlano plano;

        System.out.println("Escolha o plano :");
        System.out.println("1 - Básico");
        System.out.println("2 - Padrão");
        System.out.println("3 - Premium");
        System.out.print("Digite a opção: ");
        int opcao = iz.nextInt();

        switch (opcao) {
            case 1:
                plano = new PlanoBasico();
                break;
            case 2:
                plano = new PlanoPadrao();
                break;
            case 3:
                plano = new PlanoPremium();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nPlano escolhido ---> " + plano.getMensagem());


        System.out.printf("Valor do plano: R$ %.2f\n", plano.calcularPreco());

        iz.close();
    }

}