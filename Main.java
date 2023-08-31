public class Main {
    public static void main(String[] args) {
        createAndPrintHero("Пудж");
        createAndPrintHero("Зевс");
        createAndPrintHero("Квопа");
    }

    public static void createAndPrintHero(String name) {
        System.out.println("Ви створили нового героя на ім'я " + name);
    }
}