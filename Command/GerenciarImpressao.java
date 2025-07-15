package Command;
import java.util.Stack;



public class GerenciarImpressao {
    /*Stack<Comando> - foi usado para armazenar o histórico dos comandos executados, entao eu adiciono, desfaço (segue o comando de pilha)*/ 
    private Stack<Comando> command = new Stack<>();

    public void executarComando(Comando cmd) {
        cmd.executar();
        command.push(cmd);
    }

    public void desfazerComando() {
        if (!command.isEmpty()) {
            Comando comando = command.pop();
            comando.desfazer();
        } else {
            System.out.println("Impossivel desfazer comando - 0");
        }
    }

    public void listarComando() {
        if (command.isEmpty()) {
            System.out.println("Nada encontrado");
        } else {
            System.out.println("\nComandos executados: ");
            for (Comando c : command) {
                System.out.println(" - " + c);
            }
        }
    }
}
