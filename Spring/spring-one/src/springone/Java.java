package springone;

public class Java implements Language {

	private Execute ex;
	
//	public Java(Execute ex) {
//		this.ex = ex;
//	}

	@Override
	public void language() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	public void setEx(Execute ex) {
		this.ex = ex;
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Java PRogram");
		ex.exec();
	}

}
