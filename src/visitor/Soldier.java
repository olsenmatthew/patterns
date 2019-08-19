package visitor;

public class Soldier extends Unit {
	public Soldier(Unit... units) {
		super(units);
	}

	public void accept(UnitVisitor visitor) {
		visitor.visitSoldier(this);
		super.accept(visitor);
	}

	@Override
	public String toString() {
		return "Soldier";
	}
}
