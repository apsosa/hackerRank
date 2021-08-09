class RepeatedString{
    /*
    * Complete the 'repeatedString' function below.
    *
    * The function is expected to return a LONG_INTEGER.
    * The function accepts following parameters:
    *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        int index = 0;
        long i = 0;
        long counter = 0;
        if(s.equals("a")){
            return n;
        }
        while(i < n){
            if(s.charAt(index) == 'a'){
                counter++;
            }
            i++;
            index++;
            if(index == s.length()){
                index = 0;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        String s = "agga";
        long n = 10000000000L;            
        long result = repeatedString(s,n);
        System.out.println(result);
    }

}