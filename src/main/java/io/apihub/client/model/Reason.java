package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Razones por las que se generó el score")

public class Reason {
	@SerializedName("clave")
	private String clave = null;

	@SerializedName("descripcion")
	private String descripcion = null;

	public Reason clave(String clave) {
		this.clave = clave;
		return this;
	}

	@ApiModelProperty(required = true, value = "Clave de la razón")
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Reason descripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	@ApiModelProperty(required = true, value = "Descripción de la razón")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Reason reason = (Reason) o;
		return Objects.equals(this.clave, reason.clave) && Objects.equals(this.descripcion, reason.descripcion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(clave, descripcion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Reason {\n");

		sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
		sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
