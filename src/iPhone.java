public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void pausar() {
        System.out.println("Pausar Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionada música " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando chamada do correio de voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página de url: " + url);
    }
    
}
