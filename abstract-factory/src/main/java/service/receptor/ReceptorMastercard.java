package service.receptor;

public class ReceptorMastercard implements Receptor {

    public String receber() {
        System.out.println(" Recebendo mensagem da Mastercard . ");
        String mensagem = " Mensagem da Mastercard ";
        return mensagem;
    }

}
