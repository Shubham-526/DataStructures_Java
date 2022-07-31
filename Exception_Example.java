import java.io.*;


public class Exception_Example{
	
 public int[] arr = new int[10];
 
 
public void writeList(){
	
	try{
		arr[10]=11;
		
		}
	
	catch(NumberFormatException | IndexOutOfBoundsException e1){
		
		System.out.println("NumberFormatException =>" +e1.getMessage());
		
	}
	
}


public static void main(String[] args){
	
	writeList();
	
}
}