package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class attack {
    public static void main(String[] args) {

        hero h= new hero();
        h.setName("易大师");
        h.setAtt(1500);
        h.setDef(500);
        h.setHp(3000);
        monster m=new monster();
        m.setName("怪物");
        m.setAtt(850);
        m.setDef(500);
        m.setHp(1500);
        int a=h.getHp();
        int b=m.getHp();
       while(a>0&&b>0){
           a-=m.attack(h);
           if(a<=0){

               System.out.println(m.getName()+"击败了"+h.getName());
               break;
           }
           b-=h.attack(m);
           if(b<=0){
               System.out.println(h.getName()+"击败了"+m.getName());
               break;
           }
       }

    }
}
