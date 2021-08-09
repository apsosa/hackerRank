
class ValleyHR {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    private static int findStart(int index,String path, int[] levels){
        while(true){
            index = path.indexOf('D',index);
            if(index == -1){
                return index;
            }
            // System.out.println(index);
            if(levels[index] == -1){
                return index;
            }
            index++;
        }
    }
    private static int findEnd(int index,int steps, int[] levels){
        index++;
        while(index < steps){
            if(levels[index]== 0){
                return index;
            }
            index++;
        }
        return -1;
    }

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
        for (int i : levels) {
            System.out.print(i);
            System.out.print(",");
        }
        int index = 0;
        boolean finded = false;
        //find de first start of a valley
        
        while(true){
            index = findStart(index,path,levels);
            if(index == -1){
                return valleys;
            }
            index = findEnd(index, steps, levels);
            if(index == -1){
                return valleys;
            }
            valleys++;
            index++;
        }

    }

    public static void main(String[] args){
      
        int steps = 12;
        String path = "UDDDUDUU";
        String path1 = "DDUUDDUDUUUD";

        //  D  D  U U  D  D  U  D U  U U D
        // -1,-2,-1,0,-1,-2,-1,-2,-1,0,1,0,                 
        int result = countingValleys(steps, path1);
        System.out.println(result);
    }

}

