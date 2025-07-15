package strategy;

public class PlanoPremium implements CalcularPlano{
    public double calcularPreco(){
        return 59.90;
    }

    public String getMensagem() {
        return "Plano Premium: 4 tela, 4K";
    }
}
