package srija;

public class HillStation {
	
	    void location() {
	        System.out.println("This is a hill station.");
	    }

	    void famousFor() {
	        System.out.println("This hill station is famous for  scenic beauty.");
	    }
	}

	class Manali extends HillStation{
	   
	    void location() {
	        System.out.println("Manali is located in Himachal Pradesh.");
	    }

	   
	    void famousFor() {
	        System.out.println("Manali is famous for snow-capped mountains.");
	    }
	}

	class Mussoorie extends HillStation {
	    
	    void location() {
	        System.out.println("Mussoorie is located in Uttarakhand.");
	    }

	    
	    void famousFor() {
	        System.out.println("Mussoorie is famous has plesant views.");
	    }
	}

	class Gulmarg extends HillStation {
	   
	    void location() {
	        System.out.println("Gulmarg is located in Jammu and Kashmir .");
	    }

	   
	    void famousFor() {
	        System.out.println("Gulmarg is famous place.");
	    }
	

	    public static void main(String[] args) {
	        HillStation hillStation;

	        hillStation = new Manali();
	        hillStation.location();
	        hillStation.famousFor();

	        hillStation = new Mussoorie();
	        hillStation.location();
	        hillStation.famousFor();

	        hillStation = new Gulmarg();
	        hillStation.location();
	        hillStation.famousFor();
	    }
	}
	