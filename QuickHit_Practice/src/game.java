import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class game {
    private Scanner s = new Scanner(System.in);
    private level[] levels = levelparam.ls;
    private static int  count = 0;
    private static int err_count = 0;
    private static long time_count=0;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        game.count = count;
    }

    public static int getErr_count() {
        return err_count;
    }

    public static void setErr_count(int err_count) {
        game.err_count = err_count;
    }

    public static long getTime_count() {
        return time_count;
    }

    public static void setTime_count(long time_count) {
        game.time_count = time_count;
    }

    public void run(player p) {
        int lvlNo = p.getLvlNo();
        if (lvlNo > 6) {
            System.out.println("恭喜" + p.getName() + "成功通关");
            return;
        }
        System.out.println("欢迎" + p.getName() + "当前等级" + lvlNo + "积分" + p.getCurrScore());
        int cnt = levels[lvlNo - 1].getTypeCnt();
        int charNum = levels[lvlNo - 1].getCharNum();
        for (int i = 1; i <= cnt; i++) {
            count+=1;
            String printStr = randomStr(charNum);
            System.out.println("要匹配的字符串为" + printStr);
            boolean rst = isCorrect(printStr);
            long now = System.currentTimeMillis();
            if (!rst) {
                err_count+=1;
            }
            long used = now - p.getStartTime();
           time_count+=used;
           int score = p.getCurrScore() + levels[lvlNo - 1].getPerScore();
            p.setCurrScore(score);
            System.out.println("输入正确" + p.getName() + "积分为" + score + "已用时间" + used / 1000 + "秒");
        }
        p.setLvlNo(lvlNo + 1);
        p.setStartTime(System.currentTimeMillis());
        run(p);
    }

    public String randomStr(int charNum) {
        String str = "";
        for (int i = 0; i < charNum; i++) {
            int num = (int) (Math.random() * 2);
            char c = (char) (int) (Math.random() * 26 + (num == 0 ? 65 : 97));
            str += c;
        }
        return str;
    }

    private boolean isCorrect(String str) {
        System.out.println("请输入：");
        String input = s.next();
        if (str.equals(input)) {
            return true;
        }
        return false;
    }
}
