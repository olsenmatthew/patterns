package visitor;

public class Sergeant extends Unit {

	public Sergeant(Soldier... soldiers) {
		super(soldiers);
	}

	public void accept(UnitVisitor visitor) {
		visitor.visitSergeant(this);
		super.accept(visitor);
	}

	@Override
	public String toString() {
		return "Sergeant";
	}

}
