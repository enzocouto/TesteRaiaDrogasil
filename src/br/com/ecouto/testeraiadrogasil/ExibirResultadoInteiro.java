package br.com.ecouto.testeraiadrogasil;

import java.util.stream.IntStream;

public class ExibirResultadoInteiro {

	public static void main(String[] args) {
		
		int arrayNumber[] = {1,2,5,8,9};
		
		for (int i = 0; i < arrayNumber.length;i++) {
			System.out.println("Array na posição ["+ i+ "] = "+arrayNumber[i]);
		}
		
		System.out.println("");
		
		//Com Java 8 utilizando lambda
		IntStream.range(0, arrayNumber.length)
		  .forEach(idx ->
		  System.out.println("Array na posição ["+ idx + "] = "+arrayNumber[idx]));
		  
	}
}
