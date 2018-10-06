package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("chocolate 5 stars", 2.50);
		
		System.out.println("Hoje eu estou afim de comprar um " + produto.getNome() + "com valor de " + produto.getPreco());
	} 
}
