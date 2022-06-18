package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.People;
import entities.Companies;
import entities.TaxesPayment;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc=new Scanner(System.in);
		
		List<TaxesPayment> list=new ArrayList<>();
		
		
		System.out.println("enter the number of tax payers: ");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.printf("tax payer #%d data: \n", i+1);
			
			System.out.println("individual or company (i/c)? ");
			char type=sc.next().charAt(0);
			
			System.out.println("name: ");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("anual income: ");
			Double income=sc.nextDouble();
			
			if(type=='i') {
				System.out.println("health expenses: ");
				double healthExpenses=sc.nextDouble();
				
				list.add(new People(name,income,healthExpenses));
			}
			else if (type=='c') {
				System.out.println("number of employees: ");
				int numberOfEmployees=sc.nextInt();
				
				list.add(new Companies(name,income,numberOfEmployees));
			}
			
			System.out.println();
			System.out.println("TAXES PAID: ");
			
			for (TaxesPayment taxes : list){
				System.out.println(taxes.getName() + ": $ " + String.format("%.2f", taxes.tax()));
			}
			
			System.out.println();
			
			double sum=0.0;
			
			for (TaxesPayment taxes : list) {
				sum+=taxes.tax();
			}
			System.out.printf("TOTAL TAXES: $%.2f\n", sum);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		

	}

}
