package homework4;

import java.util.LinkedList;

// Задача 2. Реализация стека
// Реализуйте MyStack с использованием LinkedList с методами:
// ● push(String element) - добавляет элемент на вершину стека
// ● pop() - возвращает элемент с вершины и удаляет его
// ● peek() - возвращает элемент с вершины, не удаляя
// ● getElements() - возвращает все элементы стека

public class MyStack {
    private LinkedList<String> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(String elem) {
        stack.addFirst(elem);
    }

    public String pop() {
        if (!stack.isEmpty()) {
            return stack.removeLast();
        }
        return null;
    }

    public String peek() {
        if (!stack.isEmpty()) {
            return stack.getLast();
        }
        return null;
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }

}
