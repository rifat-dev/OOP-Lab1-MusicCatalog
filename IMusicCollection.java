import java.util.List;

public interface IMusicCollection {
    String getTitle();
    void setTitle(String title);
    List<Song> getListSongs();
    void setListSongs(List<Song> listSongs);
    void addSong(Song song);
    void removeSong(Song song);
}
