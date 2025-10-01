class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        String p="";
        int flag=0;
        ArrayList<String>al=new ArrayList<>();
        for(int i=0;i<list1.length;i++)
        {
            int t=Arrays.asList(list2).indexOf(list1[i]);
            if(t!=-1)
            {
               int sum=t+i;
               if(min>sum)
               {
                    min=sum;
               }
            }
        }
        System.out.print(min);
        for(int i=0;i<list1.length;i++)
        {
            int t=Arrays.asList(list2).indexOf(list1[i]);
            if(t!=-1)
            {
                int sum=t+i;
                if(sum==min)
                {
                    al.add(list1[i]);
                }
            }
        }
        String arr[]=new String[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}
