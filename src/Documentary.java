/** Program header:  Documentary.java
 *
 * Author:    Tim O'Brien
 * Class:     Java Online
 *
 * Brief Program Description:
 *   Documentary class, child of Movie.
 */

public class Documentary extends Movie {

	/** a list of private data members goes here */
	private int numberOfDistributors;
	private double premiumPaid;
	
	/** constructors go here, with the default constructor leading other constructor(s) */
	public Documentary() {}
	public Documentary(int numberOfDistributors, double premiumPaid) {
		super.getTitle();
		super.getDirector();
		super.getYear();
		super.getProductionCost();
		this.numberOfDistributors = numberOfDistributors;
		this.premiumPaid = premiumPaid;
	}
	
	/** getters for private data members go here. Other name: readers/accessors */
	public int getNumberOfDistributors() {
		return numberOfDistributors;
	}
	
	public double getPremiumPaid() {
		return premiumPaid;
	}
	
	/** setters for private data members go here. Other name: writers/mutators */
	public void setNumberOfDistributors(int numberOfDistributors) {
		this.numberOfDistributors = numberOfDistributors;
	}
	
	public void setPremiumPaid(int premiumPaid) {
		this.premiumPaid = premiumPaid;
	}
	
	/** effectors (methods that are not constructor/getter/setter) go here */
	public String getCategory() {
		String d = "documentary";
		
		return d;
	}
	
	public double calcRevenue() {
		double revenue = premiumPaid * numberOfDistributors;
		
		return revenue;
	}
	
	public double calcProfit() {
		double profit = calcRevenue() - getProductionCost();
		
		return profit;
	}
	
	public String toString() {
		String fromParent = super.toString(); 
		String myOwnMessage = String.format ("This is an %8s movie, it generated %8s in profit.", getCategory(), calcProfit()); 
		return fromParent + myOwnMessage; 
	}
	
}
