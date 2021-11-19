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
	
	@NotEmpty(message="Insira ua idade")
	@Pattern(regexp="[0-9]{2}", message="Insira uma idade válida")
	private String idade;
	
	@NotEmpty(message="Insira o endereço")
	private String endereco;
	
	@NotEmpty(message="Insira o email")
	@Pattern(regexp="^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Insira um email válido")
	private String email;
	
	@NotEmpty(message="Insira o telefone")
	@Pattern(regexp="^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message="Insira um telefone válido")
	private String telefone;
	
	@URL(protocol="https", message="Insira uma URL válida")
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
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
