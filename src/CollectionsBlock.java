
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see CollectionsBlockTest.
 */
public class CollectionsBlock<T extends Comparable> {

    /**
     * Даны два упорядоченных по убыванию списка.
     * Объедините их в новый упорядоченный по убыванию список.
     * Исходные данные не проверяются на упорядоченность в рамках данного задания
     *
     * @param firstList  первый упорядоченный по убыванию список
     * @param secondList второй упорядоченный по убыванию список
     * @return объединенный упорядоченный список
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask0(List<T> firstList, List<T> secondList) {
        ArrayList<T> resultList = new ArrayList<T>(Stream.concat(firstList.stream(), secondList.stream()).toList());
        Collections.sort(resultList, Comparator.reverseOrder());
        return resultList;
    }

    /**
     * Дан список. После каждого элемента добавьте предшествующую ему часть списка.
     *
     * @param inputList с исходными данными
     * @return измененный список
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask1(List<T> inputList) {
        if(inputList == null)
            throw new NullPointerException("Входной параметр не должен быть null");
        ArrayList<T> resultArray = new ArrayList<>(inputList);
        int sublistOffset = 0;
        for (int i = 1; i <= inputList.size(); i++){
            sublistOffset += inputList.subList(0, i - 1).size() - 1;
            resultArray.addAll(i + sublistOffset + 1, inputList.subList(0, i - 1));
        }
        return resultArray;
    }


    /**
     * Даны два списка. Определите, совпадают ли множества их элементов.
     *
     * @param firstList  первый список элементов
     * @param secondList второй список элементов
     * @return <tt>true</tt> если множества списков совпадают
     * @throws NullPointerException если один из параметров null
     */
    public boolean collectionTask2(List<T> firstList, List<T> secondList) {
        Set<T> firstSet = new HashSet<T>(firstList);
        Set<T> secondSet = new HashSet<T>(secondList);
        return firstSet.equals(secondSet);
    }

    /**
     * Создать список из заданного количества элементов.
     * Выполнить циклический сдвиг этого списка на N элементов вправо или влево.
     * Если N > 0 циклический сдвиг вправо.
     * Если N < 0 циклический сдвиг влево.
     *
     * @param inArr список, для которого выполняется циклический сдвиг влево
     * @param shift        количество шагов циклического сдвига N
     * @return список inputList после циклического сдвига
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask3(List<T> inArr, int shift) {

            if ((inArr == null) || (inArr.size() == 0 ) || (shift <= 0)) {
                throw new java.lang.IllegalArgumentException();
            }
            while(shift>0)
            {
                T lastVar = inArr.get(inArr.size() - 1);
                for(int counter = 0; counter<inArr.size(); counter++)
                {
                    T curVal = inArr.get(counter);
                    inArr.set(counter, lastVar);
                    lastVar = curVal;
                }
                shift--;
            }
            return inArr;
    }
}
