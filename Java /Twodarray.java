class Twodarray {
    public static void main(String args[]){
        int nums[][] = new int[3][4];
        // return random value with Math.random

        for( int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }
        // default[i][j] j holds 0 values
        for( int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " " );
                // will print zeros
                // add space
            }
            System.out.println();
            //add new line
        }
        System.out.println("new line");
        //enhanced for loop
        for(int n[]: nums) {
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}