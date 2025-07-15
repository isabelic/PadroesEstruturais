package Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarImpressao gerenciar = new GerenciarImpressao();

        Scanner iz = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n\n///////// Fila de Impressão /////////");
            System.out.println("1. Adicionar um novo documento para impressão");
            System.out.println("2. Desfazer impressão");
            System.out.println("3. Listar Documentos");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = iz.nextInt();
            iz.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do documento: ");
                    String doc = iz.nextLine();
                    gerenciar.executarComando(new Imprimir(doc));
                    break;
                case 2:
                    gerenciar.desfazerComando();
                    break;
                case 3:
                    gerenciar.listarComando();
                    break;
                case 0:
                    System.out.println("Fim do Sistema..");
                    break;
                default:
                    System.out.println("Opcao Inválida. Tente novamente");
            }
        } while (opcao != 0);

        iz.close();
    }
}
