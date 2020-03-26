package app.clinica;

import java.util.Date;

public class Revision {

	private Date fechaRevisi�n;
	private String idDoctor;
	private String motivo;
	private String diagnostico;
	private String tratamiento;

	public Revision() {
		super();
		this.fechaRevisi�n = new Date();
		this.idDoctor = "";
		this.motivo = "";
		this.diagnostico = "";
		this.tratamiento = "";
	}

	public Date getFechaRevisi�n() {
		return fechaRevisi�n;
	}

	public void setFechaRevisi�n(Date fechaRevisi�n) {
		this.fechaRevisi�n = fechaRevisi�n;
	}

	public String getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(String idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public String toString() {
		return "Revision [fechaRevisi�n=" + fechaRevisi�n + ", idDoctor=" + idDoctor + ", motivo=" + motivo
				+ ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + "]";
	}

}
