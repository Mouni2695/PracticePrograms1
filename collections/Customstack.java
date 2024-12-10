package collections;

public class Customstack<S> {
	private S s;

	public S push(S s) {
		this.s=s;
		return s;
	}
	public S getS() {
		return s;
	}
	public void setS(S s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return " "
				+ "+[s=" + s + "]";
	}
	public static void main(String[] args) {
		
		Customstack<Integer> cs=new Customstack<Integer>();
        System.out.println(cs.push(10));
        
        Customstack<String> cs1=new Customstack<String>();
        System.out.println(cs1.push("mounika"));
        cs1.push("hi");
        System.out.println(cs1);
        
	}
      
}
