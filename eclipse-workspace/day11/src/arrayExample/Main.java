package arrayExample;

public class Main {

	public static void main(String[] args) {
		//1 배열값 할당하는 법
		
		//1-1 배열 공간만 할당
		Integer [] testArray=new Integer[5];
		for(Integer i=0; i<testArray.length;i++) {
			System.out.println("testArray의 안에는 "+testArray[i]);
		}
		System.out.println("================");
		
		//1-2 공간+값까지 할당
		Integer[] testArray2=new Integer[] {1,2,3,4,5};
		
		for(Integer j=0;j<testArray2.length;j++) {
			System.out.println("testArray2의 안에는? ->"+testArray2[j]);
		}
		System.out.println("=============");
		
	}

}
