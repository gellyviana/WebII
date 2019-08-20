
public class Pessoa {
	
	private String nome;
	private int id;
	private int idade;
	Papel papel = new Papel();
	
	Pessoa(String nome, int idade, String funcao){
		this.nome = nome;
		this.idade = idade;
		this.papel.setFuncao(funcao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
