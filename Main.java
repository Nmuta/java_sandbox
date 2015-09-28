import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static String[]cities = {"Denver", "Boulder", "Aurora",
			"Glendale", "Castle Rock", "Colorado Springs", "Not Pueblo",
			"Broomfield", "Kecskemét", "Westminster", "Lakewood"};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city_choice = JOptionPane.showInputDialog("Where do you live? ");

		boolean in_array = Arrays.asList(cities).contains(city_choice);

	    if (in_array){
	    	System.out.println("We have found your city");
	    } else {
	    	System.out.println(city_choice+"not found.  Can we interest you in visiting "+return_random()+" ?");
	    }
	}


	public static String return_random(){
		int idx = new Random().nextInt(cities.length);
		String random_city = (cities[idx]);
		return random_city;
	}

}
