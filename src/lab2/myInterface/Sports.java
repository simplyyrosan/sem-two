package lab2.myInterface;



public interface Sports {
    public int score1 = 22;
    public int score2 = 43;
    default int totalScore() {
        return score1 + score2;
    }
     
}
