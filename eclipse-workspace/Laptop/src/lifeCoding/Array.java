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
		
		
		
		
		
		
		
		String [] starting = {"���̸�","���α�","�̻��ؾ�"};
		String [] rev1 = new String[3];
		rev1[0]="���ڵ�"; rev1[1]="��Ϻα�"; rev1[2]="�̻���Ǯ";
		String [] rev2= new String[3];
		for(int i=0; i<3; i++) {
			if(i==0) {
				rev2[0]="���ڸ�";
			}else if(i==1) {
				rev2[1]="�źϿ�";
			}else {
				rev2[2]="�̻��ز�";
			}
		}
		System.out.println("�ʱ� ��ȭü");
		System.out.print(starting[0]+","); System.out.print(starting[1]+","); System.out.print(starting[2]);
		System.out.println();
		System.out.println("�߰� ��ȭü");
		for(int i=0;i<3;i++) {
			if(i<2) {
				System.out.print(rev1[i]+",");
			}else {
				System.out.print(rev1[i]);
			}
		}
		System.out.println();
		System.out.println("���� ��ȭü");
		for(String x:rev2) {
			if(x!="�̻��ز�") {
				System.out.print(x+",");
			}else {
				System.out.print(x);
			}
		}
	}

}
