package trash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * podle mě je blbost, že enhanced loop chrání před nekonečným cyklem. záleží na implementaci iteratoru.
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        Iter i = new Iter("test");

        for (Iter it : i) {
            System.out.println(it);
        }
        List<Exception> l = new ArrayList<>();
        testMet(l);

        List<String> s = new ArrayList<>();
//        List<? extends String>


    }

    static void testMet(List<? super Exception> d) {
        // je jistota, že lze přiřadit podtřídy od Exception (včetně Exception)
        d.add(new ClassCastException());
        d.add(new Exception());

        // O objektu v listu víme jen, že to je Object (nejvyšší třída)
        Object e = d.get(0);
    }

    static void testMet2(List<? extends ClassCastException> d) {
        // o objektu v listu víme, že je ClassCastException nebo nějaká podtřída (čili můžeme je přiřadit do nadtřídy)
        ClassCastException a = d.get(0);
        Exception a2 = d.get(0);

        // vložit nelze nic. přišel by list podtříd ClassCastException a nevíme přesně jaký mají typ, takže bychom mohli vložit objekt,
        // který nesplní kontrakt typu v listu
    }

    static void testMet3(List<?> d) {
        // nelze nic vložit (nevíme vůbec nic o typu)
        // nelze nic vyndat listu bez přetypování (o typech nevíme nic)
    }

}

class Iter implements Iterable<Iter> {
    private final String s;

    Iter(String s) {
        this.s = s;
    }

    @Override
    public Iterator<Iter> iterator() {
        return new IterIterator(this);
    }

    @Override
    public String toString() {
        return "trash.Iter{" +
                "s='" + s + '\'' +
                '}';
    }
}

class IterIterator implements Iterator<Iter> {
    private final Iter iter;

    IterIterator(Iter iter) {
        this.iter = iter;
    }


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Iter next() {
        return iter;
    }
}
