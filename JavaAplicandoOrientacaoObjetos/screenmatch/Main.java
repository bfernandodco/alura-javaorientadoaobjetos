package screenmatch;

/*A IMPORTAÇÃO DO PACOTE COM A CLASSE FILME, GARANTE
 * QUE ESSA CLASSE MAIN UTILIZE SEUS MÉTODOS
 */
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

	public static void main(String[] args) {
		/*INSTANCIAR UM OBJETO DA CLASSE FILME
		 * A VARIÁVEL meuFilme É A REFERENCIA AO OBJETO Filme INSTANCIADO
		 */
		Filme meuFilme = new Filme();
		Serie serie = new Serie();
		
		/* A PARTIR DO ENCAPSULAMENTO DOS ATRIBUTOS DA CLASSE FILME, NÃO É MAIS
		 * PERMITIDO ALTERAR OS ATRIBUTOS DE FORMA DIRETA. ISSO GARANTE
		 * BOAS PRÁTICAS NO DESENVOLVIMENTO.
		meuFilme.nome = "The God Father";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180; */
		
		
		/*COM OS SETTERS DEFINIDOS, UTILIZAMOS PARA MANIPULAR AS VARIÁVEIS
		 * DO OBJETO INSTANCIADO
		 */
		meuFilme.setNome("The God Father");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.setIncluidoNoPlano(true);
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(6);
		meuFilme.avalia(3);
		meuFilme.avalia(9);
		
		//INVOCAÇÃO DO MÉTODO DENTRO DO PRINT
		System.out.println("A média de avaliações do filme é de: " + meuFilme.pegaMedia());
		System.out.println(meuFilme.getTotalDeAvaliacoes());
		
		//UTILIZANDO A HERANÇA É POSSÍVEL UTILIZAR ATRIBUTOS E MÉTODOS DA MÃE
		serie.setNome("Breaking Bad");
		serie.setTemporada(5);
		serie.setAnoDeLancamento(2015);
		serie.setEpisodiosPorTemporada(10);
	}
}