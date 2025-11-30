import java.util.*;

public class Task6
    {

        private final int[] data;
        private final Random random = new Random(123);

        public Task6(int[] data)
            {
                if (data == null)
                    {
                        this.data = new int[0];
                    } else
                    {
                        this.data = data.clone();
                    }
            }

        public int[] mode()
            {
                if (data.length == 0) return new int[0];

                HashMap<Integer, Integer> freq = new HashMap<>();

                for (int n : data)
                    {
                        if (freq.containsKey(n))
                            {
                                freq.put(n, freq.get(n) + 1);
                            } else
                            {
                                freq.put(n, 1);
                            }
                    }

                int max = 0;
                for (int v : freq.values())
                    {
                        if (v > max) max = v;
                    }

                ArrayList<Integer> list = new ArrayList<>();
                for (Map.Entry<Integer, Integer> e : freq.entrySet())
                    {
                        if (e.getValue() == max)
                            {
                                list.add(e.getKey());
                            }
                    }

                int[] arr = new int[list.size()];
                for (int i = 0; i < list.size(); i++)
                    {
                        arr[i] = list.get(i);
                    }
                return arr;
            }

        public double median()
            {
                if (data.length == 0) return Double.NaN;

                int[] copy = data.clone();
                Arrays.sort(copy);

                int n = copy.length;
                if (n % 2 == 1)
                    {
                        return copy[n / 2];
                    } else
                    {
                        return (copy[n / 2 - 1] + copy[n / 2]) / 2.0;
                    }
            }

        public double average()
            {
                if (data.length == 0) return Double.NaN;

                double sum = 0;
                for (int n : data)
                    {
                        sum += n;
                    }
                return sum / data.length;
            }

        public double variance()
            {
                if (data.length == 0) return Double.NaN;

                double avg = average();
                double sum = 0;

                for (int n : data)
                    {
                        double diff = n - avg;
                        sum += diff * diff;
                    }

                return sum;
            }

        public double geometricMean()
            {
                if (data.length == 0) return Double.NaN;

                double prod = 1.0;

                for (int n : data)
                    {
                        if (n <= 0) return Double.NaN;
                        prod *= n;
                    }

                return Math.pow(prod, 1.0 / data.length);
            }

        public int[] shuffle()
            {
                int[] copy = data.clone();

                for (int i = copy.length - 1; i > 0; i--)
                    {
                        int j = random.nextInt(i + 1);

                        int t = copy[i];
                        copy[i] = copy[j];
                        copy[j] = t;
                    }

                return copy;
            }

        public int[] sample(int size)
            {
                if (data.length == 0) return new int[0];

                int[] res = new int[size];

                for (int i = 0; i < size; i++)
                    {
                        int pos = random.nextInt(data.length);
                        res[i] = data[pos];
                    }

                return res;
            }
    }
