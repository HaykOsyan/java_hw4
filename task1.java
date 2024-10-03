package homework4;

import java.util.LinkedList;

public class task1 {
    // Задание 1. Удаление нечетных строк
    // Дан LinkedList с несколькими элементами. В методе
    // removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
    // которых нечетная. Используйте LinkedList и стандартные методы.
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("ban");
        list.add("cherry");
        list.add("date");
        list.add("datedad");
        removeOddLengthStrings(list);

        System.out.println(list);
    }

    public static LinkedList<String> removeOddLengthStrings(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 != 0) {
                System.out.println(list.get(i).length());
                list.remove(i);
            }
        }
        return list;
    }
}
