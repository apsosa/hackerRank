
class ValleyHR {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int valleys = 0;
        int[] levels = new int[steps];
        if(path.charAt(0) == 'U'){
            levels[0] = 1;
        }else{
            levels[0] = -1;
        }
        
        //record sea level in every step
        for(int i= 1;i < steps;i++){
            if(path.charAt(i) == 'U'){
                levels[i] = levels[i-1]+1;
            }else{
                levels[i] = levels[i-1]-1;
            }
        }
        int index = 0;
        boolean finded = false;
        //find de first start of a valley
        while(true){
            index = path.indexOf('D',index);
            if(index == -1){
                break;
            }
            System.out.println(index);
            if(levels[index] == 0){
                finded = true;
                break;
            }
            index++;
        }
        
        if(finded){
            index++;
            while(index < steps){
                if(levels[index]== 0){
                    valleys++;
                }
                index++;
            }
            return valleys;
        }else{
            return valleys;
        }

    }

    public static void main(String[] args){
      
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int result = countingValleys(steps, path);
        System.out.println(result);
    }

}

