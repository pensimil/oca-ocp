package trash;

class Npackage {

    public static void main(String[] args) {
        Npackage2.a();
    }
}

class A{
    int i;
    public A() {}
    public A(int x) { this.i = x; }
}
class B extends A{
    int j;
    public B(int x, int y) { super(x);  this.j = y; }
//    trash.B(int y ) { super(y*2 ); j = y; }
//    trash.B(int y ) { j = y; }
//    trash.B( ) { }
//    trash.B(int z ) { this(z, z); }
//    trash.B(int y ) { i = y; j = y*2; }
//    trash.B(int y ) { j = y; }
}
