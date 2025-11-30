import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
    {
        public static void main(String[] args)
            {
                Task1 task1 = new Task1();
                task1.printAllTest(new double[] {30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675});

//                Task2 task2 = new Task2();
//                System.out.println(task2.testPow());

//                Task3 task3 = new Task3();
//                Scanner scanner = new java.util.Scanner(System.in);
//
//                System.out.print("Введите количество чисел n: ");
//                int n = scanner.nextInt();
//
//                int[] numbers = task3.creatNumArray(n);
//                task3.printSignSeriesInfo(numbers);
//
//                scanner.close();

//                Task4 month1 = new Task4(LocalDate.of(2023, 11, 12));
//                month1.printAllInfo();
//
//                Task4 month2 = new Task4();
//                month2.printAllInfo();

//                Task5 calculator = new Task5();
//                if (args.length > 0)
//                    {
//                        String result = calculator.calculateTimeLeft(args[0]);
//                        System.out.println(result);
//                    } else
//                    {
//                        System.out.println("Введите дату (формат: dd.MM.yyyy HH:mm):");
//                        Scanner scanner = new Scanner(System.in);
//                        String input = scanner.nextLine();
//
//                        String result = calculator.calculateTimeLeft(input);
//                        System.out.println(result);
//
//                        scanner.close();
//                    }
//                Object[][] tests = {{"Пустой массив", new int[]{}},
//                        {"Один элемент", new int[]{42}},
//                        {"Три элемента", new int[]{1, 2, 3}},
//                        {"10 элементов вручную", new int[]{5, 2, 2, 8, 9, 9, 1, 1, 1, 10}},
//                        {"100000 случайных чисел", genLargeArray()}};
//
//                for (Object[] t : tests)
//                    {
//                        String title = (String) t[0];
//                        int[] data = (int[]) t[1];
//
//                        System.out.println(title);
//
//                        Task6 stats = new Task6(data);
//
//                        System.out.println("Мода: " + Arrays.toString(stats.mode()));
//                        System.out.println("Медиана: " + stats.median());
//                        System.out.println("Среднее: " + stats.average());
//                        System.out.println("Дисперсия: " + stats.variance());
//                        System.out.println("Геометрическое среднее: " + stats.geometricMean());
//
//                        int[] sh1 = stats.shuffle();
//                        int[] sh2 = stats.shuffle();
//                        System.out.println("перемешивание  1: " + Arrays.toString(sh1));
//                        System.out.println("перемешивание  2: " + Arrays.toString(sh2));
//
//                        int sampleSize = data.length > 0 ? Math.min(5, data.length) : 0;
//                        int[] samp1 = stats.sample(sampleSize);
//                        int[] samp2 = stats.sample(sampleSize);
//                        System.out.println("выборка: " + Arrays.toString(samp1));
//                        System.out.println("выборка: " + Arrays.toString(samp2));
//
//                        System.out.println();
//                    }

//                Task7<String> ps = new Task7<>();
//
//                ps.push("Low", 10);
//                ps.push("High", 1);
//                ps.push("Medium", 5);
//
//                System.out.println(ps.size());
//                System.out.println(ps.peek());
//                System.out.println(ps.pop());
//                System.out.println(ps.pop());
//                System.out.println(ps.pop());
//                System.out.println(ps.size());

            }

//        private static int[] genLargeArray()
//            {
//                Random rnd = new Random(777);
//                int[] arr = new int[100_000];
//                for (int i = 0; i < arr.length; i++)
//                    {
//                        arr[i] = rnd.nextInt(1000);
//                    }
//                return arr;
//            }
    }

