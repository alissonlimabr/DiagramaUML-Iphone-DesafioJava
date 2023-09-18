package alissonlimabr.Iphone;

public class Iphone {
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
    //Teste dos métodos
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        // Chama os métodos do ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Ascend - Dezko");

        // Chama os métodos do AparelhoTelefonico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Chama os métodos do NavegadorInternet
        meuIphone.exibirPagina("https://github.com/alissonlimabr");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

