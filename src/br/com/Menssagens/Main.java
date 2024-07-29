package br.com.Menssagens;

public class Main {

    public static void main(String[] args) {

        System.out.println("====== MENSAGEM ======");
        Msn msn = new Msn();
        msn.enviarMensagem();
        msn.chamarAtencao();
        msn.receberMensagem();

        System.out.println("\n====== MENSSEGER FACEBOOK ======");
        MensagensServico mensagensServico = new MensagensServico();
        mensagensServico.enviarMensagem();
        mensagensServico.receberMensagem();
        mensagensServico.deletarMensagem();

        System.out.println("\n===== TELEGRAM =====");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
