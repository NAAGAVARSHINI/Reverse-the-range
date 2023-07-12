import java.util.Scanner;

public class ReverseTheRange {

    public static int[] Reverse(int array[], int b, int c){
        int size = array.length;
        int i= b;
        int j=c;
        while(i<j){
            int temp = array[i];
            array[i]= array[j];
            array[j]= temp;
            i++;
            j--;

        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int b= sc.nextInt();
        int c= sc.nextInt();

        array= Reverse(array, b,c);
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }

    }
}
