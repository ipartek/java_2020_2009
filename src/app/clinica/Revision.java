package app.clinica;

import java.util.Date;

public class Revision {

	private Date fechaRevisión;
	private String idDoctor;
	private String motivo;
	private String diagnostico;
	private String tratamiento;

	public Revision() {
		super();
		this.fechaRevisión = new Date();
		this.idDoctor = "";
		this.motivo = "";
		this.diagnostico = "";
		this.tratamiento = "";
	}

	public Date getFechaRevisión() {
		return fechaRevisión;
	}

	public void setFechaRevisión(Date fechaRevisión) {
		this.fechaRevisión = fechaRevisión;
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
		return "Revision [fechaRevisión=" + fechaRevisión + ", idDoctor=" + idDoctor + ", motivo=" + motivo
				+ ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + "]";
	}

}
