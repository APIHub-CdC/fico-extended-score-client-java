package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

@ApiModel(description = "Datos del domicilio de la persona a consultar")

public class Domicilio {
	@SerializedName("direccion")
	private String direccion = null;

	@SerializedName("colonia")
	private String colonia = null;

	@SerializedName("ciudad")
	private String ciudad = null;

	@SerializedName("codigoPostal")
	private String codigoPostal = null;

	@SerializedName("municipio")
	private String municipio = null;

	/**
	 * Estado en que se ubica el domicilio
	 */
	@JsonAdapter(EstadoEnum.Adapter.class)
	public enum EstadoEnum {
		AGS("AGS"),

		BC("BC"),

		BCS("BCS"),

		CAMP("CAMP"),

		COAH("COAH"),

		COL("COL"),

		CHIS("CHIS"),

		CHIH("CHIH"),

		DF("DF"),

		CDMX("CDMX"),

		DGO("DGO"),

		GTO("GTO"),

		GRO("GRO"),

		HGO("HGO"),

		JAL("JAL"),

		MEX("MEX"),

		MICH("MICH"),

		MOR("MOR"),

		NAY("NAY"),

		NL("NL"),

		OAX("OAX"),

		PUE("PUE"),

		QRO("QRO"),

		QROO("QROO"),

		SLP("SLP"),

		SIN("SIN"),

		SON("SON"),

		TAB("TAB"),

		TAMP("TAMP"),

		TLAX("TLAX"),

		VER("VER"),

		YUC("YUC"),

		ZAC("ZAC");

		private String value;

		EstadoEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static EstadoEnum fromValue(String text) {
			for (EstadoEnum b : EstadoEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<EstadoEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final EstadoEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public EstadoEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return EstadoEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("estado")
	private EstadoEnum estado = null;

	public Domicilio direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	@ApiModelProperty(example = "HIDALGO 32", required = true, value = "Calle y número del domicilio")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Domicilio colonia(String colonia) {
		this.colonia = colonia;
		return this;
	}

	@ApiModelProperty(example = "CENTRO", value = "Colonia en que se ubica domicilio")
	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Domicilio ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(value = "Ciudad en que se ubica el domicilio")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Domicilio codigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
		return this;
	}
	
	@ApiModelProperty(example = "47917", required = true, value = "Código postal al que pertenece el domicilio")
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Domicilio municipio(String municipio) {
		this.municipio = municipio;
		return this;
	}

	@ApiModelProperty(example = "LA BARCA", required = true, value = "Municipio en que se ubica el domicilio")
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Domicilio estado(EstadoEnum estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(example = "JAL", required = true, value = "Estado en que se ubica el domicilio")
	public EstadoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Domicilio domicilio = (Domicilio) o;
		return Objects.equals(this.direccion, domicilio.direccion) && Objects.equals(this.colonia, domicilio.colonia)
				&& Objects.equals(this.ciudad, domicilio.ciudad)
				&& Objects.equals(this.codigoPostal, domicilio.codigoPostal)
				&& Objects.equals(this.municipio, domicilio.municipio) && Objects.equals(this.estado, domicilio.estado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, colonia, ciudad, codigoPostal, municipio, estado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Domicilio {\n");

		sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
		sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
		sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
