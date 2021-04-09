package JavaHW.HWLesson5;

public class Animal {

    protected String name;
    protected int run;
    protected int swim;
    protected double jump;

    public Animal(String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public double getJump() {
        return jump;
    }

    void running(int runDist) {
        if (runDist <= run && runDist >= 0){
          System.out.println(name + " пробежал " + runDist + " метров.");
        } else {
            System.out.println(name + " не может столько пробежать.");
        }

    }

    void swimming(int swimDist) {
        if (swimDist <= swim && swimDist >= 0){
            System.out.println(name + " проплыл " + swimDist + " метров.");
        } else {
            System.out.println(name + " не может столько проплыть.");
        }

    }

    void jumping(double jumpHeight) {
        if (jumpHeight <= jump && jumpHeight >=0){
            System.out.println(name + " прыгнул на " + jumpHeight + " метров.");
        } else {
            System.out.println(name + " не может так прыгать.");
        }


    }

}
