import jdk.incubator.vector.DoubleVector;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Кол-во аргументов командой строки (элементов вектора)
        int N = args.length;
        // Макс. размер вектора (выбран рекомендуемый для системы)
        var SPECIES = DoubleVector.SPECIES_MAX;
        // Массив для хранения элементов
        double[] elements = new double[N];
        // Конвертация строковых аргументов строки в элементы типа double
        for (int i = 0; i < N; i++) {
            elements[i] = Double.parseDouble(args[i]);
        }
        System.out.println("Прочитанные элементы: " + Arrays.toString(elements));
        // Создание объекта класса DoubleVector
        var vector = DoubleVector.fromArray(SPECIES, elements, 0);
        System.out.print("Вектор: ");
        // Вывод элементов вектора
        for (int i = 0; i < N; i++) {
            System.out.printf("%f ", vector.lane(i));
        }
    }
}