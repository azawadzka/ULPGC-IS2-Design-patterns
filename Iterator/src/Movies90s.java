import java.util.HashMap;

public class Movies90s implements Section {

    private HashMap<Integer, Movie> moviesList;
    private String name;
    private int key = 0;

    public Movies90s(String name) {
        this.name = name;
        this.moviesList = new HashMap<>();
        addMovie("Pulp fiction", 1994, "Quentin Tarantino");
        addMovie("The silence of the lambs", 1991, "Jonathan Demme");
        addMovie("Martix", 1999, "Lana Wachowski, Lilly Wachowski");
    }

    private void addMovie(String title, int year, String director) {
        Movie movie = new Movie(title, year, director);
        moviesList.put(key, movie);
        key++;
    }

    @Override
    public Iterator createIterator() {
        return new Movies90sIterator(this.moviesList);
    }

    @Override
    public String getName() {
        return name;
    }
}
