package inner;

public class InnerClass extends Ano {
    public InnerClass(int a) {
        super(a);
    }
}

class Ano {
    int a;

    public Ano(int a) {
        this.a = a;
    }
}