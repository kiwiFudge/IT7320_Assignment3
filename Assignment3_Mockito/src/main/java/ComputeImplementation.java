
public class ComputeImplementation implements ICompute {

	ICompute obj;
	
	public int squareVal(int val) {
		return obj.squareVal(val);
	}

	public int multiply(int x, int y) {
		return obj.multiply(x, y);
	}

	public void setObj(ICompute obj) {
		this.obj = obj;
	}

	
}
