package visitor;

public interface UnitVisitor {
	void visitSoldier(Soldier soldier);

	void visitSergeant(Sergeant sergeant);

	void visitCommander(Commander commander);

	void visitAdmiral(Admiral admiral);
}
