package Model;

/**
 * Created by Sebastian on 02-12-2015.
 */
public class Player extends User{

    private int score;
    private int totalScore;
    private String controls;
    private Boolean winner;
    /**
     * Getter and setter for player class, so i can get and set them in the other classes.
     */
    public Player (){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public String getControls() {
        return controls;
    }

    public void setControls(String controls) {
        this.controls = controls;
    }

    public Boolean getWinner() {
        return winner;
    }

    public void setWinner(Boolean winner) {
        this.winner = winner;
    }

    }
