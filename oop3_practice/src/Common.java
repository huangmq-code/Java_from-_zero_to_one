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

    public Common() {
    }

    public void attack(Hero h) {
        h.hp -= att - h.def;
        if(hp<0)
            return;
        if(h.hp<0)
            System.out.println(name+"击败了"+h.name);
    }
    public void attack(Monster m) {
        m.hp -= att - m.def;
        if(hp<0)
            return;
        if(m.hp<0)
            System.out.println(name+"击败了"+m.name);
    }
    public void attack(Soldier s) {
        s.hp -= att - s.def;
        if(hp<0)
            return;
        if(s.hp<0)
            System.out.println(name+"击败了"+s.name);
    }
}
