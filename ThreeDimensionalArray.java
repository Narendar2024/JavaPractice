public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int nums[][][]= new int[3][4][5];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<5; k++){
                    nums[i][j][k] = (int)(Math.random()*10);
                    System.out.print(nums[i][j][k]+"    ");
                    
                }
                System.out.println();
            }
        }

        System.err.println();
        System.err.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<5; k++){
                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.println();
            }
        }

        for(int array2D[][]:nums){
            for(int array1D[]:array2D){
                for(int value:array1D){
                    System.out.print(value+"    ");
                }
                System.out.println();
            }
        }
    }
}
