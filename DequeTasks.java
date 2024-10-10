package homework4;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTasks {
    // Реализуйте метод rotateDeque в классе DequeTasks, который принимает
    // Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
    // позиций. Если n отрицательное, повернуть влево.
    public static void rotateDeque(Deque<Integer> numbers, int n) {
        if (numbers.isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
        int size = numbers.size();
        n = n % size;
        for (int i = 0; i < n; i++) {
            int last = numbers.removeLast();
            numbers.addFirst(last);
        }
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(7);
        numbers.add(70);
        numbers.add(711);
        numbers.add(74);
        numbers.add(87);
        numbers.add(17);
        for (int deq : numbers) {
            System.out.println(deq);
        }
        rotateDeque(numbers, 3);

        Deque<String> deque = new LinkedList<>();
        deque.add("cherry");
        deque.add("apple");
        deque.add("banana");
        deque.add("grape");
        deque.add("apple");
        deque.add("cherry");
        deque.add("cherry");
        deque.add("apple");
        deque.add("cherry");

        removeAllOccurrences(deque, "cherry");
        System.out.println(deque);
    }

    public static void removeAllOccurrences(Deque<String> deque, String value) {
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(value)) {
                iterator.remove();
            }
        }
    }
}
