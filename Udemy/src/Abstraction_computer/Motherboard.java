package Abstraction_computer;

public class Motherboard {

	private String model;
	private String name;
	private int cell_amount;
	private String oper_sys;
	
	public void loadingOS(String oper_sys) {
		this.oper_sys=oper_sys;
		System.out.println(oper_sys+" operating system is loading...");
		
	}
	public Motherboard(String model, String name, int cell_amount, String oper_sys) {
		
		this.model = model;
		this.name = name;
		this.cell_amount = cell_amount;
		this.oper_sys = oper_sys;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCell_amount() {
		return cell_amount;
	}
	public void setCell_amount(int cell_amount) {
		this.cell_amount = cell_amount;
	}
	public String getOper_sys() {
		return oper_sys;
	}
	public void setOper_sys(String oper_sys) {
		this.oper_sys = oper_sys;
	}
	
	
}
