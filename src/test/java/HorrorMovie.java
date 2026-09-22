public class HorrorMovie extends Movie {

    public HorrorMovie(String title, int duration, int rating) {
        super(title, duration, rating);
    }

    @Override
    public void watch () {
        System.out.println("Все срочно смотрим хорроры, да, Галя?");
    }

    @Override
    public void getRecommendation() {
        System.out.println("Этот фильм подходит для Гали");
    }
}
