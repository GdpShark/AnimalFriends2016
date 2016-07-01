package modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adocao")
public class Adocao implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="adcId")
	private Long id;
	@Column(name="adcNomeAnimal")
    private String nomeAnimal;
	@Column(name="adcadcCpfAnuncianteId")
    private String cpfAnunciante;
	@Column(name="adcDescricaoAnimal")
    private String descricaoAnimal;
	@Column(name="adcNomeAnunciante")
    private String nomeAnunciante;
	@Column(name="adcInfoContato")
    private String infoContato;
	@Column(name="adcEspecie")
    private String especie;
	@Column(name="adcSexo")
    private String sexo;
	@Column(name="adcPorte")
    private String porte;
	@Column(name="adcPeso")
    private Double peso;
	@Column(name="adcIdade")
    private Integer idade;
	@Column(name="adcPelagem")
    private String pelagem;
	@Column(name="adcRaca")
    private String raca;
	@Column(name="adcCastrado")
    private Boolean castrado;
	@Column(name="adcLinkVideo")
    private String linkVideo;
	@Column(name="adcDataCadastro")
    private Date dataCadastro;
	@Column(name="adcCidade")
    private String cidade;

	public Adocao() {
		super();
	}

	/**
	 * @param id
	 * @param nomeAnimal
	 * @param cpfAnunciante
	 * @param descricaoAnimal
	 * @param nomeAnunciante
	 * @param infoContato
	 * @param especie
	 * @param sexo
	 * @param porte
	 * @param peso
	 * @param idade
	 * @param pelagem
	 * @param raca
	 * @param castrado
	 * @param linkVideo
	 * @param dataCadastro
	 * @param cidade
	 */
	public Adocao(Long id, String nomeAnimal, String cpfAnunciante, String descricaoAnimal, String nomeAnunciante,
			String infoContato, String especie, String sexo, String porte, Double peso, Integer idade, String pelagem,
			String raca, Boolean castrado, String linkVideo, Date dataCadastro, String cidade) {
		super();
		this.id = id;
		this.nomeAnimal = nomeAnimal;
		this.cpfAnunciante = cpfAnunciante;
		this.descricaoAnimal = descricaoAnimal;
		this.nomeAnunciante = nomeAnunciante;
		this.infoContato = infoContato;
		this.especie = especie;
		this.sexo = sexo;
		this.porte = porte;
		this.peso = peso;
		this.idade = idade;
		this.pelagem = pelagem;
		this.raca = raca;
		this.castrado = castrado;
		this.linkVideo = linkVideo;
		this.dataCadastro = dataCadastro;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getCpfAnunciante() {
		return cpfAnunciante;
	}

	public void setCpfAnunciante(String cpfAnunciante) {
		this.cpfAnunciante = cpfAnunciante;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getNomeAnunciante() {
		return nomeAnunciante;
	}

	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}

	public String getInfoContato() {
		return infoContato;
	}

	public void setInfoContato(String infoContato) {
		this.infoContato = infoContato;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
