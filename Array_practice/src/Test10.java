/**
 * @author 黄明权
 * @date
 * @description 利用for 循环生成由ABCDEFG...XYZ，26 个大写字母与26 个小写字母组成的数组
 */
public class Test10 {
    public static void main(String[] args) {
        char [] ch=new char[52];
        for (int i=0; i<26; i++){
            ch[i] =(char)(i+65);
        }
        for (int i=0; i<26; i++){
            ch[i+26] =(char)(i+97);
        }
        for (int i=0; i< ch.length; i++){
            System.out.print(ch[i]+"\t");
        }
    }
}
