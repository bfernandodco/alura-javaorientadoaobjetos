package br.com.alura.CriandoSuaPrimeiraAplicacao.ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		//ENTRADA DE DADOS DA TEMPERATURA
		String celsius = JOptionPane.showInputDialog("Informe a temperatura em Celsius");
		
		//CONVERSÃO DE STRING PARA DOUBLE
		double grausCelsius = Double.parseDouble(celsius);
		
		//CÁLCULO DE CONVERSÃO
		double fahrenheit = (grausCelsius * 1.8) + 32;
		System.out.printf("A temperatura de %s°C em Fahrenheit é de: %.0f°F",celsius,fahrenheit);
	}
}