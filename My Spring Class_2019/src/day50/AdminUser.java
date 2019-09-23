package day50;

public class AdminUser extends SlackUser{

	int adminlevel;
	
	
	 public AdminUser(String displayName, int timezone, String status,int adminlevel) {
			super( displayName,  timezone,   status);
			
			this.adminlevel=adminlevel;
		}

	 
	 @Override
	 public void sendMessage(String message) {
		    
		    System.out.println("@channel" );
		    System.out.println("<"+displayName+"> is sending <" 
		            + message+">" );
		  }
	 
	 
	 @Override
		public String toString() {
			String adminLevel = null;
			return "AdminUser [adminLevel=" + adminLevel + ", displayName="+ displayName 
								            + ", timezone=" + timeZone
											+ ", status=" + status + "]";
		}
	 
	 public static void main(String[] args) {
		
		 AdminUser a1 =new AdminUser("B11",5,"Fully Charged",1);
		 a1.sendMessage("abc");
		 
	}
	 
}
