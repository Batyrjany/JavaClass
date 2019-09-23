package day44;

public class Job {

	private String title;
	private String company;
	private long AnnualSalary;
	
	
	public Job() {
		
		title = "undefined";
	    company = "unknown";
	}
	
	public Job(String title) {
		this.title = title;
	}
	
	public Job(String title, String company, long anualSalary) {
		this.title = title;
		this.company = company;
		this.AnnualSalary = anualSalary;

	}
    
	
		
	
	public String toString() {
		
		
		return "Job [title=" + title + ", company=" + company + ", AnnualSalary=" + AnnualSalary + "]";
	}




	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getAnualSalary() {
		return AnnualSalary;
	}

	public void setAnualSalary(long anualSalary) {
		this.AnnualSalary = anualSalary;
	}

	
	

}
