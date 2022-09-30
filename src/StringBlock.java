import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
    * Набор тренингов по работе со строками в java.
    * <p>
 * Задания определены в комментариях методов.
         * <p>
 * Проверка может быть осуществлена запуском тестов.
         * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
        */
public class StringBlock {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     * (нумерация символов идет с нуля)
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuffer str = new StringBuffer();
//        String STR = "";
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (i % 2 == 0) {
//                STR += String.valueOf(charArray[i]);
                str.append(charArray[i]);
            }
        }
        return str.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        char [] charArray = text.toCharArray();

        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        char lastSymbol = charArray[charArray.length - 1];

        for (int i = 0; i < charArray.length-1; i++){
            if(charArray[i] == lastSymbol){
                resultArray.add(i);
            }
        }
        return resultArray.stream().mapToInt(x -> x).toArray();
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        char[] charArray = text.toCharArray();
        int counter = 0;
        for(char el : charArray){
            if (Character.isDigit(el)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цифры заменены словами
     */
    public String replaceAllNumbers(String text) {
        HashMap<Character, String> numberMap = new HashMap<>(Map.of('1', "one", '2', "two",
                '3', "three", '4', "four", '5', "five", '6', "six", '7', "seven",
                '8', "eight", '9', "nine", '0', "null"));
        StringBuilder str = new StringBuilder(text);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (numberMap.containsKey(c)) {
                str.deleteCharAt(i);
                str.insert(i, numberMap.get(c));
            }
        }
        return str.toString();
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuffer str = new StringBuffer(text);
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                char c1 = Character.toUpperCase(c);
                str.replace(i, i+1, String.valueOf(c1));
            } else {
                char c1 = Character.toLowerCase(c);
                str.replace(i, i+1, String.valueOf(c1));
            }
        }
        return str.toString();
    }

}