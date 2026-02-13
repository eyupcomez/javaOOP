import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Methods {
    private List<Integer> numbers = new ArrayList<>();


    boolean exists = false;


    public void createList(){

        Scanner inputLength = new Scanner(System.in);
        System.out.println("Provide length of the list: ");
        int length = inputLength.nextInt();

        for(int i=0; i<length;  i++ ){
            Scanner elements = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int element = elements.nextInt();
            numbers.add(element);
            System.out.println("Added new element: " +element );
        }
        System.out.println(numbers);
    }

    public void findNumber(){
        Scanner findNumber = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int number = findNumber.nextInt();
        for(int num:numbers){
            if(num==number){
                exists=true;

            }
        }
        if(exists){
            System.out.println("Sayı mevcuttur");
        }else{
            System.out.println("Sayı mevcut değildir");
        }



    }
}
