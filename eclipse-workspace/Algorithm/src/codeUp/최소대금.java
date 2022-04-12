package codeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int second=sc.nextInt();
		int third=sc.nextInt();
		int fourth=sc.nextInt();
		int fifth=sc.nextInt();
		ArrayList<Integer> pastaList=new ArrayList();
		pastaList.add(first); pastaList.add(second); pastaList.add(third);
		ArrayList<Integer> juiceList=new ArrayList();
		juiceList.add(fourth); juiceList.add(fifth);
		Integer setPasta=0;
		Integer setJuice=0;
		Integer sum;
		float answer;
		for(int i=0;i<pastaList.size();i++) {
			if(setPasta>pastaList.get(i) || setPasta==0) {
				setPasta=pastaList.get(i);
			}
		}
		for(int i=0; i<juiceList.size();i++) {
			if(setJuice>juiceList.get(i) || setJuice==0) {
				setJuice=juiceList.get(i);
			}
		}
		sum=setPasta+setJuice;
		answer=(float) (sum*1.1);
		System.out.println(answer);
		sc.close();
	}

}
