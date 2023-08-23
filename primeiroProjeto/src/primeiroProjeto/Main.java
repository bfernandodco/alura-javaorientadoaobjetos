package primeiroProjeto;

public class Main {

	public static void main(String[] args) {
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top Gun: Maverick");
		
		//VARIÁVEIS
		int anoDeLancamento = 2022;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		//CALCULA A MÉDIA DE TRÊS AVALIADORES
		double media = (9.8 + 6.3 + 8.0) / 3;
		String sinopse;
		
		//IMPRESSÕES
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println(media);
		
		
		//TEXT BLOCKS A PARTIR DO JAVA 15
		sinopse = """
				Filme Top Gun
				Filme de aventura com galã dos anos 80
				Muito bom!
				Ano de Lançamento
				""" + anoDeLancamento;
		System.out.println(sinopse);
		
		/*FORMATANDO COM format() DA CLASSE STRING E PLACEHOLDERS
		 * %s STRING
		 * %d VALOR INTEIRO
		 * %.nf VALOR DECIMAL
		 */
		
		String nome = "Maria";
		int idade = 30;
		double valor = 55.9999;
		System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
		
		//USANDO .formatted() COM TEXT BLOCK
		String nome2 = "João";
		int aulas = 4;
		String mensagem = """
						Olá, %s!
						Boas vindas ao curso de Java.
						Teremos %d aulas para te mostrar o que é preciso para você mergulhar no Java
						""".formatted(nome2,aulas);
		
		//CASTING EXPLICITO
		int classificacao = (int) (media /2);
		System.out.println(classificacao);
		
		//CASTING IMPLÍCITO
		int x = 10;
		double y = x;
		System.out.println(y);
		
		//A CONCATENAÇÃO PODE SER REALIZADA ENTRE MAIS DE UM TIPO DE VARIÁVEIS
		String saudacao = "Olá, meu nome é ";
		String pessoa = "Alice ";
		String minhaIdade = "Minha idade é: ";
		int anos = 17;
		System.out.println(saudacao + pessoa + minhaIdade + anos);
	}
}