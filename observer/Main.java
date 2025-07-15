public class Main {
    public static void main(String[] args) {
        SistemaNoticias sistema = new SistemaNoticias();

        Usuario iz = new Usuario("iz");
        Usuario geo = new Usuario("geo");
        Usuario paule = new Usuario("paule");

        sistema.inscrever("esporte", iz);
        sistema.inscrever("política", paule);
        sistema.inscrever("tecnologia", geo);
        sistema.inscrever("esporte", geo); 

        sistema.publicarNoticia("esporte", "Nova noticia sobre esportes!");
        sistema.publicarNoticia("política", "Nova noticia sobre política!");
        sistema.publicarNoticia("tecnologia", "Nova noticia sobre tecnologia!");
    }
}
