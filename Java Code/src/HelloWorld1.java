public class HelloWorld1
{
	static String  randomString = "String to print";
	static final double PINUM = 3.141429;
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		System.out.println(randomString);
		System.out.println(PINUM);
		
		int integerOne = 22;
		int integerTwo = integerOne + 1;
		System.out.println(integerTwo);
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt= 2100000000;
		long bigLong =9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.14;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65;
		char anotherChar = 'A';
		char escapedChars = '\t';
		
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		String andAnotherString = randomString + ' ' + anotherString;
		
		String byteString = Byte.toString(bigByte);
		System.out.println(andAnotherString);
		
		System.out.println(randomChar);
	}
}