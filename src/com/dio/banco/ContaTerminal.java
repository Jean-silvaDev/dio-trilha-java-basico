package com.dio.banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static String menu() {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite o número da agência: ");
		int numeroAgencia = scan.nextInt(); scan.nextLine();
		System.out.print("Digite a agência: ");
		String agencia = scan.nextLine();
		System.out.print("Digite o nome do cliente: ");
		String nome = scan.nextLine();
		System.out.print("Digite o saldo: $");
		float saldo = scan.nextFloat();
		scan.close();
		return "Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numeroAgencia)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque");
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(menu());
	}
}
