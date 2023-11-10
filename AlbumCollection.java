import java.util.ArrayList;
import java.util.List;

public class AlbumCollection {
    private List<Album> listAlbums = new ArrayList<>();

    public boolean isEmpty() {
        return listAlbums.isEmpty();
    }

    public List<Album> getList() {
        return listAlbums;
    }

    public void addAlbum(Album album) {
        this.listAlbums.add(album);
    }

    public void removeAlbum(Album album) {
        if (album != null) {
            this.listAlbums.remove(album);
        }
    }

    public List<Album> findByTitle(String title) {
        List<Album> result = new ArrayList<>();
        for (Album item: listAlbums) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }
}