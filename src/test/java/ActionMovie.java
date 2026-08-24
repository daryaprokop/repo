public class ActionMovie extends Movie {

    public ActionMovie(String title, int duration, int rating){
        super(title, duration, rating);
    }

    @Override
    public void watch () {

        System.out.println("Фильм " + title + " - экшен!");
        System.out.println("Длительность: " + duration + " минут");
        System.out.println("Рейтинг фильма: " + rating);
    }

    @Override
    public void getRecommendation() {
        System.out.println("Для любителей экшена и адреналина");
    }
}
