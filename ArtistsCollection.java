import java.util.ArrayList;
import java.util.List;

public class ArtistsCollection {
    private List<Artist> listArtists = new ArrayList<>();

    public void addArtist(Artist artist) {
        this.listArtists.add(artist);
    }

    public void removeArtist(Artist artist) {
        if (artist != null) {
            this.listArtists.remove(artist);
        }
    }

    public List<Artist> findByNickName(String nickName) {
        List<Artist> result = new ArrayList<>();
        for (Artist item: listArtists) {
            if (item.getArtistMetaData().getNickname().toLowerCase().contains(nickName.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }
}
