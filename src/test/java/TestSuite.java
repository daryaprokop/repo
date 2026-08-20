public abstract class TestSuite {
    public String name;
    public String typeOfCase;
    public int number;

    abstract void writeTestCases();

    abstract void autotests();

    public static void bug() {
        System.out.println("Нет багам");
    }
    // вызвать нельзя на объекте, тк это не абстрактный метод
    //просто вызвать можно
}
