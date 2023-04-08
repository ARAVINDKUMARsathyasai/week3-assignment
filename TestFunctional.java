package day12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


@FunctionalInterface
interface CalculatePer{
	void cal(float sal1,float sal2);
}

public class TestFunctional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of the two diferent candidates fo rthe comaprission ");
		float sal = sc.nextFloat();
		float sal2 = sc.nextFloat();
		CalculatePer per = (sa1,sa2) ->{
			List<Float> sal1 = new ArrayList();
			List<Float> inc1 = new ArrayList();
			List<Float> comp1 = new ArrayList();
			
			List<Float> sa = new ArrayList();
			List<Float> inc2 = new ArrayList();
			List<Float> comp2 = new ArrayList();
			
			List<Float> diff = new ArrayList();
			
			float s1 = sa1;
			float s2 = sa2;
			float in1;
			float in2;
			float total1;
			float total2;
			float dif;
			
			for(int i =0;i<6;i++) {
				sal1.add(s1);
				sa.add(s2);
							
				in1 = 0.4f*s1;
				inc1.add(in1);
				
				in2 = 0.4f*s2;
				inc2.add(in2);
				
				total1 = s1 +in1;
				total2 = s2+in2;
				
				comp1.add(total1);
				comp2.add(total2);
				
				dif = total1-total2;
				diff.add(dif);
				
				s1= total1;
				s2 = total2;
			}
			System.out.println("Salary 1\tIncrement\tTotal\t\tSalary 2\\t\tIncrement\\t\tTotal\\t\tDifference");
			for(int i =0 ;i<sal1.size();i++) {
				System.out.println(sal1.get(i)+"\t"+inc1.get(i)+"\t"+comp1.get(i)+"\t"+sa.get(i)+"\t"+inc2.get(i)+"\t"+comp2.get(i)+"\t"+diff.get(i));
			}
			
		};
		
		per.cal(sal, sal2);
	}
}
