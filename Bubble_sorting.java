package love_babbar;

public class lb_17_bubble_sorting {
    /*
    in bubble sorting,it compares with next number and swap it
    in every round it set the highest number it the right size of array one by one(last)
    time complexity  worst=O(n^2) and best =O(n)
    space complexity O(1)
    stable algorithms
    inplace sorting= used constant space for sorting
    */

    private void bubble(int arr[],int size) {
        int temp;

        //size=9 0 to 8
        for (int i = 0; i < size - 1; i++){// 1 to size
            boolean swap=false;
            // 0 to 8 because jis comparison with j+1;
            for (int j = 0; j < size-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 1st round set the highest value on the right size ,goes on
                    swap=true;
                }
            }
            if(swap==false)
                break;
        }
    }
        private void print(int arr[],int size)
        {
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+ " ");
            }
        }

    public static void main(String[] args) {
        lb_17_bubble_sorting m=new lb_17_bubble_sorting();
        int arr[]={5,10,15,20,25,30,35,45,50};
        m.bubble(arr,9);
        m.print(arr,9);

    }

}
