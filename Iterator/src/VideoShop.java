import java.util.ArrayList;
import java.util.Arrays;

public class VideoShop {

    private String name;
    private ArrayList<Section> sections;

    public VideoShop(String name, Section ... sections) {
        this.name = name;
        this.sections = new ArrayList<>();
        this.sections.addAll(Arrays.asList(sections));
    }

    public void printOffer() {
        System.out.println("***" + this.name + "***");
        for (Section s : sections) {
            System.out.println("\n" + s.getName()+ "\n---***---");
            printSection(s.createIterator());
        }
    }

    private void printSection(Iterator iter) {
        while (iter.hasNext()) {
            Movie movie = (Movie) iter.next();
            System.out.println(movie.getTitle() + ", " +
                    movie.getYear() + ", " +
                    movie.getDirector());
        }
    }
}
