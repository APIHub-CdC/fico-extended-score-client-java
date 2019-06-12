package io.apihub.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.apihub.client.model.Reason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Datos de la respuesta de FICO Score")

public class Response {
	@SerializedName("score")
	private Integer score = null;

	@SerializedName("razones")
	private List<Reason> razones = new ArrayList<Reason>();

	public Response score(Integer score) {
		this.score = score;
		return this;
	}

	@ApiModelProperty(required = true, value = "Calificación que obtuvo la persona evaluada")
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Response razones(List<Reason> razones) {
		this.razones = razones;
		return this;
	}

	public Response addRazonesItem(Reason razonesItem) {
		this.razones.add(razonesItem);
		return this;
	}

	/**
	 * Razones por las que se generó el score
	 * 
	 * @return razones
	 **/
	@ApiModelProperty(required = true, value = "Razones por las que se generó el score")
	public List<Reason> getRazones() {
		return razones;
	}

	public void setRazones(List<Reason> razones) {
		this.razones = razones;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Response response = (Response) o;
		return Objects.equals(this.score, response.score) && Objects.equals(this.razones, response.razones);
	}

	@Override
	public int hashCode() {
		return Objects.hash(score, razones);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Response {\n");

		sb.append("    score: ").append(toIndentedString(score)).append("\n");
		sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
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
