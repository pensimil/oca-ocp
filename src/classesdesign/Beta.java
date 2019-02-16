package classesdesign;

// dědičnost - vyhodnocení hodnot proměnných/override metod
class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();

        System.out.println(b.h + " " + b.getH());
        // Beta 44 (před složením stringu pro println se vyhodnotí b.getH())
        // 4 44 (hodnota fieldu h se bere z typu proměnné getH() vždy podle typu instance)
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
        // Beta 44
        // 44 44
    }
}