package model;

import Interface.IStreamable;

public class StreamProgressInfo {
	 private IStreamable file;

     public StreamProgressInfo(IStreamable file) {
         this.file = file;
     }

     public int CalculateCurrentPercent() {
         return (this.file.BytesSent * 100) / this.file.Length;
     }
}
