package visitor;

public class CommanderVisitor implements UnitVisitor {

	@Override
	public void visitSoldier(Soldier soldier) {
		// TODO Auto-generated method stub
		// do nothing
	}

	@Override
	public void visitSergeant(Sergeant sergeant) {
		// TODO Auto-generated method stub
		// do nothing
	}

	@Override
	public void visitCommander(Commander commander) {
		// TODO Auto-generated method stub
		System.out.println("Good to see you... " + commander);
	}

	@Override
	public void visitAdmiral(Admiral admiral) {
		// TODO Auto-generated method stub

	}

}
