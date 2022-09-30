import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        doClassesBlock();
    }

    public static void doCollectionTask(){
        CollectionBlockTask CBT = new CollectionBlockTask();
        CBT.printList();
        System.out.println("-----------------");
        CBT.getAverageScore();
        CBT.printOldest();
        CBT.printYoungest();
        CBT.printBest();
    }

    public static void doClassesBlock(){
        System.out.println("-----------------");
        System.out.println("\n Блок с классами \n");
        TwoVars TV = new TwoVars();
        TV.setFirstVar(1);
        TV.setSecondVar(10);

        TV.printFirstVar();
        TV.printSecondVar();
        System.out.println("Сумма элементов: " + TV.getSum());
        System.out.println("Максимальный элемент: " + TV.getMax());
        System.out.println("\n Второе задание \n");

        ClassWithDynamicArray CWDA = new ClassWithDynamicArray(10);
        CWDA.randomFillArray();
        CWDA.printArray();
        CWDA.shakeArray();
        CWDA.printArray();
        System.out.println(CWDA.countElems(1));

        System.out.println("\n Третье задание \n");

        Triangle TR = new Triangle(new Point(0, 0), new Point(0, 5), new Point(10, 0));
        System.out.println(TR.getSideB());
        System.out.println(TR.getCenter().toString());

        System.out.println("\n Четвёртое задание \n");

        Time TM = new Time(12, 23, 23);
        TM.setMinutes(55);
        TM.setHours(12);
        TM.setSeconds(59);
        System.out.println(TM.toString());

        System.out.println("\n Я что похож на абонента? \n");

        AbonentTask AB = new AbonentTask();
        System.out.println("\n Абоненты с большим временем, чем X \n");
        AB.showAbonentsThatHasMoreTime(50);
        System.out.println("\n Междугородние абоненты \n");
        AB.showIntercityAbonents();
        System.out.println("\n Абоненты в алфавитном порядке \n");
        AB.showOrderedAbonents();

        System.out.println("\n Тренировка со строками \n");

        StringBlock SB = new StringBlock();
        System.out.println("\n Подсчёт цифр \n");
        System.out.println(SB.getNumbersCount("asdasd12, wsa"));

        System.out.println("\n Только чётные \n");
        System.out.println(SB.getOddCharacterString("asdasd12, wsa"));

        System.out.println("\n Подсчёт последнего символа \n");
        System.out.println(Arrays.toString(SB.getArrayLastSymbol("asdasd12, wsa")));

        System.out.println("\n Замена цифр \n");
        System.out.println((SB.replaceAllNumbers("asdasd12, wsa")));

        System.out.println("\n Ревёрс \n");
        System.out.println((SB.replaceAllNumbers("asdЫIOasd12, wssSa sdsSS")));

        System.out.println("\n Практический блок \n");

        PracticeTask PT = new PracticeTask();
        PT.main();
    }
}
