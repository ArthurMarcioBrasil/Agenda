package Agenda;

public class Pessoa {
    
	public String nome;
    public String email;
    public long tel;
    public String endereco;
    public String aniversario;
    public String url;
    
    public Pessoa(String nome, String email, long tel, String endereco, String aniversario, String url)
    {
    
    this.nome = nome;
    this.endereco = endereco;
    this.tel = tel;
    this.email = email; 
    this.aniversario = aniversario;
    this.url = url;
    }


public String getNome(){
    return nome;
}
     
public void setNome(String nome){
    this.nome = nome;
}

public String getEndereço(){
    return endereço;
}
public void setEndereco(String endereco){
    this.endereço = endereco;
}

public long getTel(){
    return tel;
}
public void setTel(long tel){
    this.tel = tel;
}        

public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email  = email;
}

public String getAniversario(){
    return aniversario;
}

public void setAniversario(String aniversario){
    this.aniversario = aniversario;
}

public String getUrl(){
    return url;
}
public void setUrl(String url){
    this.url = url;
}

}