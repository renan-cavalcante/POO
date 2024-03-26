package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Musica;
import model.PlayList;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, Musica> musicas = new HashMap<>();
		Map<String, PlayList> PlayLists = new HashMap<>();
		
		boolean continuar = true;
		do {
			try {
				System.out.println(
						"Digite 1 - adicionar musica, 2 - adicionar Playlist, 3 - listar musicas, 4 - listar Playlist, 5 - selecionar Playlist ou 0 - finalizar");
				int opcao = scan.nextInt();
				switch (opcao) {
				case 1:
					Musica musica = new Musica();
					
					System.out.println("Digite o nome da musica");
					musica.setNome(scan.next());
					
					System.out.println("Digite o nome do autor");
					musica.setAutor(scan.next());
					
					System.out.println("Digite o nome da gravadora");
					musica.setGravadora(scan.next());
					musicas.put(musica.getNome(), musica);
					break;
				case 2:
					PlayList playList = new PlayList();
					
					System.out.println("Digite o nome da PlayList");
					playList.setNome(scan.next());
					
					System.out.println("Digite o dono da PlayList");
					playList.setDono(scan.next());

					boolean inserir = true;
					do {
						try {
							
							System.out.println("Digite o nome da musica para adicionar");
							playList.addMusicas(musicas.get(scan.next()));
							System.out.println("Adicionar outra musica ? (S/N)");
							inserir = scan.next().toLowerCase().equals("s") ? true : false; 
						}catch(Exception e) {
							e.printStackTrace();
							System.out.println("musica não cadastrada");
							System.out.println("Adicionar outra musica ? (S/N)");
							inserir = scan.next().toLowerCase().equals("s") ? true : false; 
						}
					}while(inserir);
					PlayLists.put(playList.getNome(), playList);
					break;
				case 3:
					for(String s : PlayLists.keySet()) {
						System.out.print("Nome :"+PlayLists.get(s).getNome());
						System.out.print("  Dono :"+PlayLists.get(s).getDono());
						System.out.println(" Musicas: "+PlayLists.size());
					}
					break;
				case 4:
					for(String s : musicas.keySet()) {
						System.out.print("Nome :"+musicas.get(s).getNome());
						System.out.print("  Autor :"+musicas.get(s).getAutor());
						System.out.println(" Gravadora: "+musicas.get(s).getGravadora());
					}
					break;
				case 5:
					System.out.println("Digite o nome da playlist");
					setPlaylist(PlayLists.get(scan.next()));
					break;
				case 0:
					continuar = false;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcao);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
				scan.nextLine();
				continuar = true;
			}
		} while (continuar);
		System.out.println("Programa finalizado");
		scan.close();

	}

	private static void setPlaylist(PlayList playList) {
		System.out.println("Digite 1 - tocar na ordem, 2 - tocar aleatorio ou 0 - sair");
		int opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			playList.reproduzir();
			break;
		case 2:
			playList.reproduzirAleatorio();
			break;
		case 0:
			return;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
	}

}
