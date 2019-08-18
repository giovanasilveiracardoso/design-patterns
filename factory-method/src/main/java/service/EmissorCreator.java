package service;

public class EmissorCreator {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	
	public Emissor create(int tipoDeEmissor) {
		switch (tipoDeEmissor) {
		case SMS:
			return new EmissorSMS();
		case EMAIL:
			return new EmissorEmail();
		default:
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
	
}
