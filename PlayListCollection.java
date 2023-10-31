import java.util.ArrayList;
import java.util.List;

public class PlayListCollection {
    private List<PlayList> listPlaylist = new ArrayList<>();

    public void addPlaylist(PlayList playList) {
        this.listPlaylist.add(playList);
    }

    public void removePlaylist(PlayList playList) {
        this.listPlaylist.remove(playList);
    }

    public List<PlayList> findByTitle(String title) {
        List<PlayList> result = new ArrayList<>();
        for (PlayList item: listPlaylist) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(item);
            }
        }

        return result;
    }
}
