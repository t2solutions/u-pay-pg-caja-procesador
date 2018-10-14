package com.upayments.pg.caja.api.io.transaccion;

import com.upayments.pg.caja.api.io.ReturnStatusOutput;

public class PortadorTransferenciaOutput {

	private Long idTransferencia;
	private ReturnStatusOutput output;

	public PortadorTransferenciaOutput() {

	}

	public ReturnStatusOutput getOutput() {
		if (output == null) {
			output = new ReturnStatusOutput();
		}
		return output;
	}

	public void setOutput(ReturnStatusOutput output) {
		this.output = output;
	}

	public Long getIdTransferencia() {
		return idTransferencia;
	}

	public void setIdTransferencia(Long idTransferencia) {
		this.idTransferencia = idTransferencia;
	}

}
