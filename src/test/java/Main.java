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
    }
}
