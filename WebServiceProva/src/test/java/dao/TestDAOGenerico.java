package dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import modelo.Denuncia;

public class TestDAOGenerico {

	private DAOGenerico daoGenerico = new DAOGenerico();
	
	@Test
	public void testeDenuncia(){
		Denuncia denuncia = new Denuncia();
		denuncia.setCidade("Paranavaí");
		denuncia.setDescricaoAnimal("Animal mal tratado pelo dono");
		denuncia.setInfoContato("9999-0000");
		denuncia.setLatitude(111.000);
		denuncia.setLongitude(333.000);
		daoGenerico.inserir(denuncia);
		
		//Testar inserir denuncia
		List<Denuncia> denuncias = daoGenerico.listar(Denuncia.class);
		Assert.assertEquals(1, denuncias.size());
		
		//Testar alterar denuncia
		denuncia.setDescricaoAnimal("Animal feio pacaramba");
		daoGenerico.alterar(denuncia);
		Assert.assertEquals("Animal feio pacaramba", denuncia.getDescricaoAnimal());
		
		//Testar excluir denuncia
		Long id3 = denuncia.getId();
		daoGenerico.excluirDenuncia(denuncia.getId());
		Assert.assertNotNull(denuncia.getDescricaoAnimal());
	}
}
