public class Plant {
    private String name;
    private String color;
    private int age;

    public Plant (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void needWater() {
        System.out.println("Нужно полить цветочки");
    }
}
