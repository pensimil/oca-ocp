package classesdesign;

public class InheritTest implements I2, I1{

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++){
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);

        boolean a1 = false, a2 = false;
        byte byt = Byte.MAX_VALUE;
        short shor = Short.MAX_VALUE;

        int in = 2;
        char c = 2;
        c = 1;
    }

    @Override
    public int m1() {
        return 0;

    }
}

interface I1 {
    int m1();
}

interface I2 {
    public int A = 1; //1
    int B = 1;          //2
    static int C = 1;  //3
    final int D = 1; 	 //4
    public static int E = 1; //5
    public final int F = 1;  //6
    static final int G = 1;    //7
    public static final int H = 1; //8
    double d = F;
    int m1();
}

interface I3 extends I1, I2 {
    int m1();
}