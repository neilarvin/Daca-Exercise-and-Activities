package Daca_L16Activity2;

import java.util.LinkedList;

public class Playlist {
	
	private LinkedList<Song> playlist = new LinkedList<Song>();
//	private int currentSongIndex = -1;
	
	void addSong(String song, String artist) {
		playlist.add(new Song(song, artist));
		System.out.println("\n" + song + " by " + artist + " is added in the playlist.");
	}
	
	void displayPlaylist() {
		System.out.println("\nPlaylist");
		for(Song songs : playlist) {
			System.out.println(songs);
		}
	}
	
	void removeSong(String song) {
		boolean found = true;
		for(int i = 0; i < playlist.size(); i++) {
			
			if(playlist.get(i).getSong().equals(song)) {
				playlist.remove(i);
				System.out.println("\n" + song + " is removed from the playlist.");
				found = false;
			}
			
		}
		
		if(found) {
			System.out.println("\n" + song + " can't be found in the playlist.");
		}
		
	}
	
	void displayCurrentSong() {
		System.out.println("\nCurrent song playing: " + playlist.getFirst());
	}
	
	void displayNextSong() {
		if(playlist.size() > 1) {
			System.out.println("Next song: " + playlist.get(1));
		}else {
			System.out.println("No next song");
		}
	}

}
