package service.receptor;

import enums.Bandeira;

public class ReceptorCreator {

	public Receptor create(Bandeira bandeira) {
		switch (bandeira) {
			case MASTERCARD:
				return new ReceptorMastercard();
			case VISA:
				return new ReceptorVisa();
			default:
				throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
	}
	
}
