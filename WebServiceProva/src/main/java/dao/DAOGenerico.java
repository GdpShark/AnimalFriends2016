package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Adocao;
import modelo.Denuncia;

public class DAOGenerico {

    EntityManagerFactory objEMF = Persistence.createEntityManagerFactory("WebServiceProva");
    EntityManager objEM = objEMF.createEntityManager();
    public void fechaEM() {
        objEM.close();
        objEMF.close();
    }
    
    // CADASTRAR
    public void cadastrar(Object objInserir) {
        objEM.getTransaction().begin();
        objEM.persist(objInserir);
        objEM.getTransaction().commit();
    }
    
    //ALTERAR
    public void alterar(Object objetoAlterar){
        objEM.getTransaction().begin();
        objEM.merge(objetoAlterar);
        objEM.getTransaction().commit();
    }
    
    //EXCLUIR Adoção
    public void excluirAdocao(Long id){
        Adocao exclusao=objEM.find(Adocao.class, id);
        objEM.getTransaction().begin();
        objEM.remove(exclusao);
        objEM.getTransaction().commit();       
    }
  //EXCLUIR Denuncia
    public void excluirDenuncia(Long id){
        Denuncia exclusao=objEM.find(Denuncia.class, id);
        objEM.getTransaction().begin();
        objEM.remove(exclusao);
        objEM.getTransaction().commit();       
    }
    
    // LISTAR PRODUTOS
    @SuppressWarnings("unchecked")
	public List<Adocao> listarAdocao() {
        Query consulta = objEM.createQuery("FROM Adocao");
        List<Adocao> lista = consulta.getResultList();
        return lista;
    }
 // LISTAR PRODUTOS
    @SuppressWarnings("unchecked")
	public List<Denuncia> listarDenuncia() {
        Query consulta = objEM.createQuery("FROM Adocao");
        List<Denuncia> lista = consulta.getResultList();
        return lista;
    }
}