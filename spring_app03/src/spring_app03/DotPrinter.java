package spring_app03;

public class DotPrinter implements Printer {
	String printer_type;
	
	public DotPrinter() {
		// TODO Auto-generated constructor stub
	}
	public DotPrinter(String printer_type) {
		this.printer_type=printer_type;
	}
	
	
	
	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(printer_type +" : 따다닥 따다닥 따다닥 따다닥 따다다닥");
		System.out.println(msg);
	}

}
