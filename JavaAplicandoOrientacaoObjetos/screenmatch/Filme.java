package screenmatch;

public class Filme {
	private String nome;
	private int anoDeLancamento;
	boolean incluidoNoPlano;
	private double avaliacao;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
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
	
	//ATRAVÉS DOS GETTERS TORNAMOS AS REGRAS DE NEGÓCIOS RECURSIVAS
	int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
}