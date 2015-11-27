package SDK;

import java.util.Date;

/**
 * Created by Sebastian on 27-11-2015.
 */
public class Games {

    private int id;
    private int host;
    private int opponent;
    private String name;
    private String status;
    private Date created;
    private int winner;
    private String host_contols;
    private String opponent_controls;
    private int mapsize;

    public Games(){

    }

    public int getId() {
        return id;
    }

    public int getHost() {
        return host;
    }

    public int getOpponent() {
        return opponent;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreated() {
        return created;
    }

    public int getWinner() {
        return winner;
    }

    public String getHost_contols() {
        return host_contols;
    }

    public String getOpponent_controls() {
        return opponent_controls;
    }

    public int getMapsize() {
        return mapsize;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHost(int host) {
        this.host = host;
    }

    public void setOpponent(int opponent) {
        this.opponent = opponent;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setHost_contols(String host_contols) {
        this.host_contols = host_contols;
    }

    public void setOpponent_controls(String opponent_controls) {
        this.opponent_controls = opponent_controls;
    }

    public void setMapsize(int mapsize) {
        this.mapsize = mapsize;
    }
}
