package ex1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			String dataCriacao,nomeUsuario,dataNascimento,senha, dataPublicacao, textoPublicacao, linkMidia;
			
			System.out.println("Informe a data de cria��o: ");
			dataCriacao=ler.next();
			System.out.println("Informe o nome de usu�rio: ");
			nomeUsuario=ler.next();
			System.out.println("Informe a data de nascimento: ");
			dataNascimento=ler.next();
			System.out.println("Informe a senha: ");
			senha=ler.next();
			
			System.out.println("Informe a data da publica��o: ");
			dataPublicacao=ler.next();
			System.out.println("Informe o texto da publica��o: ");
			textoPublicacao=ler.next();
			System.out.println("Informe o link: ");
			linkMidia=ler.next();
			
			
			RedeSocial rs1 = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
			Publicacao rs = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
		}

	}

	

