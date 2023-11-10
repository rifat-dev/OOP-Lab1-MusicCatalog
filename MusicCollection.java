import java.util.ArrayList;
import java.util.List;

public class MusicCollection {
    private List<Song> listSongs = new ArrayList<>();

    public MusicCollection() {

    }

    public void addSong(Song song) {
        this.listSongs.add(song);
    }

    public void removeSong(Song song) {
        this.listSongs.remove(song);
    }

    // NB (для себя) что если использовать отдельный класс для поиска и применить паттерн стратегию с разными реализациями поиска
    public List<Song> findByName(String name) {
        List<Song> result = new ArrayList<>();
        for (Song item: listSongs) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }

    public List<Song> findByGenreName(String name) {
        List<Song> result = new ArrayList<>();
        for (Song item: listSongs) {
            if (item.getGenre().toLowerCase().contains(name.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }

    public List<Song> findByArtistNickName(String nickName) {
        List<Song> result = new ArrayList<>();
        for (Song item: listSongs) {
            if (item.getArtist().getArtistMetaData().getNickname().toLowerCase().contains(nickName.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }

}
