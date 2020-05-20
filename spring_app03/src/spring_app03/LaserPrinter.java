package spring_app03;

public class LaserPrinter implements Printer {
	String printer_type;
	
	public LaserPrinter() {
		// TODO Auto-generated constructor stub
	}
	public LaserPrinter(String printer_type) {
		this.printer_type = printer_type;
	}
	
	@Override
	public void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(printer_type+" : 지이이이이이이이이이이이잉");
		System.out.println(msg);
	}

}
