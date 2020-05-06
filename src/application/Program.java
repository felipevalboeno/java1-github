package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program{

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Path caminho = Paths.get("\\temp\\WS-ECLIPSE\\Java1-github\\src\\portugues_git");
		Path caminho1 = Paths.get("\\temp\\WS-ECLIPSE\\Java1-github\\src\\ingles_git");
		String linguagem;

		System.out.println("Bora conhecer um pouco sobre GIT e Github?");
		System.out.println("Escolhe a seguir a linguagem a qual deseja ler: ");
		System.out.println("***********************************************");
		System.out.println();
		
		try {	
		linguagem = JOptionPane.showInputDialog("Linguagem: 1 - Inglês | 2 - Portugês");

		if (linguagem.equals("2")) {

			byte[] texto = Files.readAllBytes(caminho);
			String lendo = new String(texto);

			JOptionPane.showMessageDialog(null, lendo);

		} else {
			byte[] texto = Files.readAllBytes(caminho1);
			String lendo = new String(texto);

			JOptionPane.showMessageDialog(null, lendo);

		}
		} catch(Exception erro) {
			System.out.println("Finalizado.");
			
		}

		sc.close();
	}
}

	


