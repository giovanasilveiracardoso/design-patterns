package service.receptor;

public class ReceptorVisa implements Receptor {

    public String receber() {
        System.out.println(" Recebendo mensagem da Visa . ");
        String mensagem = " Mensagem da Visa ";
        return mensagem;
    }

}
