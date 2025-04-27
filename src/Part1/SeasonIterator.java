package Part1;
import java.util.*;
public class SeasonIterator implements EpisodeIterator, Iterator<Episode> {
    private final List<Episode> episodes;
    private int index = 0;

    public SeasonIterator(Season season) {
        this.episodes = season.getEpisodes();
    }
    @Override
    public boolean hasNext() {
        return index < episodes.size();
    }
    @Override
    public Episode next() {
        return episodes.get(index++);
    }
}
