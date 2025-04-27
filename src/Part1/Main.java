package Part1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Series s = new Series();

        Season season1 = new Season();
        season1.addEpisode(new Episode("Season1 Episode1: Lost Princess", 1380));
        season1.addEpisode(new Episode("Season1 Episode2: Tower Dreams", 1300));
        season1.addEpisode(new Episode("Season1 Episode3: Escape to Freedom", 1380));
        s.addSeason(season1);

        Season season2 = new Season();
        season2.addEpisode(new Episode("Season2 Episode1: The Hidden Kingdom", 1380));
        season2.addEpisode(new Episode("Season2 Episode2: Light of the Lantern", 1300));
        s.addSeason(season2);

        System.out.println("\nNormal order:");
        EpisodeIterator normalIterator = new SeasonIterator(season1);
        while (normalIterator.hasNext()) {
            System.out.println(normalIterator.next().getTitle());
        }

        System.out.println("\nReverse order:");
        EpisodeIterator reverseIterator = new ReverseSeasonIterator(season1);
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next().getTitle());
        }

        System.out.println("\nShuffle order:");
        EpisodeIterator shuffleIterator = new ShuffleSeasonIterator(season1);
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getTitle());
        }

        System.out.println("\nBinge watching all seasons:");
        EpisodeIterator bingeIterator = new BingeIterator(s);
        while (bingeIterator.hasNext()) {
            System.out.println(bingeIterator.next().getTitle());
        }
    }
}

