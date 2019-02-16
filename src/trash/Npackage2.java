package trash;

public class Npackage2 {

    public static int a() {
        return 2;
    }

    public static void main(String[] args) {
        short s = 5;

        int i = 6;

        Integer inte = new Integer(2);

        System.out.println(s == i);
        System.out.println(s == inte);
// není konstruktor
//        new Short(9);
        boolean bool = true;
        double doub = 2.5;

        String str = null;


        System.out.println(s == doub);

        Integer.parseInt("23");
    }
}
