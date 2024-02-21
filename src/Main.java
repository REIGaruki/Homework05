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
        //Task 4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 20) {
                deliveryTime = deliveryTime + 1;
                if (deliveryDistance > 60) {
                    deliveryTime = deliveryTime + 1;
                }
            }
            System.out.println("Вы находитесь за " + deliveryDistance + " км от банка, доставка потребует " + deliveryTime + " дней");
        } else {
            System.out.println("Вы находитесь слишком далеко от банка, доставка невозможна");
        }
        //Task 5
        byte monthNumber = 12;
        if ((monthNumber <= 12) && (monthNumber >=1)) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь - зимний месяц");
                    break;
                case 2:
                    System.out.println("Февраль - зимний месяц");
                    break;
                case 3:
                    System.out.println("Март - весенний месяц");
                    break;
                case 4:
                    System.out.println("Апрель - весенний месяц");
                    break;
                case 5:
                    System.out.println("Май - весенний месяц");
                    break;
                case 6:
                    System.out.println("Июнь - летний месяц");
                    break;
                case 7:
                    System.out.println("Июль -  - летний месяц");
                    break;
                case 8:
                    System.out.println("Август - летний месяц");
                    break;
                case 9:
                    System.out.println("Сентябрь - горит");
                    break;
                case 10:
                    System.out.println("Октябрь - осенний месяц");
                    break;
                case 11:
                    System.out.println("Ноябрь - осенний месяц");
                    break;
                case 12:
                    System.out.println("Декабрь - зимний месяц");
                    break;
            }
        } else {
            System.out.println("Месяца с таким номером не существует");
        }


    }
}