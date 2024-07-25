package AparelhoIphone.Apps;

import AparelhoIphone.funcoes.NavegadorInternet;

public class AppIternet implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da Internet");
    }

    @Override
    public void abrirNovaPagina() {
        System.out.println("Abrindo nova pagina da Internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina da Internet");
    }
}
