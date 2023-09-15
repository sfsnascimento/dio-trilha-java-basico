public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Realizando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Reprodutor musical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        //Navegador Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
