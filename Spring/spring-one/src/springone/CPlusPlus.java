package springone;

public class CPlusPlus implements Language{

	private Execute ex;
	
	
	public CPlusPlus(Execute ex) {
		this.ex = ex;
	}

	public void language() {
		// TODO Auto-generated method stub
		System.out.println("c++");
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("C++ program");
		ex.exec();
	}
	
}
