package model;

import Interface.IStreamable;

public class Music implements IStreamable {
    private String artist;
    private String album;
    public int Length;
    public int BytesSent;

    public Music(String artist, String album, int length, int bytesSent) {
        this.artist = artist;
        this.album = album;
        this.Length = length;
        this.BytesSent = bytesSent;
    }

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getBytesSent() {
		return BytesSent;
	}

	public void setBytesSent(int bytesSent) {
		BytesSent = bytesSent;
	}
    
}
