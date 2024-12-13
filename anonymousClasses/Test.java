package anonymousClasses;

public class Test {

	public static void main(String[] args) {
		Abstract abs=new Abstract() {
			
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("Its Override");
			}
		};
		abs.show();
	}

}
