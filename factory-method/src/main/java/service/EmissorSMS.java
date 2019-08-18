package service;

public class EmissorSMS implements Emissor {

	public void enviar(String mensagem) {
		System.out.println(String.format("Enviando sms: %", mensagem));
	}

}
