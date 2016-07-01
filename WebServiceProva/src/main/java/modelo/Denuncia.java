package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="denuncia")
public class Denuncia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dncId")
	private Long id;
	@Column(name="dncDescricaoAnimal")
    private String descricaoAnimal;
	@Column(name="dncInfoContato")
    private String infoContato;
	@Column(name="dncCidade")
    private String cidade;
	@Column(name="dncLatitude")
    private Double latitude;
	@Column(name="dncLongitude")
    private Double longitude;

	public Denuncia() {
		super();
	}

	

	/**
	 * @param id
	 * @param descricaoAnimal
	 * @param infoContato
	 * @param cidade
	 * @param latitude
	 * @param longitude
	 */
	public Denuncia(Long id, String descricaoAnimal, String infoContato, String cidade, Double latitude,
			Double longitude) {
		super();
		this.id = id;
		this.descricaoAnimal = descricaoAnimal;
		this.infoContato = infoContato;
		this.cidade = cidade;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getInfoContato() {
		return infoContato;
	}

	public void setInfoContato(String infoContato) {
		this.infoContato = infoContato;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}