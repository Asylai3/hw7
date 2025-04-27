package Part1;
import java.util.*;
public class ShuffleSeasonIterator implements EpisodeIterator {
    private final List<Episode> shuffledEpisodes;
    private int index = 0;

    public ShuffleSeasonIterator(Season season) {
        this.shuffledEpisodes = new ArrayList<>(season.getEpisodes());
        Collections.shuffle(shuffledEpisodes, new Random(42));
    }
    @Override
    public boolean hasNext() {
        return index < shuffledEpisodes.size();
    }
    @Override
    public Episode next() {
        return shuffledEpisodes.get(index++);
    }
}
