public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        System.out.println("Ответ на запрос о регистрации несовершеннолетнего пользователя:");
        int agePupil = 15;
        if (agePupil >= 18) {
            System.out.println("Поздравляем, Вы являетесь совершеннолетним. Вы можете пользоваться услугами нашего портала");
        }
        if (agePupil < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил. Просим подождать до наступления 18 лет");
        }

        System.out.println("");
        System.out.println("Ответ на запрос о регистрации совершеннолетнего пользователя:");
        int ageStudent = 20;
        if (ageStudent >= 18) {
            System.out.println("Поздравляем, Вы являетесь совершеннолетним. Вы можете пользоваться услугами нашего портала.");
        }
        if (ageStudent < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил. Просим подождать до наступления 18 лет");
        }
        //Задача №2
        System.out.println("");
        System.out.println("Задача №2");
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
        //Задача №3
        System.out.println("");
        System.out.println("Задача №3");
        int passenger = 28;
        int wagonCapacity = 102;
        int totalSeatPlace = 60;
        int totalStandPlace = wagonCapacity - totalSeatPlace;
        int freeSeatPlace = totalSeatPlace - passenger;
        int freeStandPlace = totalStandPlace - passenger;

        if (passenger < 59) {
            System.out.println("В вагоне есть " + freeSeatPlace + " сидячих мест и " + freeStandPlace + "и стоячие места.");
        }
        if (passenger >= 60 && passenger < 101) {
            System.out.println("В вагоне есть только стоячие места.");
        }
        if (passenger >= 102) {
            System.out.println("В вагоне нет мест.");
        }

    }
}