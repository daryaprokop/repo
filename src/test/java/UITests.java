public class UITests extends TestSuite {

    public String uiName; // поля класса
    public static String tms = "Zephyr";

    public UITests (String name, int number, String typeOfCase){
        this.name = name;
        this.number = number;
        this.typeOfCase = typeOfCase;
    }

    @Override
    public void writeTestCases() {
        System.out.println("Пишем тест-кейсы на UI");
    }

    @Override
    public void autotests() {
        System.out.println("Автоматизируем все");
    }

    public static void getRegress(){
        System.out.println("Снова регресс"); // статичный - относится к классу
    }
}
