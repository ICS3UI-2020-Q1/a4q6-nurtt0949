import java.util.Scanner;
/**
 *Prime or not prime checker
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for which number to checker
    System.out.println("Which number would you like to check?");
    
    //declare a variable
    int userNum = input.nextInt();
    //declare a variable that counts
    int count = 0;
    int total = 0;
    do{
      count = count + 1;
      if(userNum % count == 0){
         total = total + 1;
        System.out.println(count);

      }
    }while(count < userNum);
      //determine if its prime or not prime
      if(total > 2){
        System.out.println(userNum + " is not a prime number");
      }else if(total < 2){
        System.out.println(userNum + " is a prime number");
      }
  }
}

    
  
    
  



    
  
    
  

