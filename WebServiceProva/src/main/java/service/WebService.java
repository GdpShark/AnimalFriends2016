package service;


import java.sql.Date;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import dao.DAOGenerico;
import modelo.Adocao;
import modelo.Denuncia;

@Path("/webservice")
@ApplicationPath("/resource")
public class WebService extends Application{
	
	@POST
	@Path("/cadastraradocao")
	public void cadAdocao(
			@FormParam("nomeAnimal") String nomeAnimal,
			@FormParam("cpfAnunciante") String cpfAnunciante,
			@FormParam("descricaoAnimal") String descricaoAnimal,
			@FormParam("nomeAnunciante") String nomeAnunciante,
			@FormParam("infoContato") String infoContato,
			@FormParam("especie") String especie,
			@FormParam("sexo") String sexo,
			@FormParam("porte") String porte,
			@FormParam("peso") Double peso,
			@FormParam("idade") Integer idade,
			@FormParam("pelagem") String pelagem,
			@FormParam("raca") String raca,
			@FormParam("castrado") Boolean castrado,
			@FormParam("linkVideo") String linkVideo,
			@FormParam("dataCadastro") Date dataCadastro,
			@FormParam("cidade") String cidade)
	{
		DAOGenerico dao = new DAOGenerico();
		Adocao adocao = new Adocao();
		adocao.setNomeAnimal(nomeAnimal);
		adocao.setCpfAnunciante(cpfAnunciante); 
		adocao.setDescricaoAnimal(descricaoAnimal); 
		adocao.setNomeAnunciante(nomeAnunciante);
		adocao.setInfoContato(infoContato);
		adocao.setEspecie(especie);
		adocao.setSexo(sexo);
		adocao.setPorte(porte);
		adocao.setPeso(peso);
		adocao.setIdade(idade); 
		adocao.setPelagem(pelagem);
		adocao.setRaca(raca);
		adocao.setCastrado(castrado);
		adocao.setLinkVideo(linkVideo);
		adocao.setDataCadastro(dataCadastro);
		adocao.setCidade(cidade);
		
		dao.cadastrar(adocao);
	}
	
	@POST
	@Path("/cadastrardenuncia")
	public void cadDenuncia(
			@FormParam("descricaoAnimal") String descricaoAnimal,
			@FormParam("infoContato") String infoContato,
			@FormParam("cidade") String cidade,
			@FormParam("latitude") Double latitude,
			@FormParam("longitude") Double longitude)
	{
		DAOGenerico dao = new DAOGenerico();
		Denuncia denuncia = new Denuncia();
		denuncia.setDescricaoAnimal(descricaoAnimal);
		denuncia.setInfoContato(infoContato);
		denuncia.setCidade(cidade);
		denuncia.setLatitude(latitude);
		denuncia.setLongitude(longitude);
		
		dao.cadastrar(denuncia);
	}
}
