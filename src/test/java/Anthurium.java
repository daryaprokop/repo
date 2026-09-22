public class Anthurium extends Plant {
    private String seed;

    public Anthurium(String name, String color, int age, String seed) {
        super(name, color, age);
        this.seed = seed;
    }


    public void makeSeeds () {
        System.out.println("Антуриум опылился, созрели семена");
    }
}
