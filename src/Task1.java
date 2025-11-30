import java.util.Arrays;

public class Task1
    {


        long[] testRound(double[] numbers)
            {
                long[] res = Arrays.stream(numbers).mapToLong(Math::round).toArray();
                return res;
            }

        double[] testCeil(double[] numbers)
            {
                double[] res = Arrays.stream(numbers).map(Math::ceil).toArray();
                return res;
            }

        double[] testFloor(double[] numbers)
            {
                double[] res = Arrays.stream(numbers).map(Math::floor).toArray();
                return res;
            }

        double[] testRint(double[] numbers)
            {
                double[] res = Arrays.stream(numbers).map(Math::rint).toArray();
                return res;
            }

        void printAllTest(double[] numbers)
            {
                double[] floor = testFloor(numbers);
                double[] ceil = testCeil(numbers);
                double[] rint = testRint(numbers);
                long[] round = testRound(numbers);
                System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "unchanged", "floor", "ceil", "rint", "round");
                for (int i = 0; i < numbers.length; i++)
                    {
                        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", numbers[i], floor[i], ceil[i], rint[i], round[i]);
                    }
            }

    }
