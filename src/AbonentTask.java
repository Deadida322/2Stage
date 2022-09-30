import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AbonentTask {
    public ArrayList<Abonent> abonentList = new ArrayList<Abonent>(List.of(
        new Abonent(1, "Иванов", "Иван", "Иванович", "Ульяновск",
                1, 100, 100, 0, 20),
        new Abonent(2, "Петров", "Иван", "Иванович", "Ульяновск",
                                      2, 180, 200, 100, 120),
        new Abonent(3, "Сидоров", "Иван", "Иванович", "Москва",
                                      3, 10, 300, 30, 60)
        )
    );

    public void showAbonentsThatHasMoreTime(int value){
        for (Abonent abonent : abonentList) {
            if (abonent.getTimeCity() >= value) {
                System.out.println(abonent);
            }
        }
    }

    public void showIntercityAbonents() {
        for (Abonent abonent : abonentList) {
            if (abonent.getTimeIntercity() > 0) {
                System.out.println(abonent);
            }
        }
    }
    static class AbonentComparator implements Comparator<Abonent> {

        @Override
        public int compare(Abonent o1, Abonent o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

    public void showOrderedAbonents() {
        Comparator<Abonent> cmprt = new AbonentComparator();
        abonentList.sort(cmprt);
        for (Abonent ab : abonentList){
            System.out.println(ab);
        }
    }
}
