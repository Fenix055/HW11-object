public class Main {
    /// Task 1
    public static boolean leapYear (int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        }else {
            return false;
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
        if (year < 2015){
            version = "облегченную";
        } else {
            version = "обычную";
        }
        System.out.println("Установите " + version + " версию приложения для " + systemName + " по ссылке");
    }

    /// Task 3
    public static int deliveryDays (int distance){
        return ((distance-20) / 40) + 1;

    }

    public static void main(String[] args) {
        /// Task 1
        int year = 1994;
        if (leapYear(year)){
            System.out.println(year + " год — високосный год");
        }else {
            System.out.println(year + " год — невисокосный год");
        }

        /// Task 2
        deviceCheck(0, 2015);

        /// Task 3
        System.out.println(deliveryDays(60) + " дня доставки");
    }
}