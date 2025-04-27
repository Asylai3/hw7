package Part1;
import java.util.*;
public class Season implements Iterable<Episode> {
    private final List<Episode> episodes = new ArrayList<>();
    public void addEpisode(Episode e) {
        episodes.add(e);
    }
    public List<Episode> getEpisodes() {
        return episodes;
    }
    public EpisodeIterator createSeasonIterator() {
        return new SeasonIterator((Season) episodes);
    }
    @Override
    public Iterator<Episode> iterator() {
        return episodes.iterator();
    }
}

