package collections;

import java.util.Stack;

public class Mystack<M > {
	private M m;

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}
	public M push(M m) {
		System.out.println(m);
		return m;
	}

	private void pop() {
		
	}
	
    @Override
	public String toString() {
		return "Mystack [m=" + m + ", getM()=" + getM()+ "]";
	}

	public static void main(String[] args) {
		Mystack<String> ms=new Mystack<String>();
		ms.push("Mouni");
		ms.push("Dhana");
		ms.push("Latha");
		ms.pop();
		System.out.println(ms);
	
	}
}
