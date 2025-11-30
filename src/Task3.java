import java.util.Arrays;
import java.util.Random;

public class Task3
    {
        private final Random random = new Random();

        public int[] creatNumArray(int size)
            {
                int[] arr = new int[size];
                Arrays.setAll(arr, i -> arr[i] = (random.nextInt(201) - 100));
                return arr;
            }

        public int findSeries(int[] numbers)
            {
                int maxSeriesLength = 0;
                int currentSeriesLength = 0;
                String currentSign = "0";

                for (int number : numbers)
                    {
                        if (number > 0)
                            {
                                if (currentSign == "+")
                                    {
                                        currentSeriesLength++;
                                    } else
                                    {
                                        currentSign = "+";
                                        currentSeriesLength = 1;
                                    }
                            } else if (number < 0)
                            {
                                if (currentSign == "-")
                                    {
                                        currentSeriesLength++;
                                    } else
                                    {
                                        currentSign = "-";
                                        currentSeriesLength = 1;
                                    }
                            } else
                            {
                                currentSign = "0";
                                currentSeriesLength = 0;
                            }

                        if (currentSeriesLength > maxSeriesLength)
                            {
                                maxSeriesLength = currentSeriesLength;
                            }
                    }

                return maxSeriesLength;
            }

        public void printSignSeriesInfo(int[] numbers)
            {

                System.out.print("Сгенерированные числа: ");
                for (int number : numbers)
                    {
                        System.out.print(number + " ");
                    }
                System.out.println();

                int maxLength = findSeries(numbers);

                System.out.println("Самая длинная серия знакоповторений: " + maxLength);
            }

    }
