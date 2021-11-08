/**
 * @author 黄明权
 * @date
 * @description
 */
public class player {
    private String name="张三";
    private int lvlNo = 1;
    private int currScore = 0;
    private long startTime = System.currentTimeMillis();
    private long usedTime;

    public player() {
    }

    public player(int levelNo, int currScore, long startTime, int elapasedTime) {
        this.lvlNo = levelNo;
        this.currScore = currScore;
        this.startTime = startTime;
        this.usedTime = elapasedTime;
    }

    public void play(game g) {
        g.run(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvlNo() {
        return lvlNo;
    }

    public void setLvlNo(int lvlNo) {
        this.lvlNo = lvlNo;
    }

    public int getCurrScore() {
        return currScore;
    }

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }


    public long getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(long usedTime) {
        this.usedTime = usedTime;
    }
}
