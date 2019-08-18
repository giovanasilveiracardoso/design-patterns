package service;

public class EmissorEmail implements Emissor {

	public void enviar(String mensagem) {
		System.out.println(String.format("Enviando e-mail: %", mensagem));
	}

}
