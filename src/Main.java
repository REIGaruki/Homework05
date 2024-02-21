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
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //Task 3
        int year = 2021;
        if ( (year < 1584) || ( (year % 4) != 0) || ( ( (year % 100) == 0)  && ( (year % 400) != 0) ) ) {
            System.out.println("Год " + year + " - невисокосный");
        } else {
            System.out.println("Год " + year + " - високосный");
        }
        //вариант 2
        year = 1984;
        if (year > 1584) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        System.out.println("Год " + year + " - високосный");
                    } else {
                        System.out.println("Год " + year + " - невисокосный");
                    }
                } else {
                    System.out.println("Год " + year + " - високосный");
                }
            } else {
                System.out.println("Год " + year + " - невисокосный");
            }
        } else {
            System.out.println("Год " + year + " - невисокосный");
        }

    }
}