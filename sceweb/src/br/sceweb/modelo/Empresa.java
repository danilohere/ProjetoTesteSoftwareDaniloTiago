package br.sceweb.modelo;

import java.util.InputMismatchException;

public class Empresa {
	public String cnpj;
	public String nomeDaEmpresa;
	public String nomeFantasia;
	public String endereco;
	public String telefone;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if(cnpj.equals("")){
			throw new IllegalArgumentException("CNPJ Inválido");
		}else{
			this.cnpj = cnpj;
		}
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if(nomeDaEmpresa.equals("")){
			throw new IllegalArgumentException("Nome da empresa Inválido");
		}else{
			this.nomeDaEmpresa = nomeDaEmpresa;
		}
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if(nomeFantasia.equals("")){
			throw new IllegalArgumentException("Nome fantasia Inválido");
		}else{
			this.nomeFantasia = nomeFantasia;
		}
	}

	public String getTelefone() {

		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone.equals("")){
			throw new IllegalArgumentException("Telefone Inválido");
		}else{
			this.telefone = telefone;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.equals("")){
			throw new IllegalArgumentException("Endereço Inválido");
		}else{
			this.endereco = endereco;
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nomeDaEmpresa == null) {
			if (other.nomeDaEmpresa != null)
				return false;
		} else if (!nomeDaEmpresa.equals(other.nomeDaEmpresa))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}
