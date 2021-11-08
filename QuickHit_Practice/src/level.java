/**
 * @author 黄明权
 * @date
 * @description
 */
public class level {
    private int lvlNo;
    private int charNum;
    private int perScore;
    private int limitTime;
    private int typeCnt;

    public level(int lvlNo, int charNum, int perScore, int limitTime, int typeCnt) {
        this.lvlNo = lvlNo;
        this.charNum = charNum;
        this.perScore = perScore;
        this.limitTime = limitTime;
        this.typeCnt = typeCnt;
    }

    public int getLvlNo() {
        return lvlNo;
    }

    public void setLvlNo(int lvlNo) {
        this.lvlNo = lvlNo;
    }

    public int getCharNum() {
        return charNum;
    }

    public void setCharNum(int charNum) {
        this.charNum = charNum;
    }

    public int getPerScore() {
        return perScore;
    }

    public void setPerScore(int perScore) {
        this.perScore = perScore;
    }

    public int getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(int limitTime) {
        this.limitTime = limitTime;
    }

    public int getTypeCnt() {
        return typeCnt;
    }

    public void setTypeCnt(int typeCnt) {
        this.typeCnt = typeCnt;
    }
}
