package Abstraction_computer;

public class Computer {

	private Monitor monitor;
	private Computer_Case computer_case;
	private Motherboard motherboard;
	public Computer(Monitor monitor, Computer_Case computer_case, Motherboard motherboard) {
		
		this.monitor = monitor;
		this.computer_case = computer_case;
		this.motherboard = motherboard;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Computer_Case getComputer_case() {
		return computer_case;
	}
	public void setComputer_case(Computer_Case computer_case) {
		this.computer_case = computer_case;
	}
	public Motherboard getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VGA123", "Gateway", 20, resolution);
		Computer_Case computer_case = new Computer_Case("UMBOX432", "Intel", "hard ppe");
		Motherboard motherboard = new Motherboard("M105", "ASUS", 10, "IOS 10.4");
		
		
		Computer computer = new Computer(monitor, computer_case, motherboard);
		
		computer.getComputer_case().turnOn();
		computer.getMonitor().switchOffMonitor();
		computer.getMotherboard().loadingOS("IOS 11.2");
		System.out.println();
		
	    computer.getMonitor().printResolution();
		
		monitor.setName("Samsung");
		System.out.println(monitor.getName());
		
		
	}
	
	
	
}
