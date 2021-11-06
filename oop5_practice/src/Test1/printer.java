package Test1;

/**
 * @author 黄明权
 * @date
 * @description
 */
public interface printer extends InkBox, Paper {

    static void size(String s){
        if(s.equals("A4")||s.equals("A4")){
            System.out.println("纸张正确");
        }else{
            System.out.println("纸张不对");
        }
    }
    static void color(String s){
        System.out.println("开始用"+s+"打印");
    }
}
