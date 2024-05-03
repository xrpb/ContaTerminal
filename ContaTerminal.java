package main;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		String agency;
		String client;
		double saldo = 237.48;
		
		System.out.println("Por Favor, Digite seu nome: ");
		client = sc.nextLine();
		System.out.println("Por favor Digite sua agência: ");
		agency = sc.next();
		System.out.println("Por favor Digite o numero da conta: ");
		number = sc.nextInt();
		System.out.printf("Olá, %s , obrigado  por criar uma conta em nosso banco, sua agência é: %s , conta: %d , e seu saldo: %.2f já está disponivel para saque",client,agency,number,saldo);
		
		
		sc.next();

	}

}
