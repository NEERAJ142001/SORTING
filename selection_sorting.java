package love_babbar;

public class lb_16_selection_sorting {
    /*
    it selects one and compare with all and swap if it finds greater number
    time complexity  worst and best O(n^2)
    space complexity O(1)
    not a stable algorithms
    inplace sort
    */

    private void sort(int arr[], int size)
    {
        int temp;

        // size=8 0 to 7
        for(int i=0;i<size-1;i++)
        {

          int min=arr[i];
          // j iterates for i+1 to 8
          for(int j=i+1;j<size;j++)
          {
              if(min > arr[j])
              {
                  min = arr[j];

                  //swap
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
        }
    }
    private void print(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        lb_16_selection_sorting m=new lb_16_selection_sorting();
        int arr[]={8,5,7,16,0,56,22,53};
        m.sort(arr,8);
        m.print(arr,8);
    }
}
