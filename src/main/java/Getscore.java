import java.util.Scanner;

public class Getscore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of students");
        int size = scanner.nextInt();
        int []array = new int[size];
        for (int i =0;i<array.length;i++){
            System.out.println("Enter student grades  ");
            array[i] = scanner.nextInt();
        }
        int cout = 0;
        for (int i =0;i<array.length;i++){
            if (array[i]>= 5){
                cout++;
            }
        }
        System.out.println("number of students passing : "+ cout);

    }
}
