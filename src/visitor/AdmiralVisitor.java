package visitor;

public class AdmiralVisitor implements UnitVisitor {

	@Override
	public void visitSoldier(Soldier soldier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitCommander(Commander commander) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitAdmiral(Admiral admiral) {
		// TODO Auto-generated method stub
		System.out.println("Ahoy " + admiral);
	}

}
