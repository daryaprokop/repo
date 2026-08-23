import lombok.Setter;

public class Main {
    public static void main(String[] args) {
        Book sherlockHolmes = new Book("Конан Дойль", "Шерлок Холмс", 1980);
        Book norvegianWood = new Book();
        // новый объект - в памяти создается новый экземпляр класса со своими копиями переменных класса

        sherlockHolmes.getInfoAboutBook();
        norvegianWood.getInfoAboutBook();

        Serial theBigBangTheory = new Serial("TheBigBangTheory", "Теория большого взрыва", 12, 4);

        theBigBangTheory.getInfoAboutSerial();

        UITests uiTest1  = new UITests("PoaTest1", 10, "regress");
        uiTest1.writeTestCases(); // нестатичные - вызываю на объекте
        uiTest1.autotests();

        String name = uiTest1.uiName;
        System.out.println(name); // null, тк не присвоили

        String type = uiTest1.typeOfCase; // обращение к нестатичному полю класса
        System.out.println(type);

        System.out.println(UITests.tms); // вызываем статичную переменную по названию класса
        UITests.getRegress();

        }
}
