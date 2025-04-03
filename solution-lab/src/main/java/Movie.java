public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" | Calificación: %.1f/10 | Tipo: Película", rating);
    }
}

