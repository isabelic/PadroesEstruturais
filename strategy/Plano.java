package strategy;

public class Plano {
    CalcularPlano plano;
    public Plano (CalcularPlano p){
        this.plano = p;
    }

    void mostrarPlano(){
        System.out.println("Plano adquirido: " + plano.calcularPreco());
    }
}
