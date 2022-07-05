class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int con=special[0]-bottom;
        int maxl=con, n = special.length;
        // if(special[0]==bottom){
        //     con=0;
        //     maxl=0;
        // }
        // System.out.println("start : "+con);
        for(int i=0; i<n-1; i++){
            con=special[i+1]-special[i]-1;
            // if(con==1)
            //     con=0;
            // System.out.println(i+" : "+con);
            maxl = Math.max(maxl, con);
        }
        con = top-(special[n-1]);
        // if(special[n-1]==top){
        //     con=0;
        //     // maxl=0;
        // }
        // System.out.println("end : "+con);
        maxl = Math.max(con, maxl);
        return maxl;
    }
}