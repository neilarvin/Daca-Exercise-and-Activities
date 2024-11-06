package Daca_L17Activity1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Playlist playlist = new Playlist();
		
		System.out.println("Welcome to Spotify");
		
		while(true) {
			System.out.println("\nChoose an Option\n1. Add song to playlist\n2. Display playlist\n3. Remove a song from playlist\n4. Play a song\n5. Search astist\n6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice){
			case 1:
				System.out.print("Enter song title: "); String title = scan.nextLine();
				System.out.print("Enter artist name: "); String artist = scan.nextLine();
				playlist.addSong(title, artist);
				break;
			case 2:
				playlist.displayPlaylist();
				break;
			case 3:
				System.out.print("Enter song to remove: ");
				title = scan.nextLine(); playlist.removeSong(title);
				break;
			case 4:
				playlist.displayCurrentSong(); playlist.displayNextSong();
				break;
			case 5:
				System.out.print("Enter search for artist: ");
				artist = scan.nextLine(); playlist.searchSong(artist);
				break;
			case 6:
				System.err.println("\nExiting playlist.");
				System.exit(0);
			default: System.out.println("Invalid choice. Please try again.");
			}
		}

	}

}
