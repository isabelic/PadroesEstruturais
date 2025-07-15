public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String categoria, String mensagem) {
        System.out.println(nome + " -->  Noticia: " + categoria + " || " + mensagem);
    }

    @Override
    public String getNome() {
        return nome;
    }
}
