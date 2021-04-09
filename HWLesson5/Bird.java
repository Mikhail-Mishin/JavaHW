package JavaHW.HWLesson5;

public class Bird extends Animal {

    public Bird(String name, int run, int swim, double jump) {
        super(name, run, swim, jump);
    }

    @Override
    void swimming (int swimDist) {
        System.out.println("Птицы не плавают.");
    }
}
