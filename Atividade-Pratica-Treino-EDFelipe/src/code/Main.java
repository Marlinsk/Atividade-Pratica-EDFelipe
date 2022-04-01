package code;

public class Main {

	public static void main(String[] args) {
		
	   Lista lista_aluno = new Lista(4);
	       
       //Criando 4 objetos do tipo aluno
       Aluno a1 = new Aluno("Joao", 30, 567);
       Aluno a2 = new Aluno("Maria", 23, 234);
       Aluno a3 = new Aluno("Sara", 34, 67);
       Aluno a4 = new Aluno("Gabriela", 19, 211);
       
       //Adicionando os alunos na Sala de aula. Aqui representada pela estrutura de dados lista.
       System.out.println("TAMANHO DA LISTA: " + lista_aluno.Lista_Aluno.length + "\n");
       
       lista_aluno.Inserir(a1);
       lista_aluno.Inserir(a2);
       lista_aluno.Inserir(a3);
       lista_aluno.Inserir(a4);
       
       lista_aluno.imprimir();
       
       lista_aluno.pesquisa(567);
       
       lista_aluno.remover("Joao");
     
	}
}
