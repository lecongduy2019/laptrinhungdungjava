package Tuan_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
	public Scanner sr = new Scanner(System.in);
	private String productName;//Tên sản phẩm
	private double unitPrice;//Đơn giá
	private double reducedPrice;//giảm giá
	
	//Hàm dựng 3 tham số
	public Product(String productName, double unitPrice, double reducedPrice) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.reducedPrice = reducedPrice;
	}

	//Hàm dựng 2 tham số - sản phẩm không giảm giá
	public Product(String productName, double unitPrice) {
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	//Hàm dựng rỗng
	public Product() {

	}

	//Lấy tên sản phẩm
	public String getProductName() {
		return productName;
	}
	
	//Set tên sản phẩm
	public void setProductName(String productName) {
		this.productName = productName;
	}

	//Lấy đơn giá
	public double getUnitPrice() {
		return unitPrice;
	}

	//Set đơn giá
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	//Lấy giá giảm
	public double getReducedPrice() {
		return reducedPrice;
	}

	//Set giá giảm
	public void setReducedPrice(double reducedPrice) {
		this.reducedPrice = reducedPrice;
	}

	//Lấy thuế nhập
	private double getImportTax()
	{
		return this.unitPrice * 0.1;
	}
	
	//Nhập thông tin sản phẩm
	public void input()
	{
		System.out.print("Enter the product name: ");
		String productName = sr.nextLine();
		this.setProductName(productName);
		
		System.out.print("Enter the unit price: ");
		double unitPrice =  sr.nextDouble();
		this.setUnitPrice(unitPrice);
		
		System.out.print("Enter the reduced price: ");
		double reducedPrice =  sr.nextDouble();
		this.setReducedPrice(reducedPrice);
	}
	
	//Tạo và xuất mảng sản phẩm
	public void inputArrayProduct()
	{
		System.out.print("Enter the number of product: ");
		int numberOfProduct = sr.nextInt();
		Product[] productArray = new Product[numberOfProduct];
		
		for(int i=0;i<numberOfProduct;i++)
		{
			Product product = new Product();
			product.input();
			productArray[i] = product;
		}
		for(Product product: productArray)
		{
			System.out.println("Product name: " + product.getProductName() +"\nUnit price: " + product.getUnitPrice() +"\nReduced price: " + product.getReducedPrice() + "\nImport tax: " +product.getImportTax());
		}
	}
	
	//Xuất thông tin 1 sản phẩm
	public void output()
	{
		System.out.println("Product name: " + this.getProductName() +"\nUnit price: " + this.getUnitPrice() +"\nReduced price: " + this.getReducedPrice()+ "\nImport tax: " +this.getImportTax());
	}
	
	/*
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.input();
		product1.output();
		System.out.println(product1.getImportTax());
		
		Product product2 = new Product("Product 2",200000);
		product2.output();
		
		Product product3 = new Product("Product 3",300000,3000);
		product3.output();
		
		ArrayList<Product> productArray = new ArrayList<>();
		productArray.add(product1);
		productArray.add(product2);
		productArray.add(product3);
		
		for(Product product: productArray)
		{
			System.out.println("Product name: " + product.getProductName() +"\nUnit price: " + product.getUnitPrice() +"\nReduced price: " + product.getReducedPrice()+ "\nImport tax: " +product.getImportTax());
		}
		Product product = new Product();
		product.inputArrayProduct();
	}*/

}