package br.com.Menssagens;

public class Abstract MensagensServico  {
     public default void enviarMensagem() {
         validarConeccaoInternet();
         System.out.println("enviando mensagem");

     }
     public default void receberMensagem() {
         System.out.println("recebendo mensagem");

     }

     public default void deletarMensagem() {
         System.out.println("deletando mensagem");

     }

     private void validarConeccaoInternet() {
         System.out.println("Conectado");
     }

}

