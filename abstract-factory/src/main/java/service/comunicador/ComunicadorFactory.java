package service.comunicador;

import service.emissor.Emissor;
import service.receptor.Receptor;

public interface ComunicadorFactory {

    Emissor createEmissor();
    Receptor createReceptor();

}
