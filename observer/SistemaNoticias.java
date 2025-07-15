import java.util.*;

public class SistemaNoticias {
    Map<String, List<Observer>> assinantes = new HashMap<>();

    public void inscrever(String categoria, Observer o) {
        List<Observer> lista = assinantes.get(categoria);

        if (lista == null) {
            
            lista = new ArrayList<>();
            assinantes.put(categoria, lista); 
        }

        lista.add(o); 
    }

    public void desinscrever(String categoria, Observer o) {
        List<Observer> lista = assinantes.get(categoria);

        if (lista != null) {
            lista.remove(o); 
        }
    }

    public void publicarNoticia(String categoria, String mensagem) {
        List<Observer> lista = assinantes.get(categoria);

        if (lista != null) {
            for (Observer o : lista) {
                o.update(categoria, mensagem);
            }
        }
    }
}
