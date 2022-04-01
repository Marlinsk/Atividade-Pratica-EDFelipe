package code;

import java.util.Arrays;

public class Lista {
	
	public int primeiro = 0;
    public int ultimo = 0;
    public Aluno[] Lista_Aluno;

    // Método Construtor
    public Lista(int maximo) {
        this.primeiro = 0; 
        this.ultimo = this.primeiro;
        Lista_Aluno = new Aluno[maximo];
    }

    // Método para testar se a lista está vazia
    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    // Método para adicionar um aluno na lista
    public void Inserir(Aluno a1) {
        if (this.ultimo >= this.Lista_Aluno.length) {
            System.out.println("Lista Cheia....Nao e permitido adicionar outro aluno");
        } else {
            this.Lista_Aluno[this.ultimo] = a1;
            this.ultimo = this.ultimo + 1;
            System.out.println("ALUNO INSERIDO COM SUCESSO!");
        }
    }
    
    // Criar Método para Remover um aluno da lista com base no seu nome
    public void remover(String nome) {
    	Aluno[] aux = null;
        for (int i = 0; i < Lista_Aluno.length - 1; i++) {
        	if (Lista_Aluno[i].get_Nome().equals(nome)) {
        		aux = new Aluno[Lista_Aluno.length - 1];
        		for(int index = 0; index < i; index++) {
        			aux[index] = Lista_Aluno[index];
        		}
        		for(int j = i; j < Lista_Aluno.length - 1; j++){
        			aux[j] = Lista_Aluno[j+1];
                }
        		System.out.println("\nALUNO EXCLUÍDO COM SUCESSO!");
        		break;
        	}
        }
        System.out.println(Arrays.toString(aux));
    }
    
    // Criar Método para recuperar os dados de  um aluno em especifico da lista com base no seu nome
    public void pesquisa(int matricula) {
    	System.out.println("\nALUNO ENCONTRADO COM SUCESSO!");
    	for(int i = 0; i < Lista_Aluno.length; i++) {
    		if(Lista_Aluno[i].getMatricula() == matricula) {
    			System.out.println("[nome=" + Lista_Aluno[i].get_Nome() + ", idade=" + Lista_Aluno[i].get_Idade() + ", matricula=" + Lista_Aluno[i].getMatricula() + "]");
    		}
    	}
    }
    
    // Criar Método para imprimir todos os dados de cada aluno da lista
    public void imprimir() {
    	System.out.println("\nLISTA DE ALUNOS CADASTRADOS");
    	System.out.println(Arrays.toString(Lista_Aluno));
    }
}
