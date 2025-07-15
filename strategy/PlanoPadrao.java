package strategy;

public class PlanoPadrao implements CalcularPlano{
    public double calcularPreco(){
        return 29.90;
    }
   @Override
    public String getMensagem() {
        return "Plano Padrão: 2 tela, Full HD";
    }
}
