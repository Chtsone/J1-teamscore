import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
    {
        public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);

                Task1 task1 = new Task1();
                task1.printAllTest(new double[]{30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675});

                Task2 task2 = new Task2();
                task2.testPowPrint();

                Task3 task3 = new Task3();
                System.out.print("Введите количество чисел n: ");
                task3.printSignSeriesInfo(task3.creatNumArray(scanner.nextInt()));
                scanner.close();

                Task4 month1 = new Task4(LocalDate.of(2023, 11, 12));
                month1.printAllInfo();
                Task4 month2 = new Task4();
                month2.printAllInfo();

                DemoRunner.runCountdown(args, scanner); // Task5
                DemoRunner.runArrayStatistics();        // Task6
                DemoRunner.runPriorityStack();          // Task7

            }


    }

