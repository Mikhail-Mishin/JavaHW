package JavaHW.HWLesson5;

public class Cat extends Animal {

    public Cat(String name, int run, int swim, double jump) {
        super(name, run, swim, jump);
    }
    @Override
    void swimming (int swimDist) {
        System.out.println("Кошки не плавают.");
    }
}
