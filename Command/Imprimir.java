package Command;

public class Imprimir implements Comando {
    private String documento;

    public Imprimir(String documento) {
        this.documento = documento;
    }

    @Override
    public void executar() {
        System.out.println("Imprimindo: " + documento);
    }

    @Override
    public void desfazer() {
        System.out.println("Impressão cancelada: " + documento);
    }

    @Override
    public String toString() {
        return "Impressão: " + documento;
    }
}