/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 13.
 * @author :ckan
 * @file   :GuguDanEx1.java
 * @story  :
 */
public class GuguDanEx1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		System.out.println("----------------------");
		for (int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++){
				System.out.print(dan+" * "+i+" = "+(dan*i));
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
