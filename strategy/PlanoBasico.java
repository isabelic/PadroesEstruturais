package strategy;

public class PlanoBasico implements CalcularPlano {
    
    public double calcularPreco (){
        return 19.90;
    }
     @Override
    public String getMensagem() {
        return "Plano Básico: 1 tela, HD";
    }
}
