package six_lesson;

/*Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое 
является информационной системой ветеринарной клиники
// Поля:
// id long
// name - имя кота
// age - возраст
// Sterialized boolean
// poroda Poroda
// lastVacctinationDate
// sex boolean
// health

Методы:
Метод прививки кота
Лечение Tratment дата/дата оконч/болезнь
 */
import java.util.Date;

public class Cat {
    // private int id;
    public String name;
    public Date bDate;
    public Sex sex;
    public Date lastVaccinationDate;
    public boolean sterialized;
    public Poroda poroda;
    public Treatment treatment;
    public Date treatmentDate;

    public void Vaccination(Date date) {
        this.lastVaccinationDate = date;
    }

    public void setTreatment(Date startDate, Date endDate, Treatment treatment) {
        if (endDate != null) {
            this.treatment = null;
            this.treatmentDate = null;
        } else {
            this.treatmentDate = startDate;
            this.treatment = treatment;
        }
    }

    public void Meow(int num) {
        System.out.printf("Cat %s said meow %d times", this.name, num);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.treatmentDate, this.treatment);
    }
}
