package AparelhoIphone.Iphone35xsplus;

import AparelhoIphone.funcoes.AparelhoTelefonico;
import AparelhoIphone.funcoes.NavegadorInternet;
import AparelhoIphone.funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar() {

        System.out.print("Realizando chamada DDD");

    }

    @Override
    public void atender() {

        System.out.print("Atendendo chamada DDD");

    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.print("Iniciando Correio de voz ");

    }

    @Override
    public void exibirPagina() {

        System.out.print("Exibindo pagina via Firefox");
    }

    @Override
    public void abrirNovaPagina() {
        System.out.print("Abrindd pagina via Firefox");

    }

    @Override
    public void atualizarPagina() {

        System.out.print("Atualizando pagina via Firefox");

    }

    @Override
    public void tocar() {

        System.out.print("Tocando musica Boa");

    }

    @Override
    public void pausar() {

        System.out.print("Pausando musica Boa");

    }

    @Override
    public void sileciar() {

        System.out.print("Silenciando musica Boa");

    }
}
