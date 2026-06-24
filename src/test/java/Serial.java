import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Serial {
    private String name;
    private String russianName;
    private int countOfSeasons;
    private int seasonWhatIWatch;

    public Serial (String name, String russianName, int countOfSeasons, int seasonWhatIWatch){
        this.name = name;
        this.russianName = russianName;
        this.countOfSeasons = countOfSeasons;
        this.seasonWhatIWatch = seasonWhatIWatch;
    }

    public void getInfoAboutSerial() {
        System.out.println("Сейчас я смотрю сериал " + russianName + " на " + seasonWhatIWatch + " сезоне");
    }
}
