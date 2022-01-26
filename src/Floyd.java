public class Floyd {

    private int[][] matrix;

    public Floyd(int[][] adjecencyMatrix){
        int length = adjecencyMatrix.length;
        matrix = new int[length][];
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                matrix[i][j] = adjecencyMatrix[i][j];
            }
        }
    }


    public void updateDistances(){
        for(int k=0; k<matrix.length; k++){
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix.length; j++){
                    int twoVerticles = matrix[i][k]+matrix[k][j];
                    if(twoVerticles < matrix[i][j]){
                        matrix[i][j] = twoVerticles;
                    }
                }
            }
        }
    }


    public void print(){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
