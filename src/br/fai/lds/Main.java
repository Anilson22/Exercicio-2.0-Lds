package br.fai.lds;

import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;

import javax.management.loading.PrivateClassLoader;

public class Main {

	public static void main(String[] args) {
	Main app = new Main();
		app.start();
	}
	
	private static void start() {
		
		Map<String, Integer> map;
		map = new HashMap<>();
		String voto;
		String opcao;
		List<Integer> votosJoao;
		votosJoao = new ArrayList<>();
		ArrayList votosMaria = new ArrayList<>();
		ArrayList votosMJose = new ArrayList<>();
		ArrayList votosAntonio = new ArrayList<>();
		ArrayList votosTRIBURSSINHO = new ArrayList<>();
		
		
		
	
		
		map.put("JOAO", 1);
		map.put("MARIA", 2);
		map.put("JOSE", 3);
		map.put("ANTONIO", 4);
		map.put("TRIBURSSINHO", 5);
		map.put("0", 0);
		
		
		
		boolean encerra = false;
		Integer i = 1;
		
		while (i != 0) {
				
			System.out.println("Lista de candidatos:\r\n"
					+ "1. Joao	2. Maria 3. Jose 4. Antonio 5. Tiburssinho\r\n"
					+ "Ou Digite 0 Para Encerrar a Votação !");
			System.out.println("Digite o Nome do Seu Candiado que voce deseja votar: ");
			Scanner scanner = new Scanner(System.in);
			voto = scanner.nextLine();
			String LetraMaiuscula = voto.toUpperCase();
			System.out.println("Voce Digitou " + LetraMaiuscula);
			if (map.containsKey(LetraMaiuscula)) {
				
				
				if (LetraMaiuscula == "JOSE") {
					votosMJose.add(votosMJose.size()+1);
					
					
				}
				if (LetraMaiuscula == "TRIBURSSINHO") {
					votosTRIBURSSINHO.add(votosTRIBURSSINHO.size()+1);
					
				}
				if (LetraMaiuscula =="MARIA") {
					votosMaria.add(votosMaria.size()+1);
					
				}
				if (LetraMaiuscula =="JOAO") {
					votosJoao.add(votosJoao.size()+1);
					
				}
				if (LetraMaiuscula =="ANTONIO") {
					votosAntonio.add(votosAntonio.size()+1);
					
				}
				System.out.println("Obrigado, seu voto foi registrado");
				System.out.println("Placar: ");
				System.out.println("Atonio: " +votosAntonio.size());
				System.out.println("João: " +votosJoao.size());
				System.out.println("Maria: " +votosMaria.size());
				System.out.println("Jose: " +votosMJose.size());
				System.out.println(": " +votosTRIBURSSINHO.size());
				
			}else {
				System.out.println("Candidato Inexistemte");
			}
			
			
			
		}
		
		
		
	}
	private static void print(Map<String, Integer> item) {
		
		item.forEach((chave, valor) -> {
			System.out.println("Candidato: " + chave + ", Numero do Partido: " + valor);
		});

}
	public static void printLista(List<Integer>item) {
		for (int i = 0; i < item.size(); i++) {
			System.out.println(item.get(i));
		}
	}
}
