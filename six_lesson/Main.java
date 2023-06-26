package six_lesson;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Barsik";
        cat.sex = Sex.F;
        Calendar calendar = new GregorianCalendar(2017, 1, 25);
        cat.bDate = calendar.getTime();
        cat.sterialized = false;
        cat.poroda = Poroda.SIBIRSKIY;

        cat.setTreatment((new GregorianCalendar(2023, 5, 23)).getTime(), null, Treatment.CHUMKA);

        System.out.println(cat.toString());

        cat.setTreatment(null, (new GregorianCalendar(2023, 5, 24)).getTime(), null);

        System.out.println(cat.toString());

        cat.Meow(6);
    }
}
