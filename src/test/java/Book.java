import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Book { //класс
    private String author;
    private String name;
    private int yearOfPublication;

    public Book (){ //конструктор
    }

    public Book(String author, String name, int yearOfPublication) {
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public void getInfoAboutBook(){ // метод
        System.out.println("Название книги " + name);
    }
}




