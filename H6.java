import java.util.*;
class H6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String temp="";
        int flag=0,ce=0;
        int a[]=new int[n];
        List<Integer> obj=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            obj.add(a[i]);
        }
        Set<Integer> obj1=new LinkedHashSet<Integer>(obj);
        for(Integer i:obj1)
        {
            flag=Collections.frequency(obj,i);
            if(flag>1)
            {
            ce=1;
            temp=temp+(i+" ");
            }
        }
        if(ce!=0)
        System.out.print(temp.charAt(0));
        else
        System.out.print("unique");
    }
}

