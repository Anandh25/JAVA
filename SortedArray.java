import java.util.Scanner;

public class SortedArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        boolean flag=false;

        for(int k=0;k<arr.length;k++)
        {
                if(key==arr[k])
                {
                    flag=true;
                }

        }
        System.out.println(flag);
    }

}
