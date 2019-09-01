package service.emissor;

public class EmissorMastercard implements Emissor {

    public void enviar(String mensagem) {
        System.out.println(" Enviando a seguinte mensagem para a Mastercard : ");
        System.out.println(mensagem);
    }

}
