package beforeexam;

import java.util.*;

import beforeexam.MusicPlayListWeave.Song;


public interface Playlist {
	   Song getNextSong();
	    boolean hasNextSong();
}

