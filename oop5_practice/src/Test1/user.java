package Test1;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class user implements printer{
    user(String S1,String S2){
        printer.size(S1);
        printer.color(S2);
    }
    public static void main(String[] args) {
        user U=new user("A4","洋红色");
    }
}
