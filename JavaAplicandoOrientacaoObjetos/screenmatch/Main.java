package screenmatch;

public class Main {

	public static void main(String[] args) {
		/*INSTANCIAR UM OBJETO DA CLASSE FILME
		 * A VARIÁVEL meuFilme É A REFERENCIA AO OBJETO Filme INSTANCIADO
		 */
		Filme meuFilme = new Filme();
		
		meuFilme.nome = "The God Father";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(6);
		meuFilme.avalia(3);
		meuFilme.avalia(9);
		
		System.out.println("A média de avaliações do filme é de: " + meuFilme.pegaMedia());
	}
}