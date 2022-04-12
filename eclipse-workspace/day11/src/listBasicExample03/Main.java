package listBasicExample03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cat streetCat=new Cat();
		streetCat.setType("RED");
		Cat streetCat2=new Cat();
		streetCat2.setType("YELLOW");
		Cat streetCat3=new Cat();
		streetCat3.setType("BLUE");
		
		
		ArrayList<Cat> catList=new ArrayList();
		
		catList.add(streetCat);
		catList.add(streetCat2);
		catList.add(streetCat3);
		System.out.println(catList);
		
		for(int i=0;i<catList.size();i++) {
			System.out.println(catList.get(i).getType());
		}
		
		catList.remove(0);
		
		System.out.println(catList);
		
		for(int i=0;i<catList.size();i++) {
			System.out.println(catList.get(i).getType());
		}
	}

}
