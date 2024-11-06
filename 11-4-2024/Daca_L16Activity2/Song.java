package Daca_L16Activity2;

public class Song {
	
	private String song;
	private String artist;
	
	public Song(String song, String artist) {
		this.song = song;
		this.artist = artist;
	}

	public String getSong() {
		return song;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return song + " by " + artist;
	}	 
	
}
