public class Movies70sIterator implements Iterator {

    private Movie[] moviesList;
    private int position = 0;

    public Movies70sIterator(Movie[] moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public boolean hasNext() {
        return position < moviesList.length && moviesList[position] != null;
    }

    @Override
    public Object next() {
        Movie item = moviesList[position];
        position++;
        return item;
    }
}
