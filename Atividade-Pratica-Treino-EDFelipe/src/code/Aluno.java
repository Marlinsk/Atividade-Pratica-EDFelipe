package code;

public class Aluno {
	
    private String nome;
    private int idade;
    public int matricula;
    
    public Aluno(String nome, int idade, int matricula){
       this.nome = nome;
       this.idade = idade;
       this.matricula = matricula;
    }
    
    public String get_Nome(){
         return(this.nome);
    }
    
    public int get_Idade(){
         return(this.idade);
    }
    
	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "FICHA DO ALUNO [nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
	}
    
	
}
