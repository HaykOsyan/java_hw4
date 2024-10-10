package homework4;

import java.util.LinkedList;

public class ListUtils {
    // Задача 3. Количество вхождений слова
    // Реализуйте метод countOccurrences в классе ListUtils, который
    // принимает LinkedList<String> и строку, и возвращает количество
    // вхождений строки в список.
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Ford");
        System.err.println(countOccurrences(cars, "Ford"));;
    }
}
