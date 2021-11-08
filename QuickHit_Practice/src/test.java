import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class test {
    public static void main(String[] args) {
        player p = new player();
        game g = new game();
        p.play(g);
        System.out.println("正确率为："+(g.getCount()/g.getErr_count())+"%");
        System.out.println("手速为"+((g.getCount()*1000)/g.getTime_count())+"句/秒");
    }
}
