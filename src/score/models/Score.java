package score.models;

public class Score {
    private int score;
    private int idUser;

    public Score(int score, int idUser) {
        this.score = score;
        this.idUser = idUser;
    }
    
    //Getters
    public int getUserId() {
        return idUser;
    }

    public int getScore() {
        return score;
    }   

    // Setters
    public void setUserId(int idUser) {
        this.idUser = idUser;
    }

    public void setScore(int score){
        this.score = score;
    }
}
