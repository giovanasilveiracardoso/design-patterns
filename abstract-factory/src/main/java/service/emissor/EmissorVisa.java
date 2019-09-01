package service.emissor;

public class EmissorVisa implements Emissor {

    public void enviar(String mensagem) {
        System.out.println(" Enviando a seguinte mensagem para a Visa : ");
        System.out.println(mensagem);
    }

}
