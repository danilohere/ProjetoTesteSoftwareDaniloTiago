package br.sceweb.modelo;

import java.util.InputMismatchException;

public class Empresa {
	public String cnpj;
	public String nomeEmpresa;
	public String nomeFantasia;
	public String endereco;
	public String telefone;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if(cnpj.equals("")){
			throw new IllegalArgumentException("CNPJ Inv�lido");
		}else{
			this.cnpj = cnpj;
		}
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		if(nomeEmpresa.equals("")){
			throw new IllegalArgumentException("Nome da empresa Inv�lido");
		}else{
			this.nomeEmpresa = nomeEmpresa;
		}
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if(nomeFantasia.equals("")){
			throw new IllegalArgumentException("Nome fantasia Inv�lido");
		}else{
			this.nomeFantasia = nomeFantasia;
		}
	}

	public String getTelefone() {

		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone.equals("")){
			throw new IllegalArgumentException("Telefone Inv�lido");
		}else{
			this.telefone = telefone;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.equals("")){
			throw new IllegalArgumentException("Endere�o Inv�lido");
		}else{
			this.endereco = endereco;
		}
	}

}
