package day55;

public abstract class Employee {

	
	 private int id;
	 private String name;

	  public Employee() {
	    // TODO Auto-generated constructor stub
	  }

	  public Employee(int id, String name) {
	    this.setId(id);
	    this.setName(name);
	  }

	  
	  // WE CAN'T MAKE STATIC METHOD ABSTRACT
	  //BECAUSE IT CAN NOT BE OVERRIDEN
	  
	  //WE CAN NOT MAKE ABSTRACT METHOD FINAL 
	  //BECAUSE WE REUSE IT
	  
	//WE CAN NOT MAKE PRIVATE METHOD FINAL 
	  //BECAUSE WE REUSE IT
	  
	  
	  public abstract void calculateAnnualSalary();
	//   {
//	     System.out.println("CALCULATE YOURSELF MY CHILD");
	//   }
	  
	  public abstract boolean isIn100KClub();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	}


