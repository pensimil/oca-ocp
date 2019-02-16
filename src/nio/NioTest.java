package nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Statement;

public class NioTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/personal/eadme.txt");
        Path p2 = Paths.get("/index.html");
        Path p3 = p1.relativize(p2).normalize();
        System.out.println(p3);

        System.out.println(Paths.get("/test/test1.xml").resolve(Paths.get("/test2.xml")));
        System.out.println(Paths.get("/test/test1.xml").subpath(0,2));
//        System.out.println(Paths.get("hajh/ksjdh.djk").toRealPath(LinkOption.NOFOLLOW_LINKS));
//        Files.readAllLines(Paths.get(""));
//        Files.walk(Paths.get("/"), 1).forEach(System.out::println);

    }
}
