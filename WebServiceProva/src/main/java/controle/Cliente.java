package controle;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Cliente {
	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();
		String msgAdocao = cliente.target("http://localhost:8180/ServicoWeb/resource/webservice/cadastraradocao").request().get(String.class);
		System.out.println("Mensagem: "+msgAdocao);
		
		String msgDenuncia = cliente.target("http://localhost:8180/ServicoWeb/resource/webservice/cadastrardenuncia").request().get(String.class);
		System.out.println("Mensagem: "+msgDenuncia);
		
//		WebTarget target = cliente.target("http://localhost:8180/ServicoWeb/resources/MeuRest/sqrt");
//		Integer resultado = target.queryParam("resultado", 10).request().get(Integer.class);
//		System.out.println(resultado);
	}
}
