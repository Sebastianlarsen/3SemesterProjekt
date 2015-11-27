package SDK;
/**
 * Created by Sebastian on 27-11-2015.
 */
public class Scores {
    private int id;
    private int user_id;
    private int opponent_id;
    private int score_id;
    private int game_id;

    public Scores(){

    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getOpponent_id() {
        return opponent_id;
    }

    public int getScore() {
        return score_id;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setOpponent_id(int opponent_id) {
        this.opponent_id = opponent_id;
    }

    public void setScore_id(int score_id) {
        this.score_id = score_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }
}
