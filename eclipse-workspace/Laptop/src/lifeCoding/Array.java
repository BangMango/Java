package lifeCoding;

public class Array {
	
	public static void main(String[] args) {
		ArrayReview[] ar=new ArrayReview[5];
		for(int i=0;i<ar.length;i++) {
			ar[i]=new ArrayReview("id"+i,"pw"+i,"name"+i,i);
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i].id+" "+ar[i].pw+" "+ar[i].name+" "+ar[i].num);
			System.out.println();
		}
		
		
		
		
		
		
		
		String [] starting = {"파이리","꼬부기","이상해씨"};
		String [] rev1 = new String[3];
		rev1[0]="리자드"; rev1[1]="어니부기"; rev1[2]="이상해풀";
		String [] rev2= new String[3];
		for(int i=0; i<3; i++) {
			if(i==0) {
				rev2[0]="리자몽";
			}else if(i==1) {
				rev2[1]="거북왕";
			}else {
				rev2[2]="이상해꽃";
			}
		}
		System.out.println("초기 진화체");
		System.out.print(starting[0]+","); System.out.print(starting[1]+","); System.out.print(starting[2]);
		System.out.println();
		System.out.println("중간 진화체");
		for(int i=0;i<3;i++) {
			if(i<2) {
				System.out.print(rev1[i]+",");
			}else {
				System.out.print(rev1[i]);
			}
		}
		System.out.println();
		System.out.println("최종 진화체");
		for(String x:rev2) {
			if(x!="이상해꽃") {
				System.out.print(x+",");
			}else {
				System.out.print(x);
			}
		}
	}

}
