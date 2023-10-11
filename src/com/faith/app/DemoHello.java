package com.faith.app;

import java.util.Scanner;

public class DemoHello {

	public static void main(String[] args) {
		// TODaO Auto-generated method stub
		asfsafsfsafsfafafafasfasfffaScanner scan = new Scanner(System.in);
		System.out.println("Aleena");
		System.out.print("Alleena");
		System.out.println();
		String strOne = scan.nextLine();
		scan.close();
		System.out.println("the largest substring appears at both ends:" + atBothEnds(strOne));
		
	
		
	}

	private static String atBothEnds(String strOne) {
		// TODO Auto-generated method stub
		int length = strOne.length(), tempLength=0;
		String sameString=" ", temp=" ";
		for(int i=0;i<length;i++){
			temp+=strOne.charAt(i);
			tempLength = temp.length();
			if(i<length/2 && temp.equals(strOne.substring(length-tempLength,length))){
				sameString=temp;
			}
		}
		return sameString;
				
			}
	}

