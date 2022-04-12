package listBasicExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList catNameList=new ArrayList();
		catNameList.add("¼Ò¹Ì");
		catNameList.add("¼¼¹Ì");
		catNameList.add("¼ö¹Ì");
		
		//length¿Í ´Ù¸¥ size()¸¦ »ç¿ë
		System.out.println(catNameList);
		for(int i=0;i<catNameList.size();i++) {
			//catNameList.get(0);
			//catNameList.get(1);
			System.out.println(catNameList.get(i));
		}
		
		System.out.println("====================");
		
		ArrayList dogNameList=new ArrayList();
		dogNameList.add("µÎÄ¡");
		dogNameList.add("»Ñ²Ù");
		dogNameList.add("¶¯±¸");
		dogNameList.add("ÈòµÕÀÌ");
		
		System.out.println(dogNameList);
		for(int i=0;i<dogNameList.size();i++) {
			System.out.println(dogNameList.get(i));
		}
		System.out.println("===================");
		dogNameList.remove(1);
		System.out.println(dogNameList);
		for(int i=0;i<dogNameList.size();i++) {
			System.out.println(dogNameList.get(i));
		}
	}

}
