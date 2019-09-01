package service.comunicador;

import org.junit.Test;
import service.comunicador.ComunicadorFactory;
import service.comunicador.VisaComunicadorFactory;
import service.emissor.Emissor;
import service.emissor.EmissorVisa;
import service.receptor.Receptor;
import service.receptor.ReceptorVisa;

import static org.junit.Assert.assertTrue;

public class VisaComunicadorTest {

    private ComunicadorFactory comunicadorFactory;

    public VisaComunicadorTest() {
        comunicadorFactory = new VisaComunicadorFactory();
    }

    @Test
    public void validateIfInstanceIsVisaWhenCreateEmissor() {
        Emissor emissor = comunicadorFactory.createEmissor();
        assertTrue(emissor instanceof EmissorVisa);
    }

    @Test
    public void validateIfInstanceIsVisaWhenCreateReceptor() {
        Receptor receptor = comunicadorFactory.createReceptor();
        assertTrue(receptor instanceof ReceptorVisa);
    }

}
