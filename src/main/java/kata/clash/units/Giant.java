package kata.clash.units;

public class Giant{
	private int DefensiveHitpoints;
	private int OffensiveHitpoints;

	public Giant() {
		this.DefensiveHitpoints = 4500;
		this.OffensiveHitpoints = 3000;
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
    public String ReceiveHit(int attackHitpoints)
    {
		int defensiveHitpoints = this.getDefensiveHitpoints() - attackHitpoints;
		this.setDefensiveHitpoints(defensiveHitpoints);
		return defensiveHitpoints < 0 ? "OUR IRON FISTS WILL BE REMEMBERED FOREVER" : "";
	}
    
    public int Move(int seconds)
    {
return seconds*3;    }

	
}
