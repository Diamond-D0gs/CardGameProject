package Game;

import java.util.ArrayList;

public class Turn {
    private final ArrayList<Player> players;
    private final int currentPlayer;

    private int numReqDraws = 1;
    private int numReqSteals = 0;
    private int numReqDiscards = 0;
    private int numReqDestroys = 0;
    private int numReqSacrifices = 0;

    private int numOptDraws = 0;
    private int numOptSteals = 0;
    private int numOptDiscards = 0;
    private int numOptDestroys = 0;
    private int numOptSacrifices = 0;

    public Turn(ArrayList<Player> players, int currentPlayer) {
        this.players = players;
        this.currentPlayer = currentPlayer;
    }

    public Player GetCurrentPlayer() {
        return players.get(currentPlayer);
    }

    public Turn AddRequiredDraws(int numReqDraws) {
        this.numReqDraws += numReqDraws;
        return this;
    }

    public Turn AddRequiredSteals(int numReqSteals) {
        this.numReqSteals = numReqSteals;
        return this;
    }

    public Turn AddRequiredDiscards(int numReqDiscards) {
        this.numReqDiscards += numReqDiscards;
        return this;
    }

    public Turn AddRequiredDestroys(int numReqDestroys) {
        this.numReqDestroys += numReqDestroys;
        return this;
    }

    public Turn AddRequiredSacrifices(int numReqSacrifices) {
        this.numReqSacrifices += numReqSacrifices;
        return this;
    }

    public Turn AddOptionalDraws(int numOptDraws) {
        this.numOptDraws += numOptDraws;
        return this;
    }

    public Turn AddOptionalSteals(int numOptSteals) {
        this.numOptSteals = numOptSteals;
        return this;
    }

    public Turn AddOptionalDiscards(int numOptDiscards) {
        this.numOptDiscards += numOptDiscards;
        return this;
    }

    public Turn AddOptionalDestroys(int numOptDestroys) {
        this.numOptDestroys += numOptDestroys;
        return this;
    }

    public Turn AddOptionalSacrifices(int numOptSacrifices) {
        this.numOptSacrifices += numOptSacrifices;
        return this;
    }
}
