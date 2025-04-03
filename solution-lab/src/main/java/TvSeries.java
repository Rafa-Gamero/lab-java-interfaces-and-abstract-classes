public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" | Episodios: %d | Tipo: Serie", episodes);
    }
}