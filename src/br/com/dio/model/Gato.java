package br.com.dio.model;

import java.util.Objects;

public class Gato {

	private String nomoe;
	private String cor;
	private Integer idade;

	/* criei o construtor automaticamente pelo CTRL + 3 */

	public Gato() {
	}

	public Gato(String nomoe, String cor, Integer idade) {
		this.nomoe = nomoe;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNomoe() {
		return nomoe;
	}

	public void setNomoe(String nomoe) {
		this.nomoe = nomoe;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nomoe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade)
				&& Objects.equals(nomoe, other.nomoe);
	}

	@Override
	public String toString() {
		return "Gato [nomoe=" + nomoe + ", cor=" + cor + ", idade=" + idade + "]";
	}

}
