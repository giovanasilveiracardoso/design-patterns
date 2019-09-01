package service;

import org.junit.Assert;
import org.junit.Test;
import service.receptor.Receptor;
import service.receptor.ReceptorMastercard;

import static org.junit.Assert.assertEquals;

public class ReceptorMastercardTest {

    private Receptor receptor;

    public ReceptorMastercardTest() {
        receptor = new ReceptorMastercard();
    }

    @Test
    public void verifyMessageReceive(){
        String mensagem = receptor.receber();
        assertEquals(" Mensagem da Mastercard ", mensagem);
    }

}
