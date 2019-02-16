package classesdesign;

public class ClassSubClass {
    public void a() {}
}

class Ext extends ClassSubClass {
    // metoda v subclass nemuze vyhodit exception kdyz v parentu nema throws
    @Override
    public void a() /*throws Exception*/ {
//        throw new Exception();
    }
}
