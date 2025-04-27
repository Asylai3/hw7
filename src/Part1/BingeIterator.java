package Part1;
import java.util.*;
public class BingeIterator implements EpisodeIterator {
    private final List<Season> seasons;
    private int seasonIndex = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(Series series) {
        this.seasons = series.getSeasons();
        if (!seasons.isEmpty()) {
            currentIterator = new SeasonIterator(seasons.getFirst());
        }
    }
    @Override
    public boolean hasNext() {
        while (currentIterator != null && !currentIterator.hasNext()) {
            seasonIndex++;
            if (seasonIndex >= seasons.size()) {
                return false;
            }
            currentIterator = new SeasonIterator(seasons.get(seasonIndex));
        }
        return currentIterator != null && currentIterator.hasNext();
    }

    @Override
    public Episode next() {
        return currentIterator.next();
    }
}
