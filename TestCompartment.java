package week7;
import java.util.Scanner;
public class TestCompartment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Compartment[] compartments=new Compartment[10];
		for(int i=0;i<compartments.length;i++) {
			int random=(int)(Math.random()*4)+1;
			switch(random) {
			case 1:
				compartments[i]=new FirstClass();
				break;
			case 2:
				compartments[i]=new Ladies();
				break;
			case 3:
				compartments[i]=new General();
				break;
			case 4:
				compartments[i]=new Luggage();
				break;
			}
			System.out.println(compartments[i].notice());
		}

	}

}
