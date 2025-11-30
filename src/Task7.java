import java.util.ArrayList;
import java.util.List;

public class Task7<T>
    {

        private static class Node<T>
            {
                T value;
                int priority;

                Node(T value, int priority)
                    {
                        this.value = value;
                        this.priority = priority;
                    }
            }

        private final List<Node<T>> list = new ArrayList<>();

        public int size()
            {
                return list.size();
            }

        public void push(T value, int priority)
            {
                Node<T> node = new Node<>(value, priority);

                int pos = 0;
                while (pos < list.size() && list.get(pos).priority <= priority)
                    {
                        pos++;
                    }

                list.add(pos, node);
            }

        public T pop()
            {
                if (list.isEmpty()) return null;
                return list.remove(0).value;
            }

        public T peek()
            {
                if (list.isEmpty()) return null;
                return list.get(0).value;
            }
    }
