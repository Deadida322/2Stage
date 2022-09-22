/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < valuesArray.length-1; i++) {
                if(valuesArray[i] > valuesArray[i+1]){
                    isSorted = false;
                    int temp = valuesArray[i];
                    valuesArray[i] = valuesArray[i+1];
                    valuesArray[i+1] = temp;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if (values.length == 0)
            return 0;
        int max = values[0];
        for (int i = 0; i < values.length; i++){
            if(values[i] > max)
                max = values[i];
        }
        return max;
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++){
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        return array;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        int[] resArray = new int[numbersCount];
        if (numbersCount < 1)
            return resArray;
        if (numbersCount == 1){
            resArray[0] = 0;
        } else {
            resArray[0] = 0;
            resArray[1] = 1;
            for (int i = 2; i < numbersCount; i++){
                resArray[i] = resArray[i - 1] + resArray[i - 2];
            }
        }
        return resArray;
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        if(array.length < 2)
            return array.length;
        array = sort(array);
        int maxCount = 0;
        int maxValue = array[0];
        int maxMaxCount = maxCount;
        for (int i = 0; i < array.length; i++){
            if (array[i] == maxValue){
                maxCount++;
            }
            else{
                if(maxCount > maxMaxCount){
                    maxMaxCount = maxCount;
                }
                maxCount = 1;
                maxValue = array[i];
            }
        }
        return maxMaxCount;
    }
}
