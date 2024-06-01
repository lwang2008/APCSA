public class Mobile extends Structure {
	
	public Mobile(Branch lb, Branch rb) {
		this.lb = lb;
		this.rb = rb;
	}
	
	public Branch getLeftBranch() {return lb;}
	public Branch getRightBranch() {return rb;}
	
}
