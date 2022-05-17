package kata.clash.units;

public class Miner {
    private int DefensiveHitpoints;
    private int OffensiveHitpoints;

    public Miner() {
        this.DefensiveHitpoints = 800;
        this.OffensiveHitpoints = 1200;
    }

    public int getDefensiveHitpoints() {
        return DefensiveHitpoints;
    }

    private void setDefensiveHitpoints(int defensiveHitpoints) {
        DefensiveHitpoints = defensiveHitpoints;
    }

    public int getOffensiveHitpoints() {
        return OffensiveHitpoints;
    }

    private void setOffensiveHitpoints(int offensiveHitpoints) {
        OffensiveHitpoints = offensiveHitpoints;
    }

    public String ReceiveHit(int attackHitpoints) {
        int defensiveHitpoints = this.getDefensiveHitpoints() - attackHitpoints;
        this.setDefensiveHitpoints(defensiveHitpoints);
        return defensiveHitpoints < 0 ? "we return in the ground" : "";
    }

    public int Move(int seconds) {
        return seconds * 5;
    }

}
