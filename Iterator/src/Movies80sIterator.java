import java.util.ArrayList;

public class Movies80sIterator implements Iterator {

    private ArrayList<Movie> moviesList;
    private int position = 0;

    public Movies80sIterator(ArrayList<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public boolean hasNext() {
        return position < moviesList.size();
    }

    @Override
    public Object next() {
        Movie item = moviesList.get(position);
        position++;
        return item;
    }
}
