package Array.Search;

import java.util.Scanner;

public class BinarySearch {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the total length of Array:");
            int totalarray=input.nextInt();
            System.out.println("Enter the Array: " );
            int[] array=new int[totalarray];
            for(int i=0;i<array.length;i++){
                array[i]= input.nextInt();
            }
            System.out.println("Enter the target element:");
            int target=input.nextInt();

            if(array[0]<array[array.length-1]){ //if start element is less than end its ascending order else desecending so else part will be played
                System.out.println(ascsearch(array,target));
            }
            else{
                System.out.println(dscsearch(array,target));
            }
        }
        public static int ascsearch(int[] array,int target){
            int start=array[0];
            int end=array.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(array[mid]==target){
                    return mid;
                }
                if (array[mid] < target) {
                    start = mid + 1;
                } else if (array[mid] > target) {
                    end = mid - 1;
                }
            }
            return -1;    //If target is not found then return -1

        }
        //
        public static int dscsearch(int[] array,int target){
            int start=0;
            int end= array.length-1;
            while (start<end){
                int middle=(start+end);
                if(array[middle]>target){
                    start=middle+1;
                } else if (array[middle]<target) {
                    end=middle-1;
                }
                else {
                    return middle;
                }
            }return -1;     //If target is not found then return -1
        }}

