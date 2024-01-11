package app;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario{
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o seu salário atual: R$ ");
        double salario = sc.nextDouble();
        
        int percentual = calcularPercentual(salario);
        double reajuste = calcularReajuste(salario);
        double novoSalario = calcularNovoSalario(salario);
        
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
        
        sc.close();
    }
    
    public static int calcularPercentual(double salario) {
    	if(salario <= 400.00){
    		return 15;
        }
        else if(salario <= 800.00){
        	return 12;
        }
        else if(salario <= 1200.00){
        	return 10;
        }
        else if(salario <= 2000.00){
        	return 7;
        }
        else{
            return 4;
        }
    }
    
    public static double calcularReajuste(double salario) {
    	return salario * (calcularPercentual(salario)/100.0);
    }
    
    public static double calcularNovoSalario(double salario) {
    	return salario + calcularReajuste(salario);
    }
    
}
