import lombok.Setter;

public class Main {
    public static void main(String[] args) {
        Book SherlockHolmes = new Book("Конан Дойль", "Шерлок Холмс", 1980);
        Book NorvegianWood = new Book ();
        // новый объект - в памяти создается новый экземпляр класса со своими копиями переменных класса

        SherlockHolmes.getInfoAboutBook();
        NorvegianWood.getInfoAboutBook();

        Serial TheBigBangTheory = new Serial("TheBigBangTheory", "Теория большого взрыва", 12, 4);

        TheBigBangTheory.getInfoAboutSerial();

    }
}
