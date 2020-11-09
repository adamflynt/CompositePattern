import java.util.ArrayList;

public class Playlist implements IComponent {

		public String playlistName;
		public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

		public Playlist(String playlistName) {
			this.playlistName = playlistName;
		}
		
		public void setPlaybackSpeed(float slowSpeed) {
			for (IComponent song : playlist)
				song.setPlaybackSpeed(slowSpeed);			
		}

		public String getName() {
			return this.playlistName;
		}

		public void play() {
			for (IComponent allsongs : playlist)
				allsongs.play();
			
		}

		public void add(IComponent component) {
			playlist.add(component);
		}

		public void remove(IComponent component) {
			playlist.remove(component);
		}

	  // Your code goes here!


	}