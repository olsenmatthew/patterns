package visitor;

public class Admiral extends Unit {
	public Admiral(Unit... units) {
		super(units);
	}

	public void accept(AdmiralVisitor visitor) {
		super.accept(visitor);
		visitor.visitAdmiral(this);
	}

	@Override
	public String toString() {
		return "Admiral Zhao";
	}

}
