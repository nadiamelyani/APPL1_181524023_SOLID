package main;

import model.File;
import model.Music;
import model.StreamProgressInfo;

public class Program {
	public static void main(String[] args) {
		File file = new File("Test", 12, 12);
        Music music = new Music("Yui", "Cool" , 20, 2500);

        StreamProgressInfo stramFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo stramMusicInfo = new StreamProgressInfo(music);

        System.out.println(stramFileInfo.CalculateCurrentPercent());
        System.out.println(stramMusicInfo.CalculateCurrentPercent());
	}
}
