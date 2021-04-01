package JavaHW.HWLesson4;

public class HWLesson4 {
    public static void main(String[] args){

//5 Создать массив из 5 сотрудников.
        Employee[] employees = {
                new Employee("James", "Vocal", "8(999)1112233", "10000", 25),
                new Employee("Kirk", "Guitar", "8(999)2223344", "9000", 35),
                new Employee("Lars", "Drums", "8(999)3334455", "8000", 45),
                new Employee("Cliff", "Bass", "8(999)4445566", "7000", 55),
                new Employee("Bob", "Producer", "8(999)5556677", "6000", 65)

        };

//4 Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("ФИО = " + employees[2].getName() + " и должность = " + employees[2].getPost());

//С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        System.out.println("Сотрудники старше 40:");
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge() > 40){
                System.out.println(employees[i].getName() + ", " + employees[i].getPost() + ", " + employees[i].getPhone()
                        + ", " + employees[i].getSalary() + ", " + employees[i].getAge());
            }
        }





    }
}
