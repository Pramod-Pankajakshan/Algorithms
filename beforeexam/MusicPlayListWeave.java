package beforeexam;

import java.util.*;

/**

We are building a mobile application that lets you manage music
playlists. The most important thing about our app is that users can
only progress forward in the playlist. If a song is played fully or
skipped, there’s no going back to hear it again.
We are adding a feature for users to create collaborative playlists
with friends. Each user will independently create their own playlist
and our application will interleave songs from provided playlists
together as if it were one long playlist. **The app will cycle through
each playlist in a “round-robin” fashion, playing the next available
song until all provided playlists are empty.**
Implement a class called CollaborativePlaylist class that implements
the Playlist interface and matches the behavior described above. The
constructor of CollaborativePlaylist should accept a List as
its source of data.
*/
public class MusicPlayListWeave implements Playlist {
  List<? extends Playlist> pl;
   int plId=0; 
  
	 public MusicPlayListWeave(LinkedList<? extends Playlist> playlists) {
	  this.pl=playlists;  
	  
	 }
		
		@Override
	    public Song getNextSong() {
			Song s =null;
			if(pl.get(plId).hasNextSong()) {
			 s = pl.get(plId).getNextSong();
		     plId++;
			}else {
				
				while(!pl.get(plId).hasNextSong()) {
					pl.remove(plId);
					plId++;
					if(plId>pl.size())plId=0;
					if(pl.size()==0) break;
					
				}
				if(pl.size()>=1)
				 s = pl.get(plId).getNextSong();
				
			}
			  if(plId>pl.size())plId=0;
			
			return s;
	    }

	    @Override
	    public boolean hasNextSong() {
			return false;
	    }
	    
	    
	    
	    class Song {
		    String name;

		    public Song(String name) {
		        this.name = name;
		    }
		}
}

