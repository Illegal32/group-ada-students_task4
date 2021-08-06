package az.coders.ada_students.project;

public class Muallim extends Universtet implements ExtraForTeacher {

    private String salary;

    public Muallim(String name, String surname, int age, String holidayFestival, String holiday, String club, String fail, String payment, String scholarship, String salary) {
        super(name, surname, age, holidayFestival, holiday, club, fail, payment, scholarship);
        this.salary = salary;
    }

    public Muallim() {
        super();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public double salary(){
        return (7 * dersSaati) + (3 * extraDers);
    }

    @Override
    public String toString() {
        return "Muallim{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", bayramSenlikleri='" + getHolidayFestival() + '\'' +
                ", tetil='" + getHoliday() + '\'' +
                "salary='" + salary + '\'' +
                '}';
    }
}
