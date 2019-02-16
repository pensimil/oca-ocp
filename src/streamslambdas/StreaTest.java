package streamslambdas;

import java.io.*;

public class StreaTest {
    public static void main(String[] args) {
//        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("123")))) {
//            os.writeObject(new Test("545"));
//            os.writeObject(new Test("6546"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("123")))) {
            Test t1 = (Test) is.readObject();
            System.out.println(t1.getS());
            System.out.println(t1.getP());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Test.Prof t = new Test("").new Prof();

        short sh = 1;
        t.a(sh);

    }
}

final class Test implements Serializable {


//    private static final long serialVersionUID = 3600704134894882887L;
    private final String s;
    private final String p;

    Test(String s) {
        this.s = s;
        this.p = "";
    }

    public String getP() {
        return p;
    }

    public String getS() {
        return s;
    }

    class Teacher{
        void teach(String student){
            /* lots of code */
        }
    }
    class Prof extends Teacher{
        public void teach(String student)  {

        }

        int a(long a) {
            System.out.println("long: " + a);
            return (int) a;
        }

        int a(int a) {
            System.out.println("int: " + a);
            return (int) a;
        }

        int a(short a) {
            System.out.println("short: " + a);
            return a;
        }
    }
}
