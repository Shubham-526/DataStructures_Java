import java.util.*;

class RemoveDuplicatesFromSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = removeDuplicatesFromSortedArrayII(n, arr);

        System.out.println(res);

        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");

    }

    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {
            int i =0;
            int j=0;
            int numCount =0;
            while(j<n){
                if(arr[i]==arr[j]){
                    if(numCount <2){
                        if(j>i){
                            int temp = arr[i+1];
                            arr[++i] = arr[j];
                            arr[j]=temp;
                        }
                    }
                    numCount ++;
                 
                }else{
                        int temp = arr[i+1];
                        arr[++i] = arr[j];
                        arr[j] = temp;
                        numCount=1;   
                }
                 j++; 
            }
            return i+1;
        }
    }
