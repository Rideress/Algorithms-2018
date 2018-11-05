package lesson1;

import kotlin.NotImplementedError;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("unused")
public class JavaTasks {
    /**
     * Сортировка времён
     *
     * Простая
     * (Модифицированная задача с сайта acmp.ru)
     *
     * Во входном файле с именем inputName содержатся моменты времени в формате ЧЧ:ММ:СС,
     * каждый на отдельной Пример:
     *
     * 13:15:19
     * 07:26:57
     * 10:00:03
     * 19:56:14
     * 13:15:19
     * 00:40:31
     *
     * Отсортировать моменты времени по возрастанию и вывести их в выходной файл с именем outputName,
     * сохраняя формат ЧЧ:ММ:СС. Одинаковые моменты времени выводить друг за другом. Пример:
     *
     * 00:40:31
     * 07:26:57
     * 10:00:03
     * 13:15:19
     * 13:15:19
     * 19:56:14
     *
     * В случае обнаружения неверного формата файла бросить любое исключение.
     *
     *
     *
     *В лучшем случае сложность равна - O(n), в среднем случае - O(n*log(n)), в худшем случчае - O(n*log(n))
     * Ресурсоемкость равна R(n)
     */


    static public void sortTimes(String inputName, String outputName) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputName))) {
            class Pair {
                public String inputTime;
                public int timeValue;

                public String getInputTime() {
                    return inputTime;
                }

                public int getTimeValue() {
                    return timeValue;
                }

                public Pair(String inputTime, int timeValue) {
                    this.inputTime = inputTime;
                    this.timeValue = timeValue;
                }

            }

            String s;
            String[] tempTimes;
            ArrayList<Pair> listOfPair = new ArrayList<>();
            while ((s = br.readLine()) != null) {
                if (!s.matches("(([01]\\d)|2[0-3]):[0-5]\\d:[0-5]\\d")) {
                    throw new IllegalAccessError();
                } else {
                    tempTimes = s.split(":");
                    int result = 0;
                    for (String part : tempTimes) {
                        int number = Integer.parseInt(part);
                        result = result * 60 + number;
                    }
                    Pair newPair = new Pair(s, result);
                    listOfPair.add(newPair);
                }
            }
            listOfPair.sort(Comparator.comparingInt(Pair::getTimeValue));

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputName))) {

                for (Pair i: listOfPair){ bw.append(i.inputTime).append("\r\n");}
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /**
     * Сортировка адресов
     *
     * Средняя
     *
     * Во входном файле с именем inputName содержатся фамилии и имена жителей города с указанием улицы и номера дома,
     * где они прописаны. Пример:
     *
     * Петров Иван - Железнодорожная 3
     * Сидоров Петр - Садовая 5
     * Иванов Алексей - Железнодорожная 7
     * Сидорова Мария - Садовая 5
     * Иванов Михаил - Железнодорожная 7
     *
     * Людей в городе может быть до миллиона.
     *
     * Вывести записи в выходной файл outputName,
     * упорядоченными по названию улицы (по алфавиту) и номеру дома (по возрастанию).
     * Людей, живущих в одном доме, выводить через запятую по алфавиту (вначале по фамилии, потом по имени). Пример:
     *
     * Железнодорожная 3 - Петров Иван
     * Железнодорожная 7 - Иванов Алексей, Иванов Михаил
     * Садовая 5 - Сидоров Петр, Сидорова Мария
     *
     * В случае обнаружения неверного формата файла бросить любое исключение.
     */
    static public void sortAddresses(String inputName, String outputName) {
        throw new NotImplementedError();
    }

    /**
     * Сортировка температур
     *
     * Средняя
     * (Модифицированная задача с сайта acmp.ru)
     *
     * Во входном файле заданы температуры различных участков абстрактной планеты с точностью до десятых градуса.
     * Температуры могут изменяться в диапазоне от -273.0 до +500.0.
     * Например:
     *
     * 24.7
     * -12.6
     * 121.3
     * -98.4
     * 99.5
     * -12.6
     * 11.0
     *
     * Количество строк в файле может достигать ста миллионов.
     * Вывести строки в выходной файл, отсортировав их по возрастанию температуры.
     * Повторяющиеся строки сохранить. Например:
     *
     * -98.4
     * -12.6
     * -12.6
     * 11.0
     * 24.7
     * 99.5
     * 121.3
     */
    static public void sortTemperatures(String inputName, String outputName) {
        throw new NotImplementedError();
    }

    /**
     * Сортировка последовательности
     *
     * Средняя
     * (Задача взята с сайта acmp.ru)
     *
     * В файле задана последовательность из n целых положительных чисел, каждое в своей строке, например:
     *
     * 1
     * 2
     * 3
     * 2
     * 3
     * 1
     * 2
     *
     * Необходимо найти число, которое встречается в этой последовательности наибольшее количество раз,
     * а если таких чисел несколько, то найти минимальное из них,
     * и после этого переместить все такие числа в конец заданной последовательности.
     * Порядок расположения остальных чисел должен остаться без изменения.
     *
     * 1
     * 3
     * 3
     * 1
     * 2
     * 2
     * 2
     */
    static public void sortSequence(String inputName, String outputName) {
        throw new NotImplementedError();
    }

    /**
     * Соединить два отсортированных массива в один
     *
     * Простая
     *
     * Задан отсортированный массив first и второй массив second,
     * первые first.size ячеек которого содержат null, а остальные ячейки также отсортированы.
     * Соединить оба массива в массиве second так, чтобы он оказался отсортирован. Пример:
     *
     * first = [4 9 15 20 28]
     * second = [null null null null null 1 3 9 13 18 23]
     *
     * Результат: second = [1 3 4 9 9 13 15 20 23 28]
     *
     * Сложность алгоритма равна O(n), так как сравнение двух переменных это O(c), а перебор по массиву это O(n).
     *
     * Ресурсоемкость - R(n)
     */
    static <T extends Comparable<T>> void mergeArrays(Integer[] first, Integer[] second) {
        int i = 0; //index of first array
        int k = 0; //index of result
        int j = first.length; //index of second array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]){
                second[k] = first[i];
                i++;
                k++;
            } else {
                second[k] = second[j];
                j++;
                k++;
            }
            if (j == second.length && i < first.length)
                for (int p = i; p < first.length; p++) {
                    second[k++] = first[p];
                }

        }
    }
}
