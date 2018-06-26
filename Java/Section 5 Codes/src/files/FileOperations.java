package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author ahmed hamdy
 *
 */
public class FileOperations {
	public static void main(String[] args)
	{
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = input.next();
		
		System.out.println(s + " is " + (isPalindrome(s)? "Palindrome": "not Palindrome"));
		input.close();
		//*/
		
		String fileName = "words.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(s -> System.out.println(s + " is " 
					+ (isPalindrome(s)? "Palindrome": "not Palindrome")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// another way using java 7 will be covered in the lab (shapes.txt)
	}
	
	static boolean isPalindrome(String s)
	{
		char[] ar = s.toCharArray();
		for (int i = 0; i < ar.length / 2; i++)
		{
			if (ar[i] != ar[ar.length - i - 1])
			{
				return false;
			}
		}
		return true;
	}
}
