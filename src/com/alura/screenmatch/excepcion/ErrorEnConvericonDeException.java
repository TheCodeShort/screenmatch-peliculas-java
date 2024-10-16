package com.alura.screenmatch.excepcion;

public class ErrorEnConvericonDeException extends RuntimeException {
	private String mensaje;

	public ErrorEnConvericonDeException(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String getMessage() {
		return this.mensaje;
	}
}
