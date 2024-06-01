public class Structure {
	
	double weight;
	Branch lb;
	Branch rb;
	
	public double getWeight() {
		double lbWeight = lb.getStructure().getWeight();
		double rbWeight = rb.getStructure().getWeight();
		return lbWeight + rbWeight;
	}
	
	public boolean isBalanced() {
		boolean balancedMobile = lb.torque() == rb.torque();
		boolean balancedLM = lb.getStructure().isBalanced();
		boolean balancedRM = rb.getStructure().isBalanced();
		return balancedMobile && balancedLM && balancedRM;
	}
	
}
