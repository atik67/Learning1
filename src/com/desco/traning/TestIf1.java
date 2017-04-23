package com.desco.traning;

import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class TestIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		} else {
			if (b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
			
		}

	}

}

/*
 * 
 * Scanner input=new Scanner(System.in); int a = input.nextInt(); switch (a) {
 * case 1: System.out.println("1"); break;
 * 
 * case 2: System.out.println("2"); break;
 * 
 * case 3: System.out.println("3"); break;
 * 
 * default: break; } } }
 */
