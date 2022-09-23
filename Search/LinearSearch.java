package Array.Search;

import java.util.Scanner;

public class LinearSearch {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int total= input.nextInt();
            int[] array=new int[total];
            for(int i=0;i< array.length;i++){
                array[i]=input.nextInt();
            }
            int target=input.nextInt();
            System.out.println(search(array,target));
        }

        public static int search(int[] array,int target) {
            for(int i=0;i< array.length;i++){
                if(array[i]==target){
                    return i;
                }
            }
            return -1;//if search value does not exit it will return -1 and output
        }
    }

