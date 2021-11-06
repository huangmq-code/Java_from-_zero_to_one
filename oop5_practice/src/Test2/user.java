package Test2;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class user {
    user(computer c){
        c.show();
    }
    public static void main(String[] args) {
        computer c=new computer("AMD",14.5,500, 16);
        user u=new user(c);

    }
}
