package com.camila.calcu;
import java.util.Objects;

public class Calculadora {

	private double operacionUno= 10.5;
	private double operacionDos= 5.2;
    private char operation;
    private double result;
	
	
/*    public Calculadora(double operacionUno, double operacionDos, double result, char operacion){
    	this.operacionUno = 10.5;
    	this.operacionDos = 5.2;
    	
    	}*/
    
    
    //Metodos 
    
    public void performOperation() {
    	if(operation =='+') {
    		result = operacionUno + operacionDos;
    		
    	}else if(operation =='-'){
    	       result = operacionUno - operacionDos;
    } else  {
    	System.out.println("operacion invalida");
    }
    }
   
    //constructor
    
	public Calculadora() {
	
	}





	//getters y setters
	public double getOperacionUno() {
		return operacionUno;
	}




	public void setOperacionUno(double operacionUno) {
		this.operacionUno = operacionUno;
	}




	public double getOperacionDos() {
		return operacionDos;
	}




	public void setOperacionDos(double operacionDos) {
		this.operacionDos = operacionDos;
	}




	public char getOperation() {
		return operation;
	}




	public void setOperation(char operation) {
		this.operation = operation;
	}




	public double getResult() {
		return result;
	}




	public void setResult(double result) {
		this.result = result;
	}

}
