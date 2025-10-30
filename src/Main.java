import java.time.LocalDate;

public class Main {
    /// Task 1
    public static void leapYear (int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " год — високосный год");
        }else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    /// Task 2
    public static void deviceCheck (int system, int year){
        String systemName = "";
        String version = "";

        if (system == 0){
            systemName = "iOS";
        } else {
            systemName = "Android";
        }
        if (year < LocalDate.now().getYear()){
            version = "облегченную";
        } else {
            version = "обычную";
        }
        System.out.println("Установите " + version + " версию приложения для " + systemName + " по ссылке");
    }

    /// Task 3
    public static byte deliveryDays (int distance){
        if (distance > 100){
            System.out.println("Свыше 100 км доставки нет.");
            return 0;
        } else if (distance<20) {
            return 1;
        } else if (distance<60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        /// Task 1
        leapYear(1994);

        /// Task 2
        deviceCheck(0, 2020);

        /// Task 3
        short deliveryDistance = 95;
        System.out.println("Потребуется дней: " + deliveryDays(deliveryDistance));
    }
}