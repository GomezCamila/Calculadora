package com.camila.calcu;
import com.camila.calcu.Calculadora;

public class TestCalcu {

	public TestCalcu() {
		
	}

	public static void main(String[] args) {
		
		Calculadora calcu = new Calculadora();
	
		
		calcu.setOperacionUno(10.5);
		calcu.setOperation('+');
	
		calcu.setOperacionDos(5.2);
		
		calcu.performOperation();
		//double Result = calcu.getOperation();
		
		 double result = calcu.getResult();
	    //    System.out.println(result);
	
		
		System.out.println("El resultado es: "+ result);

		
		calcu.setOperacionUno(10.5);
		calcu.setOperation('-');
		calcu.setOperacionDos(5.2);
		
		calcu.performOperation();
		
		double total = calcu.getResult();
		
		System.out.println("El total es "+ total);
		
		calcu.setOperacionUno(10.5);
		calcu.setOperation('*');
		calcu.setOperacionDos(5.2);
		
		calcu.performOperation();
		
		
		
	}

}
