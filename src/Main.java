public class Main {
    public static void main(String[] args) {
        //Task 1
        byte clientOS = 1;// 0 - iOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Task 2
        clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Task 3
        int year = 2021;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0))  {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - невисокосный");
        }
        //Task 4
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance > 100) {
            System.out.println("Вы находитесь слишком далеко от банка, доставка невозможна");
        } else if (deliveryDistance > 0){
            deliveryTime = (deliveryDistance + 59) / 40;
            System.out.println("Вы находитесь за " + deliveryDistance + " км от банка, доставка потребует " + deliveryTime + " дней");
        } else {
            System.out.println("Ошибка, отрицательное расстояние!");
        }
        //Task 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц : это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц : это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц : это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц : это осень");
                break;
            default:
            System.out.println("Такого месяца нет");
        }
    }
}