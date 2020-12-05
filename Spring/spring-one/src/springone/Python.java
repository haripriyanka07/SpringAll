package springone;

public class Python implements Language {
	
	private Execute ex;
	private String printStatement;
	
	public void setEx(Execute ex) {
		this.ex = ex;
	}
	public Python(Execute execute) {
		System.out.println("arg constructor");
		ex = execute;
	}
	public Python() {
		System.out.println("no arg constructor");
	}

	@Override
	public void language() {
		// TODO Auto-generated method stub
		System.out.println("Python");
	}

	@Override
	public void exec() {
		System.out.println("Python Program");
		ex.exec();
	}
	public void setPrintStatement(String printStatement) {
		this.printStatement = printStatement;
		System.out.println(printStatement);
	}
	
	public void startUp() {
		System.out.println("Stared");
	}
	public void destroy() {
		System.out.println("Ended");
	}

}
