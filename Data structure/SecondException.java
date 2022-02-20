
public class SecondException{

	public static void main(String[] args) {
	try
	{
		String str= " Welcome ";
		str.charAt(11);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String Index Out Of Bounds Exception");
	}

	}

}