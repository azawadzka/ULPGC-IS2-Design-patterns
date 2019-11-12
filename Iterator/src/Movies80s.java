import java.util.ArrayList;

public class Movies80s implements Section {

    private ArrayList<Movie> moviesList;
    private String name;

    public Movies80s(String name) {
        this.name = name;
        this.moviesList = new ArrayList<>();
        addMovie("Back to the Future", 1985, "Robert Zemeckis");
        addMovie("Ghostbusters", 1984, "Ivan Reitman");
        addMovie("E.T.", 1982, "Steven Spielberg");
    }

    private void addMovie(String title, int year, String director) {
        Movie movie = new Movie(title, year, director);
        moviesList.add(movie);
    }

    @Override
    public Iterator createIterator() {
        return new Movies80sIterator(this.moviesList);
    }

    @Override
    public String getName() {
        return name;
    }
}
