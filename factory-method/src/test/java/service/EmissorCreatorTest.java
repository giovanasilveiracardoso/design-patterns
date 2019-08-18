package service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmissorCreatorTest {

    @Test
    public void deveCriarUmEmissorSMS(){
        EmissorCreator emissorCreator = new EmissorCreator();
        Emissor emissor = emissorCreator.create(EmissorCreator.SMS);

        assertTrue(emissor instanceof EmissorSMS);
    }

    @Test
    public void deveCriarUmEmissorEmail(){
        EmissorCreator emissorCreator = new EmissorCreator();
        Emissor emissor = emissorCreator.create(EmissorCreator.EMAIL);

        assertTrue(emissor instanceof EmissorEmail);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcessaoQuandoNaoExistirTipoEmissor(){
        EmissorCreator emissorCreator = new EmissorCreator();
        Emissor emissor = emissorCreator.create(2);
    }
}
