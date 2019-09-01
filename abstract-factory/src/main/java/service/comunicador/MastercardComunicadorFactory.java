package service.comunicador;

import enums.Bandeira;
import service.emissor.Emissor;
import service.emissor.EmissorCreator;
import service.receptor.Receptor;
import service.receptor.ReceptorCreator;

public class MastercardComunicadorFactory implements ComunicadorFactory {

    private EmissorCreator emissorCreator;
    private ReceptorCreator receptorCreator;

    public MastercardComunicadorFactory() {
        emissorCreator = new EmissorCreator();
        receptorCreator = new ReceptorCreator();
    }

    public Emissor createEmissor() {
        return emissorCreator.create(Bandeira.MASTERCARD);
    }

    public Receptor createReceptor() {
        return receptorCreator.create(Bandeira.MASTERCARD);
    }
}
