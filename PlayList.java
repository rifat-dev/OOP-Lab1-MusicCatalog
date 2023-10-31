import java.util.ArrayList;
import java.util.List;

public class PlayList implements IMusicCollection {
    private String title;
    private List<Song> listSongs = new ArrayList<>();

    public PlayList(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Song> getListSongs() {
        return this.listSongs;
    }

    @Override
    public void setListSongs(List<Song> listSongs) {
        this.listSongs = listSongs;
    }

    @Override
    public void addSong(Song song) {
        this.listSongs.add(song);
    }

    @Override
    public void removeSong(Song song) {
        this.listSongs.remove(song);
    }

}
