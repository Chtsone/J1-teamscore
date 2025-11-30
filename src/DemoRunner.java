import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoRunner {

    public static void runCountdown(String[] args, Scanner scanner) {
        System.out.println("=== Task5: Обратный отсчет ===");
        String input = args.length > 0 ? args[0] : getInput(scanner);
        System.out.println(Task5.calculateTimeLeft(input));
    }

    private static String getInput(Scanner scanner) {
        System.out.println("Введите дату (формат: dd.MM.yyyy HH:mm):");
        return scanner.nextLine();
    }

    public static void runArrayStatistics() {
        Object[][] tests = {
                {"Пустой массив", new int[]{}},
                {"Один элемент", new int[]{42}},
                {"Три элемента", new int[]{1, 2, 3}},
                {"10 элементов вручную", new int[]{5, 2, 2, 8, 9, 9, 1, 1, 1, 10}},
                {"100000 случайных чисел", genLargeArray()}
        };

        for (Object[] t : tests) {
            String title = (String) t[0];
            int[] data = (int[]) t[1];

            System.out.println("=== " + title + " ===");
            Task6 stats = new Task6(data);
            System.out.println("Мода: " + Arrays.toString(stats.mode()));
            System.out.println("Медиана: " + stats.median());
            System.out.println("Среднее: " + stats.average());
            System.out.println("Дисперсия: " + stats.variance());
            System.out.println("Геометрическое среднее: " + stats.geometricMean());

            System.out.println("Перемешивание 1: " + Arrays.toString(stats.shuffle()));
            System.out.println("Перемешивание 2: " + Arrays.toString(stats.shuffle()));

            int sampleSize = data.length > 0 ? Math.min(5, data.length) : 0;
            System.out.println("Выборка 1: " + Arrays.toString(stats.sample(sampleSize)));
            System.out.println("Выборка 2: " + Arrays.toString(stats.sample(sampleSize)));
            System.out.println();
        }
    }

    public static void runPriorityStack() {
        Task7<String> ps = new Task7<>();
        ps.push("Low", 10);
        ps.push("High", 1);
        ps.push("Medium", 5);

        System.out.println("=== Task7: Стек с приоритетом ===");
        System.out.println("Размер стека: " + ps.size());
        System.out.println("Верхний элемент: " + ps.peek());
        while (ps.size() > 0) System.out.println("Поп: " + ps.pop());
        System.out.println("Размер после всех pop: " + ps.size());
    }

    private static int[] genLargeArray() {
        Random rnd = new Random(777);
        int[] arr = new int[100_000];
        for (int i = 0; i < arr.length; i++) arr[i] = rnd.nextInt(1000);
        return arr;
    }
}
