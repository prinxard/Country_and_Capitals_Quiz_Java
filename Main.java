import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        int i = 0;
        int score = 0;
        int point = 0;
        String path = "african_countries.csv";
        String line = "";
        String myArray[][] = new String[55][55];
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null && (i < 55)){
                String[] values = line.split(",");
                myArray[i] = values;
                i++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        
        // for (int a = 0; a < 55; a++) {
            // Collections.shuffle(Arrays.asList(myArray));
            // myArray[a][1] = myArray[a][1].toLowerCase().trim();
            // if(myArray[a][1].contains("*")){
            //     myArray[a][1] = myArray[a][1].replace("*", ",").toLowerCase();
            //    for (String strings : myArray[1]) {
            //        strings.strip();
            // //    }
                // String v = "";
                // v = myArray[a][1];
                // String[] val = v.split(",");
                // myArray[a][1] = Arrays.toString(val);
            // } else {
                
                // String v = "";
                
            // }
            
        // }
       
        while (counter < 11) {
            Collections.shuffle(Arrays.asList(myArray));
            System.out.println("("+counter+")"+" "+"What is the capital of " + myArray[counter][0]);
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String Answer = myObj.nextLine(); // Read user input
            Answer = Answer.toLowerCase().strip();
            if(Answer.contains(myArray[counter][1].toLowerCase().strip())){ //|| Answer.contains((myArray[counter][1]).replace("*", ",").strip().toLowerCase())){
                System.out.println(Answer + " is correct!");
                score+=1;
                point+=5;
            } else {
            System.out.println(Answer + " is Wrong! Correct answer is " + (myArray[counter][1]).replace("*", ",").strip());
                
            }
            counter++;
            
        }
        System.out.println("You answerd " + score + " correctly!");
        System.out.println("You scored " + point + " points");
    }
}