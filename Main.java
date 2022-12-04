package pack1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
		System.out.println("(Not: Çıkış için  0 ) Yaşınız: ");
		int yas = input.nextInt();
		
		if (yas == 0) {
			break;
		} else if (yas >= 18) {
			System.out.println("Yaşın "+ yas + " Olduğundan Dolayı Ehliyet Alabilirsin!");
		}else {
			System.out.println("Yaşın "+ yas + " Olduğundan Dolayı Ehliyet Alamazsın!");
		}
		
		}
		
	}
}