package listBasicExample02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> incheonBusList=new ArrayList<Integer>();
		
		incheonBusList.add(522);
		incheonBusList.add(523);
		incheonBusList.add(16);
		incheonBusList.add(8);
		
		System.out.println(incheonBusList);
		System.out.println("==================");
		for(int i=0; i<incheonBusList.size();i++) {
			System.out.println(incheonBusList.get(i));
		}
		System.out.println("==================");
		
		ArrayList<Integer> seoulBusList=new ArrayList();
		seoulBusList.add(9408);
		seoulBusList.add(9409);
		seoulBusList.add(9701);
		seoulBusList.add(9711);
		System.out.println(seoulBusList);
		for(int i=0;i<seoulBusList.size();i++) {
			System.out.println(seoulBusList.get(i));
		}
	}

}
