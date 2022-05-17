package kata.clash.units;

public class Bomber {
    private int DefensiveHitpoints;
    private int OffensiveHitpoints;


    public Bomber() {
        this.DefensiveHitpoints = 350;
        this.OffensiveHitpoints = 800;
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
        return defensiveHitpoints < 0 ? "WHEN YOU play with Explosives is dangerous bussiness" : "";
    }
/*
    public int Move(int seconds) {
        return seconds * 3;
    }*/

    public int Move(int seconds) {
        return seconds * 6;
    }

}
