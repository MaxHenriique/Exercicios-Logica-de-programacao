package javaBasico;

import java.util.Scanner;

public class Exercicio38 {
	
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("LOGIN");
		
		System.out.println("Digite seu Usuário:");
		int usuario = dados.nextInt();
		
		if (usuario != 1234) {
			System.out.println("Usuário Inválido!");
		}else {
			System.out.println("Digite sua senha:");
			int senha = dados.nextInt();
		
		if (senha != 9999) {
			System.out.println("Senha Incorreta!");
		}else {
			System.out.println("|-Acesso Permitido-|");
		}
		}
		
		dados.close();
	}

}

// Exercícios, Lógica de Programação, Algoritmos e JavaScript

/* Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no algoritmo 
 * (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta 
 * senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada 
 * a mensagem ‘Acesso permitido’. */

