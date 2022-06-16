package java8;

public interface TestDefaultMethod {
	
	public default void defaultMethod()
	{
		System.out.println("Calling default method");
	}
	
	public static void staticMethod()
	{
		System.out.println("Calling static method");
	}

}
