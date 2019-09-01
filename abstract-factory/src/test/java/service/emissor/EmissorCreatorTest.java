package service.emissor;

import enums.Bandeira;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class EmissorCreatorTest {

    private EmissorCreator emissorCreator;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    public EmissorCreatorTest() {
        emissorCreator = new EmissorCreator();
    }

    @Test
    public void validateInstanceEmissorVisa() {
        Emissor emissor = emissorCreator.create(Bandeira.VISA);
        assertTrue(emissor instanceof EmissorVisa);
    }

    @Test
    public void validateInstanceEmissorMastercard() {
        Emissor emissor = emissorCreator.create(Bandeira.MASTERCARD);
        assertTrue(emissor instanceof EmissorMastercard);
    }

    @Test
    public void validateIfThrowExceptionWhenNotExistBandeira() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Tipo de emissor não suportado");

        emissorCreator.create(Bandeira.ELO);
    }

}
