package AparelhoIphone;

import AparelhoIphone.Apps.AppIternet;
import AparelhoIphone.Apps.AppMusical;
import AparelhoIphone.Apps.AppTelefonico;
import AparelhoIphone.Iphone35xsplus.Iphone;
import AparelhoIphone.funcoes.AparelhoTelefonico;
import AparelhoIphone.funcoes.NavegadorInternet;
import AparelhoIphone.funcoes.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        AparelhoTelefonico telefonico = iphone;
        NavegadorInternet internet = iphone;
        ReprodutorMusical musical = iphone;

        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();

        internet.abrirNovaPagina();
        internet.atualizarPagina();
        internet.exibirPagina();

        musical.tocar();
        musical.pausar();
        musical.sileciar();
    }

}