class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:answers)
            m.put(x,m.getOrDefault(x,0)+1);
        int res=0;
        for(Map.Entry<Integer,Integer> x:m.entrySet())
        {
            if(x.getKey()==0)
                res+=x.getValue();
            else
            {
                int key=x.getKey();
                int val=x.getValue();
                int cnt=0;
                while(val>0)
                {
                    val-=key+1;
                    cnt++;
                }
                res+=(cnt*(key+1));
            }
        }
        return res;
    }
}