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
    private String controls;
    private String opponentcontrols;
    private int mapSize;

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

    public String getControls() {
        return controls;
    }

    public String getOpponentcontrols() {
        return opponentcontrols;
    }

    public int getMapSize() {
        return mapSize;
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

    public void setControls(String controls) {
        this.controls = controls;
    }

    public void setOpponentcontrols(String opponentcontrols) {
        this.opponentcontrols = opponentcontrols;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }
}
