package model;

import Interface.IStreamable;

public class File implements IStreamable{
	private String name;
	public int Length;
	public int BytesSent;

	public File(String name, int length, int bytesSent) {
	this.name = name;
	this.Length = length;
	this.BytesSent = bytesSent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
