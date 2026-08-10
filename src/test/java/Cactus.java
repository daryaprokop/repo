public class Cactus extends Plant {

    private String cactusNeedles;

    public Cactus(String name, String color, int age, String cactusNeedles) {
        super(name, color, age);
        this.cactusNeedles = cactusNeedles;
    }

    public void painOfCactusNeedles () {
        System.out.println("Кактус колется иголками");
    }

    @Override
    public void needWater () {
        System.out.println("Полив редкий"); // переопределяю метод

    }
}
