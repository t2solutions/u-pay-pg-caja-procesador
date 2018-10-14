package com.upayments.pg.caja.api.entity.constants;

public enum CodeReturnEnum {

	SUCCESS(0, "Procesada con éxito"),
	ERROR_DATOS(10, "Datos obligatorios no enviados"),
	ERRROR_DB(20, "Error de base de datos U-Payments"),
	DATA_NOT_FOUND(30, "Datos no localizados"),
	DATA_DUPLICATED(31, "Datos duplicados, ya existe un registro para los datos informados"),
	ERROR_PROCESADOR(40, "Error de comunicación con el procesador"),
	ERROR_TIMEOUT(91, "Tiempo de espera interno U-Payment"),
	INTERNAL_ERROR(99, "Problema interno U-Payment");

	private Integer codeError;
	private String textError;

	private CodeReturnEnum(Integer codeError, String textError) {
		this.codeError = codeError;
		this.textError = textError;
	}
	
	public static CodeReturnEnum getById(Integer id) {
		for(CodeReturnEnum c: values()) {
			if(c.getCodeError() == id) {
				return c;
			}
		}
		return null;
	}

	public Integer getCodeError() {
		return codeError;
	}

	public void setCodeError(Integer codeError) {
		this.codeError = codeError;
	}

	public String getTextError() {
		return textError;
	}

	public void setTextError(String textError) {
		this.textError = textError;
	}

}
