package Tuan_1;

import java.util.ArrayList;

public class lab_4 extends Product {

	public static void main(String[] args) {
		
		//Tạo sản phẩm với 3 kiểu hàm dựng
		/*
		Product product1 = new Product();
		product1.input();
		product1.output();
		
		Product product2 = new Product("Product 2",200000);
		product2.output();
		
		Product product3 = new Product("Product 3",300000,3000);
		product3.output();
		*/
		
		
		//Nhập mảng sử dụng array list
		/*
		ArrayList<Product> productArray = new ArrayList<>();
		productArray.add(product1);
		productArray.add(product2);
		productArray.add(product3);
		
		for(Product product: productArray)
		{
			System.out.println("Product name: " + product.getProductName() +"\nUnit price: " + product.getUnitPrice() +"\nReduced price: " + product.getReducedPrice());
		}*/

		//Nhập xuất mảng sản phẩm
		Product product = new Product();
		product.inputArrayProduct();
	}
}