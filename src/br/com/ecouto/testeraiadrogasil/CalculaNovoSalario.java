package br.com.ecouto.testeraiadrogasil;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class CalculaNovoSalario {

	
	
	private final static BigDecimal vlSalario = BigDecimal.valueOf(1000.00);
	private final static Double reajuste = 10.0;
	private static NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	private static BigDecimal calcularNovoSalario() {
		
		return  vlSalario.add(vlSalario.multiply(BigDecimal.valueOf(reajuste/100)));
		
	}
	
	
	private static void imprimirNovoSalario(BigDecimal novoSalario) {
		
		//Se salário for par, imprimir salario com valor impar( exemplo sugere que devo acrescentar R$1 mas não especifica se considero decimais, vou considerar apenas inteiro);
		if(novoSalario.intValue() % 2 == 0) {
			novoSalario = novoSalario.add(BigDecimal.valueOf(1));
		}
		
		System.out.println("Novo salário: "+ nf.format(novoSalario));
	}
	
	
	
	public static void main(String[] args) {
		
		BigDecimal novoSalario = calcularNovoSalario();
		imprimirNovoSalario(novoSalario);
		
	}	
	
	
}
