package Test3;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class  equipment implements sword,shield ,medicament {
    int att;
    int def;
    int hp;

    public equipment(int att, int def, int hp) {
        this.att = att;
        this.def = def;
        this.hp = hp;
    }

    void addatt(Common c){
        c.att+=att;
    }
    void adddef(Common c){
        c.def+=def;
    }
    void addhp(Common c){
        c.hp+=hp;
    }
}
