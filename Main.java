public class Main {

    static double telescopePrice = 14_000; // Стоимость телескопа
    static double account = 1000; // На счету
    static double stipend = 2500; // Ежемесячная стипендия
    static double percentBankMonth = 5.0 / 12.0; // Накопления хранящиеся в банке

    static int countMonth = 0; // Количество месяцев
    public static void main(String[] args) {

        while(account < telescopePrice) {

            countMonth++; // countMonth = countMonth + 1;

            account += account * percentBankMonth / 100; // увеличиваем на проценты от вклада
            account += stipend;
        }

        System.out.println("За " + countMonth + " месяцев можно накопить на телескоп");
        System.out.println("К тому времени на счету будет  " + account);

    }

}