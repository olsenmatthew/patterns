package visitor;

public class Commander extends Unit {

	public Commander(Unit... children) {
		super(children);
	}

	public void accept(UnitVisitor visitor) {
		visitor.visitCommander(this);
		super.accept(visitor);
	}

	@Override
	public String toString() {
		return "Commander";
	}

}
