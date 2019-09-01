package service.emissor;

import enums.Bandeira;

public class EmissorCreator {

	public Emissor create(Bandeira bandeira) {
	    switch (bandeira) {
            case VISA:
                return new EmissorVisa();
            case MASTERCARD:
                return new EmissorMastercard();
            default:
                throw new IllegalArgumentException("Tipo de emissor não suportado");
        }
	}
	
}
