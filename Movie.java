import java.util.ArrayList;
public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.year,o.year);
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie> ();
        list.add(new Movie("In the Mood for Love", 7.7, 2001));
        list.add(new Movie("The Lord of the Rings: The Return of the Kings", 9.0, 2003));
        list.add(new Movie("Aftersun", 7.6, 2022));
        list.add(new Movie("Oppenheimer", 8.4, 2023));
        list.add(new Movie("Hayat", 7.4, 2023));

        sort(list);
        System.out.println("Movies after sorting: ");
        for(Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }
    private static void sort(ArrayList<Movie> list) {
    }
}
