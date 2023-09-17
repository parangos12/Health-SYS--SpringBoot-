package com.apmanager.DTO;

import com.apmanager.entity.Affiliate;

public class AffiliateDTO {
	
	private String mensaje;
	private int status;
	private Affiliate affiliate;

	public AffiliateDTO(String mensaje, int status, Affiliate affiliate) {
		this.mensaje = mensaje;
		this.status = status;
		this.affiliate = affiliate;
	}
	public AffiliateDTO() {
	}
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Affiliate getAffiliate() {
		return affiliate;
	}

	public void setAffiliate(Affiliate affiliate) {
		this.affiliate = affiliate;
	}

	
	
	
	
}
