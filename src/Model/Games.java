package Model;

import java.util.Date;

/**
 * Created by Sebastian on 27-11-2015.
 */
public class Games {

    private long id;
    private Player host;
    private Player opponent;
    private String name;
    private String status;
    private Date created;
    private Player winner;
    private String host_contols;
    private String opponent_controls;
    private int mapsize;

    public Games(){

    }

    public long getId() {
        return id;
    }

    public Player getHost() {
        return host;
    }

    public Player getOpponent() {
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

    public Player getWinner() {
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHost(Player host) {
        this.host = host;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public void setWinner(Player winner) {
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
