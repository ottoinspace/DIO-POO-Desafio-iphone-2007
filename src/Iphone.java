public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Iphone ligado!");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligacao");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvir correio de voz");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo a pagina " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atual atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Play!!!");
    }

    @Override
    public void pausar() {
        System.out.println("Stop!!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a musica " + musica);
    }
}
