 public abstract class Movie {
    public String title;
    public int duration;
    public int rating;

     public Movie(String title, int duration, int rating) {
         this.title = title;
         this.duration = duration;
         this.rating = rating;
     }

     public abstract void watch();

     public abstract void getRecommendation();

}

