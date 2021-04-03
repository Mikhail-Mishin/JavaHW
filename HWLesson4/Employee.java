package JavaHW.HWLesson4;
//1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
public class Employee {

    private String name;
    private String post;
    private String phone;
    private String salary;
    private int age;

    //2 Конструктор класса должен заполнять эти поля при создании объекта
    Employee(String name, String post, String phone, String salary, int age) {
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    String getName(){
        return name;
    }
    String getPost(){
        return post;
    }
    String getPhone(){
        return phone;
    }
    String getSalary(){
        return salary;
    }
    int getAge(){
        return age;
    }

}
