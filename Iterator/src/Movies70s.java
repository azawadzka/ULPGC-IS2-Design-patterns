public class Movies70s implements Section {

    private Movie[] moviesList;
    private int arrayValue = 0;
    private String name;


    public Movies70s(String name) {
        this.name = name;
        this.moviesList = new Movie[3];
        addMovie("Jaws", 1975, "Steven Spielberg");
        addMovie("The Godfather", 1972, "Francis Ford Coppola");
        addMovie("The Exorcist", 1975, "William Friedkin");
    }

    private void addMovie(String title, int year, String director) {
        Movie movie = new Movie(title, year, director);
        moviesList[arrayValue] = movie;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return new Movies70sIterator(this.moviesList);
    }

    @Override
    public String getName() {
        return name;
    }

}
