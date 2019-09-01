package service;

import org.junit.Test;
import service.receptor.Receptor;
import service.receptor.ReceptorVisa;

import static org.junit.Assert.assertEquals;

public class ReceptorVisaTest {

    private Receptor receptor;

    public ReceptorVisaTest() {
        receptor = new ReceptorVisa();
    }

    @Test
    public void verifyMessageReceive(){
        String mensagem = receptor.receber();
        assertEquals(" Mensagem da Visa ", mensagem);
    }

}
