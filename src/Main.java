import java.util.Scanner;

/* Главный класс программы -
в нем реализован основной цикл работы - считывание команд
и вызов методов другого класса - StepTracker
 */


// Вывод меню , ввод данных пользователя и вывод запрошенной информации

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        System.out.println("Привет! Добро пожаловать в программу \"Счетчик калорий\"!");

        while(true) {
        printMenu();
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Введите название месяца в формате: \"Январь\",\"Февраль\",\"Март\" и т.д.");
            String month = scanner.next();
            System.out.println("Введите номер дня от 1 до 30");
            int day = scanner.nextInt();
            System.out.println("Введите количество пройденных шагов");
            int steps = scanner.nextInt();
            stepTracker.saveSteps(month,day,steps);
        } else if (userInput == 2) {
            System.out.println("Введите название месяца в формате: \"Январь\",\"Февраль\",\"Март\" и т.д.");
            String month = scanner.next();
            stepTracker.printStatistic(month);
                } else if (userInput == 3) {
            System.out.println("Введите цель по количеству шагов в день: ");
            int targetStepsCount = scanner.nextInt();
            stepTracker.changePurposeOfDailySteps(targetStepsCount);
        } else if (userInput == 0) {
            System.out.println("Программа завершена. Ждем Вас снова!");
            break;
        } else {
            System.out.println("Извините, такой команды не существует :(");
        }
            }

    }

    // Печать меню программы
    private static void printMenu() {
        System.out.println("Что вы хотите сделать? " +
                "Введите число, соответствующее пункту меню");
        System.out.println("1 - ввести количество пройденных шагов за день");
        System.out.println("2 - вывести статистику за определенный месяц");
        System.out.println("3 - изменить цель по количеству пройденных шагов за день");
        System.out.println("0 - завершить программу");
    }
}