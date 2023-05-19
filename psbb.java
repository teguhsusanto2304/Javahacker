import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList
{

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numElements = 0;
        int numQueries = 0;
        if(sc.hasNextLine()){
         numElements = Integer.parseInt(sc.nextLine());
        } 
        
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0;i < numElements;i++){
            numList.add(sc.nextInt());
        }
        if(sc.hasNextInt()){
            numQueries = sc.nextInt();
        }
        if(sc.hasNextLine()){
            sc.nextLine();
        }
        for(int i = 0;i < numQueries;i++){
            String queryType = sc.nextLine();
            if(queryType.equals("Insert")){
                String[] queryArray = sc.nextLine().split(" ");
                numList.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
            }else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                numList.remove(removeIndex);
            }  
        }
        for(Integer num : numList){
            System.out.print(num+" ");
        }
    }
}