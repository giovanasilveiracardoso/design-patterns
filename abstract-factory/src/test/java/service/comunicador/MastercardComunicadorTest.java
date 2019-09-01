package service.comunicador;

import org.junit.Assert;
import org.junit.Test;
import service.comunicador.ComunicadorFactory;
import service.comunicador.MastercardComunicadorFactory;
import service.emissor.Emissor;
import service.emissor.EmissorMastercard;
import service.receptor.Receptor;
import service.receptor.ReceptorMastercard;

import static org.junit.Assert.assertTrue;

public class MastercardComunicadorTest {

    private ComunicadorFactory comunicadorFactory;

    public MastercardComunicadorTest() {
        comunicadorFactory = new MastercardComunicadorFactory();
    }

    @Test
    public void validateIfInstanceIsMastercardWhenCreateEmissor() {
        Emissor emissor = comunicadorFactory.createEmissor();
        assertTrue(emissor instanceof EmissorMastercard);
    }

    @Test
    public void validateIfInstanceIsMastercardWhenCreateReceptor() {
        Receptor receptor = comunicadorFactory.createReceptor();
        assertTrue(receptor instanceof ReceptorMastercard);
    }

}
