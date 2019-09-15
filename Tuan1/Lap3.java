package Tuan_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class lab_3 extends Student {
	public static Scanner sr = new Scanner(System.in);
	public static int[] array ;
	//Kiểm tra số nguyên tố
	public static boolean isPrimeNumbers(int number)
	{
		if (number <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(number); i++) {
	           if (number % i == 0) {
	               return false;
	           }
	       }
	       return true;
	}
	
	//Xuất bảng cửu chương từ 2 -> 9
	public static void outputMultiplicationTables()
	{
		for(int i = 2;i<10;i++)
		{
			System.out.println("Multiplication Tables " + i);
			for(int j = 1;j<=10;j++)
			{
				
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
	}
	
	//Nhập mảng
	public static void inputArray()
	{	
		System.out.print("Enter the number of elements: ");
		int numberOfElements = sr.nextInt();
		
			array = new int[numberOfElements];
		for(int i = 0;i<numberOfElements;i++)
		{
			System.out.print("Element " + i +": ");
			array[i] = sr.nextInt();
		}
		
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println("\t" + array[i]);
//		}
		
	}
	
	//Xuất mảng
	public static void outputArray(int array[])
	{
		System.out.println("Array: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("\t" + array[i]);
		}
	}
	
	//Tìm số bé nhất trong mảng
	public static int findMinElements(int array[])
	{
		int min = array[0];
		for(int i=1;i<array.length;i++)
		{
			min = Math.min(min, array[i]);
		}
		return min;
	}
	
	//Tính trung bình các số chia hết cho 3 trong mảng
	public static double calculateTheAverageOfDivBy3(int array[])
	{
		double total = 0;
		double flag = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i] % 3 ==0)
			{
				total += array[i]; 
				flag++;
			}
		}
		return total/flag;
	}
	
	//Nhập xuất 2 mảng họ tên và điểm, sắp xếp theo điểm tăng dần
	public static void inputAndOutputArrayStudent2()
	{
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sr.nextInt();
		String[] studentName = new String[numberOfStudents];
		float[] studentScore = new float[numberOfStudents];
		
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.print("Student name: ");
			sr = new Scanner(System.in);
			studentName[i] = sr.nextLine();
			
			System.out.print("Student score: ");
			studentScore[i] = sr.nextFloat();
		}
		
		for(int i = 0;i<numberOfStudents-1;i++)
		{
			for(int j = i+1;j<numberOfStudents;j++)
			{
				if(studentScore[i]>studentScore[j])
				{
					float tempScore = studentScore[i];
					studentScore[i] = studentScore[j];
					studentScore[j] = tempScore;
					
					String tempName = studentName[i];
					studentName[i] = studentName[j];
					studentName[j] = tempName;
				}
			}
		}
		
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.println("Student " + (i+1));
			if(studentScore[i]>=9)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i] +"\nAcademic evaluation: EXCELLENT");
			}
			else if(studentScore[i] <9 && studentScore[i] >=7.5)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: VERY GOOD");
			}
			else if(studentScore[i] <7.5 && studentScore[i] >=6.5)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: GOOD");
			}
			else if(studentScore[i] <6.5 && studentScore[i] >=5)
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: AVERAGE GOOD");
			}
			else
			{
				System.out.println("Student name: " + studentName[i] +"\nStudent score: " + studentScore[i]+"\nAcademic evaluation: ORDINARY");
			}
		}
	}
	public static void main(String[] args) {
		/*//Nhập và kiểm tra số nguyên tố
		System.out.println("Enter the number check prime: ");
		int number = sr.nextInt();
		 if(isPrimeNumbers(number) == true)
		 {
			 System.out.println("The number is prime");
		 }
		 else
		 {
			 System.out.println("The number is not prime");
		 }*/
		
		
		/*//Nhập mảng tìm số bé nhất và tính trung bình số chi hết cho 3 trong mảng
		inputArray();
		Arrays.sort(array);
		outputArray(array);
		System.out.println("Min number: "+findMinElements(array));
		System.out.println("Total: " + calculateTheAverageOfDivBy3(array));*/
		
		
		//Xuất bảng cửu chương 2->9
		//outputMultiplicationTables();
		
		//Nhập xuất mảng sinh viên với đối tượng
		//Student student = new Student();
		//student.inputArrayStudent();
		
		//Nhập xuất sinh viên với 2 mảng tên và điểm
		inputAndOutputArrayStudent2();
	}
}