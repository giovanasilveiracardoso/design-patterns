package service.receptor;

import enums.Bandeira;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class ReceptorCreatorTest {

    private ReceptorCreator receptorCreator;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    public ReceptorCreatorTest() {
        receptorCreator = new ReceptorCreator();
    }

    @Test
    public void validateInstanceReceptorVisa() {
        Receptor receptor = receptorCreator.create(Bandeira.VISA);
        assertTrue(receptor instanceof ReceptorVisa);
    }

    @Test
    public void validateInstanceReceptorMastercard() {
        Receptor receptor = receptorCreator.create(Bandeira.MASTERCARD);
        assertTrue(receptor instanceof ReceptorMastercard);
    }

    @Test
    public void validateIfThrowExceptionWhenNotExistBandeira() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Tipo de receptor não suportado");

        receptorCreator.create(Bandeira.ELO);
    }

}
