package visitor;

/*
 * The visitor pattern defines a mechanism to apply operations to nodes in a hierarchy.
 * New operations can be added without altering the node interface
 * 
 * In this example there is a unit hierarchy begininng from Commander. This hierarchy is
 * traversed by visitors. SoldierVisitor applies its operation on link Soldiers, SergentVisitor
 * on Sergeants and so on.
 */
public class App {

	public static void main(String[] args) {
		Commander commander = new Commander(new Sergeant(new Soldier(), new Soldier(), new Soldier()),
				new Sergeant(new Soldier(), new Soldier(), new Soldier()));
		Admiral admiral = new Admiral(commander);
		commander.accept(new SoldierVisitor());
		commander.accept(new SergeantVisitor());
		commander.accept(new CommanderVisitor());
		admiral.accept(new AdmiralVisitor());
	}

}
