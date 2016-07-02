package cliente;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modelo.Adocao;

public class ClienteWebService {

	public static void main(String[] args) {		
		Client cli = ClientBuilder.newClient();
//		String st = cli.target("http://localhost:8080/ServicoWeb/resource/WebService/hello").request().get(String.class);
//		System.out.println(st);
//		
//		WebTarget target=cli.target("http://localhost:8080/ServicoWeb/resource/WebService/soma");
//		Integer soma=target.queryParam("valor1", 10).queryParam("valor2", 520).request().get(Integer.class);
//		System.out.println(soma);	
		
		
//		List<Adocao> lista = cli.target("http://localhost:8180/ServicoWeb/resource/MeuRest/cadastraradocao").request(MediaType.APPLICATION_JSON).get(new GenericType<List<Adocao>>() {});
//			for(Adocao adc:lista){
//				System.out.println("Nome: "+adc.getNomeAnimal()+"\n");
//				System.out.println("CPF: "+adc.getCpfAnunciante()+"\n");
//				System.out.println("RG: "+adc.getDescricaoAnimal()+"\n");
//				System.out.println("Nome do Anunciante: "+adc.getNomeAnunciante()+"\n");
//				System.out.println("Informações de Contato: "+adc.getInfoContato()+"\n");
//				System.out.println("Especie: "+adc.getEspecie()+"\n");
//				System.out.println("Sexo: "+adc.getSexo()+"\n");
//				System.out.println("Porte: "+adc.getPorte()+"\n");
//				System.out.println("Peso: "+adc.getPeso()+"\n");
//				System.out.println("Idade: "+adc.getIdade()+"\n");
//				System.out.println("Pelagem: "+adc.getPelagem()+"\n");
//				System.out.println("Raca: "+adc.getRaca()+"\n");
//				System.out.println("Castrado: "+adc.getCastrado()+"\n");
//				System.out.println("Link do Video: "+adc.getLinkVideo()+"\n");
//				System.out.println("Data do Cadastro: "+adc.getDataCadastro()+"\n");
//				System.out.println("Cidade: "+adc.getCidade()+"\n");
//			}
//		System.out.println("Tamanho Lista: "+lista.size());
	
	}
}
