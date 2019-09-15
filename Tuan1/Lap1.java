package Tuan_1;

import java.util.Scanner;

public class lab_1 {
	public static Scanner sr = new Scanner(System.in);
	
	//Nhập họ tên sinh viên và điểm
	public static void bai1()
	{
		System.out.print("Name: ");
		String name = sr.nextLine();
		System.out.print("Score: ");
		double score = sr.nextDouble();
		System.out.println("Name: " + name + " Score: " + score);
	}
	
	//Tính chu vi diện tích và tìm cạnh nhỏ nhất của HCN
	public static void bai2()
	{
		System.out.print("Weight: ");
		double width = sr.nextDouble();
		System.out.print("Height: ");
		double height = sr.nextDouble();
		double p = (width+height)*2;
		double s = width*height;
		double minEdge = Math.min(width, height);
		
		System.out.println("P: " + p + "\nS: " + s+ "\nMin edge: " + minEdge);
	}
	
	//Tính thể tích khối lập phương
	public static void bai3()
	{
		System.out.print("Enter edge: ");
		double edge = sr.nextDouble();
		double volume = edge * edge * edge;
		System.out.println("Cube volume: " + volume);
	}

	//Giải phương trình bậc 2
	public static void bai4(float a, float b, float c)
	{
		//Kiểm tra các số
		if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has no solution!");
            } else {
                System.out.println("The equation has 1 solution: "
                        + "x = " + (-c / b));
            }
            return;
        }
        //Tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        //Tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("The equation has 2 solutions: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("The equation has a double solution: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("The equation has no solution!");
        }

	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		//bai1();
		//bai2();
		//bai3();
		bai4(1,-5,3);
	}
	
}