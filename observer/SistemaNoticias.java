import java.util.*;

public class SistemaNoticias {
    Map<String, List<Observer>> assinantes = new HashMap<>();

    public void inscrever(String categoria, Observer o) {
        List<Observer> lista = assinantes.get(categoria);

        if (lista == null) {
            // Se ainda não existe lista pra essa categoria, cria uma nova
            lista = new ArrayList<>();
            assinantes.put(categoria, lista); // só aqui precisa do put para adicionar a lista
        }

        lista.add(o); // adiciona o observador na lista
    }

    public void desinscrever(String categoria, Observer o) {
        List<Observer> lista = assinantes.get(categoria);

        if (lista != null) {
            lista.remove(o); // remove o observador da lista
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
