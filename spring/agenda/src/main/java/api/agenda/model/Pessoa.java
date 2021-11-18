package api.agenda.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.URL;


@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message="Insira um nome")
	private String nome;
	
	@Pattern(regexp="[0-9]{2}", message="Insira uma idade válida")
	private String idade;
	
	@NotEmpty(message="Insira um endereço")
	private String endereço;
	
	@Pattern(regexp="^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Insira um email válido")
	private String email;
	
	@Pattern(regexp="^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message="Insira um telefone válido")
	private String telefone;
	
	@URL(protocol="https", host="[facebook,twitter,github,instagram]", message="Insira uma URL válida")
	private String redesSociais;
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getRedesSociais() {
		return redesSociais;
	}

	public void setRedesSociais(String redesSociais) {
		this.redesSociais = redesSociais;
	}
}
