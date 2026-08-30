public class ScoreBox
{
    private int score;
    public ScoreBox()
    {
        score=0;
    }
    public ScoreBox(int score)
    {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }    
    static void addBonus(ScoreBox box, int bonus)
    {
        box.setScore(box.getScore()+bonus);
    }
    static void replaceLocally(ScoreBox box)
    {
        box = new ScoreBox();
    }
    static ScoreBox createScoreBox(int score)
    {
        ScoreBox sc = new ScoreBox(score);
        return sc;
    }
}
