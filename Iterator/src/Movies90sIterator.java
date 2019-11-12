import java.util.HashMap;

public class Movies90sIterator implements Iterator {

    private HashMap<Integer, Movie> moviesList;
    private int position = 0;

    public Movies90sIterator(HashMap<Integer, Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public boolean hasNext() {
        return moviesList.get(position) != null;
    }

    @Override
    public Object next() {
        Movie item = moviesList.get(position);
        position++;
        return item;
    }
}
