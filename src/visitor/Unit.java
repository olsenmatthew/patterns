package visitor;

public abstract class Unit {
	public Unit[] children;

	public Unit(Unit... units) {
		this.children = units;
	}

	/*
	 * accept visitior
	 */
	public void accept(UnitVisitor visitor) {
		for (Unit u : children) {
			u.accept(visitor);
		}
	}
}
