package kata.clash.units;

public class Dragon {
    private int DefensiveHitpoints;
    private int OffensiveHitpoints;

    public Dragon() {
        this.DefensiveHitpoints = 5000;
        this.OffensiveHitpoints = 7500;
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
        return defensiveHitpoints < 0 ? "I WILL RISE AGAIN FROM THE ASHES" : "";
    }

    public int Move(int seconds) {
        return seconds*8;
    }


}
