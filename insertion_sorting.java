package love_babbar;

public class lb_18_insertion_sorting {
    private void sorting(int arr[],int size)
    {
        for(int i=1;i<size;i++)
        //assume first element is sorted
        {   int j;
            int temp=arr[i];
            for(j=i-1;j>=0;j--)
            //it compares 0 to i-1 element
            {
                if( arr[j] > temp)
                    //
                    arr[j+1]=arr[j];
                else
                    break;
            }
            arr[j+1]=temp;
        }

    }
    private void print(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        lb_18_insertion_sorting m=new lb_18_insertion_sorting();
        int arr[]={6,61,454,46,65,53,1};
        m.sorting(arr,7);
        m.print(arr,7);
    }
}
