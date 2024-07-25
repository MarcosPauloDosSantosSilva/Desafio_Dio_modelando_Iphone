package AparelhoIphone.Apps;

import AparelhoIphone.funcoes.ReprodutorMusical;

public class AppMusical implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Musíca Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musíca Pausada");
    }

    @Override
    public void sileciar() {
        System.out.println("Musíca Silenciada");
    }
}
