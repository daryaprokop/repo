public interface Notifications {
    void send();

    default void error() {
        System.out.println("Метод уведомлений сломан, используйте другой");
    }
}
