package basicconstructs;

public class InitTest2 {
    static String a = "ds";
    public InitTest2() {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    static InitTest2 getNull() {
        return null;
    }

    public static void main(String[] args) {
        new InitTest2();
        System.out.println(getNull().a);
    }
}
