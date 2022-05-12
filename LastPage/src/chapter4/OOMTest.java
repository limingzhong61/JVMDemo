package chapter4;

import java.util.ArrayList;
import java.util.Random;

/**
 * -XX:+PrintCommandLineFlags -Xms600m -Xmx600m -XX:SurvivorRatio=8
 * 默认情况下，新生代占1/3 : 200m， 老年代占2/3 : 400m
 * 其中, Eden默认占新生代的8/10 : 160m , Survivore, Survivor1 各占新生代的1/10 : 20m
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(100 * 50)));
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
