package br.sceweb.teste;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

	public static Empresa empresa;
	public static EmpresaDAO empresaDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();

		empresa.setNomeEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}

	@Test
	public void CT01UC01FB_Cadastrar_empresa_com_sucesso() {
		// fail("Not yet implemented");
		assertEquals(1, empresaDAO.adiciona(empresa));
	}
	
	@Test
	public void CT01UC01FB_Cadastrar_empresa_cnpj_vazio(){
		
	}
	

}
