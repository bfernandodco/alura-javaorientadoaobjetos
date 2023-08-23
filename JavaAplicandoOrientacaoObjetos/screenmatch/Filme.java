package screenmatch;

public class Filme {
	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	double avaliacao;
	double somaDasAvaliacoes;
	int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
	//VOID NÃO DEVOLVE VALORES
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println("Incluido no plano: " + incluidoNoPlano);
		System.out.println("Avaliações: " + avaliacao);
	}
	
	//MÉTODO QUE RECEBE UM PARAMETRO DO TIPO DOUBLE
	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	//MÉTODO COM TIPO DEFINIDO RETORNAM VALORES
	double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
}