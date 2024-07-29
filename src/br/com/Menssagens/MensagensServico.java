package br.com.Menssagens;

public class MensagensServico {
     public void enviarMensagem() {
         validarConeccaoInternet();
         System.out.println("enviando mensagem");

     }
     public void receberMensagem() {
         System.out.println("recebendo mensagem");

     }

     public void deletarMensagem() {
         System.out.println("deletando mensagem");

     }

     private void validarConeccaoInternet() {
         System.out.println("Conectado");
     }

}

