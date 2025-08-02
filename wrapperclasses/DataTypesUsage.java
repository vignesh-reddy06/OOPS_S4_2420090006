package wrapperclasses;

public class DataTypesUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte byteVal = 127;
	        short shortVal = 32000;
	        int intVal = 100000;
	        long longVal = 10000000000L;
	        float floatVal = 5.75f;
	        double doubleVal = 19.99;
	        char charVal = 'A';
	        boolean boolVal = true;

	        String stringVal = "Hello, Java!";
	        int[] intArray = {1, 2, 3, 4, 5};
	        Integer integerObj = Integer.valueOf(100);
	        Double doubleObj = Double.valueOf(55.5);
	        StringBuilder sb = new StringBuilder("Builder");

	        System.out.println("byte: " + byteVal);
	        System.out.println("short: " + shortVal);
	        System.out.println("int: " + intVal);
	        System.out.println("long: " + longVal);
	        System.out.println("float: " + floatVal);
	        System.out.println("double: " + doubleVal);
	        System.out.println("char: " + charVal);
	        System.out.println("boolean: " + boolVal);

	        System.out.println("String: " + stringVal);
	        System.out.print("Array: ");
	        for (int num : intArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        System.out.println("Integer object: " + integerObj);
	        System.out.println("Double object: " + doubleObj);
	        System.out.println("StringBuilder: " + sb.toString());


	}

}
