package service.comunicador;

import enums.Bandeira;
import service.emissor.Emissor;
import service.emissor.EmissorCreator;
import service.receptor.Receptor;
import service.receptor.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {

    private EmissorCreator emissorCreator;
    private ReceptorCreator receptorCreator;

    public VisaComunicadorFactory() {
        emissorCreator = new EmissorCreator();
        receptorCreator = new ReceptorCreator();
    }

    public Emissor createEmissor() {
        return emissorCreator.create(Bandeira.VISA);
    }

    public Receptor createReceptor() {
        return receptorCreator.create(Bandeira.VISA);
    }
}
