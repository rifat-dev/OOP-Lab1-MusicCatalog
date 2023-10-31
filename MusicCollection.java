import java.util.List;

public class MusicCollection {
    private String title;
    private List<Song> listSongs;

    public MusicCollection(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getListSongs() {
        return this.listSongs;
    }

    public void setListSongs(List<Song> listSongs) {
        this.listSongs = listSongs;
    }

    public void addSong(Song song) {
        this.listSongs.add(song);
    }

    public void removeSong(Song song) {
        this.listSongs.remove(song);
    }

}
