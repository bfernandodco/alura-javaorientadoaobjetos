package screenmatch;

public class Main {

	public static void main(String[] args) {
		/*INSTANCIAR UM OBJETO DA CLASSE FILME
		 * A VARIÁVEL meuFilme É A REFERENCIA AO OBJETO Filme INSTANCIADO
		 */
		Filme meuFilme = new Filme();
		
		/* A PARTIR DO ENCAPSULAMENTO DOS ATRIBUTOS DA CLASSE FILME, NÃO É MAIS
		 * PERMITIDO ALTERAR OS ATRIBUTOS DE FORMA DIRETA. ISSO GARANTE
		 * BOAS PRÁTICAS NO DESENVOLVIMENTO.
		meuFilme.nome = "The God Father";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180; */
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(6);
		meuFilme.avalia(3);
		meuFilme.avalia(9);
		
		System.out.println("A média de avaliações do filme é de: " + meuFilme.pegaMedia());
		
		/*O MODIFICADOR DE ACESSO PRIVATE NO MÉTODO INVOCADO NÃO PERMITE
		 * ALTERAÇÕES DIRETAS NA SUA INVOCAÇÃO, PODENDO SER ACESSADO APENAS
		 * DENTRO DA PRÓPRIA CLASSE.
		 */
		
		System.out.println(meuFilme.getTotalDeAvaliacoes());
	}
}