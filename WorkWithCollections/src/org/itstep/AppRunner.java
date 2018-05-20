package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {

	public static void main(String[] args) {
		
		List<String> compliments = new ArrayList<>();
		
		compliments.add("Красивая");
		compliments.add("Умная");
		compliments.add("Бодрая");
		compliments.add("Веселая");
		compliments.add("Умничка");
		compliments.add("Скромная");
		compliments.add("Мечтательная");
		
//		for(int i=0; i<compliments.size(); i++) {
//			System.out.println("Я " + compliments.get(i));
//		}
		

		for(String compliment:compliments) {
			
			if (!compliment.equals("Мечтательная")) {
				System.out.println("Я " + compliment);
			}
			
		}
	}

}
