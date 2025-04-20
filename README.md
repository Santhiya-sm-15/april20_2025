# april20_2025
The problem that i solved today in leetcode

1.There is a forest with an unknown number of rabbits. We asked n rabbits "How many rabbits have the same color as you?" and collected the answers in an integer array answers where answers[i] is the answer of the ith rabbit.

Given the array answers, return the minimum number of rabbits that could be in the forest.

Code:
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
