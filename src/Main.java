public class Main {
    public static void main(String[] args) {

        //Homework №1. Task №1
        System.out.println("Домашнее задание№1. Задача №1");
        System.out.println("Ответ на запрос о регистрации несовершеннолетнего пользователя:");
        int agePupil = 15;
        if (agePupil >= 18) {
            System.out.println("Поздравляем, Вы являетесь совершеннолетним. Вы можете пользоваться услугами нашего портала.");
        }
        if (agePupil < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил. Просим подождать до наступления 18 лет.");
        }

        System.out.println("");
        System.out.println("Ответ на запрос о регистрации совершеннолетнего пользователя:");
        int ageStudent = 20;
        if (ageStudent >= 18) {
            System.out.println("Поздравляем, Вы являетесь совершеннолетним. Вы можете пользоваться услугами нашего портала.");
        }
        if (ageStudent < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил. Просим подождать до наступления 18 лет.");
        }

        //Homework №1. Task №2
        System.out.println("");
        System.out.println("Домашнее задание№1. Задача №2");
            int agePerson = 28;
            if (agePerson >= 7 && agePerson < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
             if (agePerson >= 18 && agePerson < 24) {
            System.out.println("Человек закончил школу и учится в университете.");
        }
        if (agePerson >= 24) {
            System.out.println("Человек окончил университет и работает по специальности.");
        }

        //Homework №1. Task №3
        System.out.println("");
        System.out.println("Домашнее задание№1. Задача №3");
        int passenger = 82;
        int wagonCapacity = 102;
        int totalSeatPlace = 60;
        int totalStandPlace = wagonCapacity - totalSeatPlace;
        int freeSeatPlace = totalSeatPlace - passenger;
        int freeStandPlace = totalStandPlace - passenger + totalSeatPlace;

        if (passenger < 59) {
            System.out.println("В вагоне есть " + freeSeatPlace + " сидячих мест и " + totalStandPlace + " стоячих мест.");
        }
        if (passenger == 59) {
            System.out.println("В вагоне есть " + freeSeatPlace + " сидячее место и " + totalStandPlace + " стоячих мест.");
        }
        if (passenger >= 60 && passenger < 101) {
            System.out.println("В вагоне нет сидячих мест, есть только " + freeStandPlace + " стоячих мест.");
        }
        if (passenger == 101) {
            System.out.println("В вагоне нет сидячих мест, есть только " + freeStandPlace + " стоячее место.");
        }
        if (passenger >= 102) {
            System.out.println("Вагон уже полностью забит.");
        }

        //Homework №2. Task №1
        System.out.println("");
        System.out.println("Домашнее задание№2. Задача №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем, Вы являетесь совершеннолетним. Вы можете пользоваться услугами нашего портала");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил. Просим подождать до наступления 18 лет.");
        }

        //Homework №2. Task №2
        System.out.println("");
        System.out.println("Домашнее задание№2. Задача №2");
        int ageHuman = 23;
        if (ageHuman >= 7 && ageHuman < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        else if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Человек закончил школу и учится в университете.");
        } else {
            System.out.println("Человек окончил университет и работает по специальности.");
        }

        //Homework №2. Task №3
        System.out.println("");
        System.out.println("Домашнее задание№2. Задача №3");
        int passengers = 88;
        int wagonsCapacity = 102;
        int totalSeatPlaces = 60;
        int totalStandPlaces = wagonsCapacity - totalSeatPlaces;
        int freeSeatPlaces = totalSeatPlaces - passengers;
        int freeStandPlaces = totalStandPlaces - passengers + totalSeatPlaces;

        if (passengers < 59) {
            System.out.println("В вагоне есть " + freeSeatPlaces + " сидячих мест и " + totalStandPlaces + " стоячих мест.");
        }
        else if (passengers == 59) {
            System.out.println("В вагоне есть " + freeSeatPlaces + " сидячее место и " + totalStandPlaces + " стоячих мест.");
        }
        else if (passengers >= 60 && passengers < 101) {
            System.out.println("В вагоне нет сидячих мест, есть только " + freeStandPlaces + " стоячих мест.");
        }
        else if (passengers == 101) {
            System.out.println("В вагоне нет сидячих мест, есть только " + freeStandPlaces + " стоячее место.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }

        //Homework №3. Task №1
        System.out.println("");
        System.out.println("Домашнее задание№3. Задача №1");
        int personAge = 18;
        boolean preschoolChildrenAge = 2 <= personAge && personAge <= 6;
        boolean pupilAge = 7 <= personAge && personAge < 18;
        boolean studentAge = 18 <= personAge && personAge < 24;

        if (preschoolChildrenAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        }
        else if (pupilAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        }
        else if (studentAge) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        }

        //Homework №3. Task №2
        System.out.println("");
        System.out.println("Домашнее задание№3. Задача №2");
        int childAge = 5;
        int adultWithChild = 0;
        boolean childrenUnder5 = 5 > childAge;
        boolean childrenFrom5To14WithAdult = 5 <= childAge && childAge < 14 && adultWithChild == 1;
        boolean childrenFrom5To14WithoutAdult = 5 <= childAge && childAge < 14 && adultWithChild == 0;


        if (childrenUnder5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься.");
        }
        else if (childrenFrom5To14WithAdult) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься в сопровождении взрослого.");
        }
        else if (childrenFrom5To14WithoutAdult) {
            System.out.println("Если возраст ребенка равен " + childAge + " и он без сопровождения взрослого, то ему нельзя кататься .");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься без сопровождения взрослого.");
        }

        //Homework №3. Task №3
        System.out.println("");
        System.out.println("Домашнее задание№3. Задача №3");
        int one = 5;
        int two = 10;
        int three = 3;
        boolean oneIsMore = one > two && three < one;
        boolean twoIsMore = two > one && three < two;

        if (oneIsMore) {
            System.out.println("Большее из трех чисел это " + one + ".");
        }
        else if (twoIsMore) {
            System.out.println("Большее из трех чисел это " + two + ".");
        } else {
            System.out.println("Большее из трех чисел это " + three + ".");
        }

    }
}