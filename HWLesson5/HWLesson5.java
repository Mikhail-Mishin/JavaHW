package JavaHW.HWLesson5;

import java.util.Random;

public class HWLesson5 {

    public static Random random = new Random();


    public static void main(String[] args) {

        Dog dog = new Dog("Пёс", 500, 10, 0.5);
        Horse horse = new Horse("Конь", 1500, 100, 3);
        Bird bird = new Bird("Птиц", 5, 0, 0.2);
        Cat cat = new Cat("Кот", 200, 0, 2);

        dog.running(600);
        dog.running(400);
        dog.swimming(10);
        dog.jumping(1);

        System.out.println("_______Следующий______");

        horse.running(1000);
        horse.swimming(101);
        horse.jumping(1.5);

        System.out.println("_______Следующий______");

        bird.running(5);
        bird.swimming(10);
        bird.jumping(-0.1);

        System.out.println("_______Следующий______");

        cat.running(random.nextInt());
        cat.swimming(random.nextInt());
        cat.jumping(random.nextInt());
    }
}
