/**
 * @author 黄明权
 * @date
 * @description
 */
public class Common {
   String name;
   int att;
   int def;
   int hp;
    public Common(){}
    public Common(String name, int att, int def, int hp) {
        this.name = name;
        this.att = att;
        this.def = def;
        this.hp = hp;
    }

    void attack(Common c){
        c.hp-=att-c.def;
        if(c.hp<0){
            System.out.println(name+"击败了"+c.name);
        }

   }
}
