package template;

/*
 * 
 * The template method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure
 *  
 */
public class Template {

	public static void main(String[] args) {
		Brewer brewer = new TeaBrewer();
		brewer.brew();
	}

}
