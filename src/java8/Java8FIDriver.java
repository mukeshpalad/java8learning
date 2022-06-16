package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FIDriver {

	public static void main(String[] args)
	{
		
		// call using lambda expression and FI
		LabdaFunctionalInterface fi2 = () -> System.out.println("lambda FI call");
		fi2.method();
		
		
		FIAddTwoNumber fiAdd = (a,b) -> 
		{
			System.out.println(a+b);
			return a+b;
		};
		
		
		
		// gind greater of two number
		// fiAdd.add(10, 20);
		
		fiAdd = (a,b) -> 
		{
			if(a>b) return a;
			else return b;
		};
		int x = fiAdd.add(40, 20);
		System.out.println(x);
		
		
		// example of default & Static methods
		
		 TestDefaultMethod m1 = new ClassDefaultMethod();
		    m1.defaultMethod();
		    TestDefaultMethod.staticMethod();
		    
		   
		 // Predicate learning   
		 Predicate<Integer> p1 = a->(a>50); 
		 System.out.println(p1.test(30));
		 
		 // joining two predicates
		 Predicate<Integer> p2 = a -> (a%2==0);
		 System.out.println (p1.and(p2).test(60));
		 
		//Funciton learning
		 Function<String, Integer> f1 = a->a.length();
		 System.out.println(f1.apply("India"));
		 
		 
		 
		 //Stream API
		 List<Product> productsList = new ArrayList<Product>();  
		 
		//Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
		
		 List<Float> productPriceList = productsList.stream()
				 .filter(p->p.price>25000)
				 .map(p->p.price)
				 .collect
				 (Collectors.toList());
		 
		 System.out.println(productPriceList);
		 System.out.println(productPriceList.stream().count());
		 System.out.println(productPriceList.stream()
				 .min((c1,c2)-> c1.compareTo(c2)).get());
		 
		 System.out.println(productPriceList.stream().anyMatch(p->p==28000));
		 
		
	}
	
	
	
}
