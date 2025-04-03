public abstract class Video {
    protected String title;
    protected int duration; // duración en minutos

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    /**
     * Obtiene información del video
     * @return String con los detalles del video
     */
    public String getInfo() {
        return String.format("Título: %s | Duración: %d minutos",
                title, duration);
    }
}
