
// В этом классе осуществляется преобразование шагов в километры и калории

public class Converter {
    final static double lengthStep = 0.75d;
    final static double calorieStep = 50d;


    // Конвертация шагов в километры и калории

    static void convert(int steps) {
        System.out.println("Пройденная дистанция в километрах: " + (steps * lengthStep / 1_000));
        System.out.println("Количество сожжённых калорий: " + (steps * calorieStep / 1_000));
    }
}
