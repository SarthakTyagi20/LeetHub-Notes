class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int n = s.length();
        int i=0, sum=0;
        while(i<n){
            if(i<(n-1) && s.charAt(i)=='I' && s.charAt(i+1)=='V'){
                sum+=4;
                i+=2;
            }
            else if(i<(n-1) && s.charAt(i)=='I' && s.charAt(i+1)=='X'){
                sum+=9;
                i+=2;
            }
            else if(i<(n-1) && s.charAt(i)=='X' && s.charAt(i+1)=='L'){
                sum+=40;
                i+=2;
            }
            else if(i<(n-1) && s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                sum+=90;
                i+=2;
            }
            else if(i<(n-1) && s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                sum+=400;
                i+=2;
            }
            else if(i<(n-1) && s.charAt(i)=='C' && s.charAt(i+1)=='M'){
                sum+=900;
                i+=2;
            }
            else{
                sum+=map.get(s.charAt(i));
                i++;
            }
        }
        return sum;
    }
}