package simple.datastructure;

public class SparseArray {
    public static void main(String[] args) {
        testSparseArray();
    }
    //稀松矩阵
    private static void testSparseArray() {
        //原来的矩阵
        int sparseArray1[][]= new int[11][11];
        sparseArray1[2][3]=1;
        sparseArray1[4][7]=9;
        sparseArray1[6][8]=6;
        System.out.println("原来的矩阵：");
        printArray(sparseArray1);

        //查找矩阵的不为0的元素的个数，创建对应的稀松矩阵
        int count=0;
        for (int i = 0; i < sparseArray1.length; i++) {
            for (int j = 0; j <sparseArray1.length ; j++) {
                if (sparseArray1[i][j]!= 0){
                    count++;

                }
            }
        }
        //对应的稀松矩阵
        //稀松矩阵的第一行存的是，原来矩阵的行数，列数，非零元素的个数
        //第二行起存非零元素的位置
        int sparseArray[][]=new int[count+1][3];
        sparseArray[0][0]=sparseArray1.length;
        sparseArray[0][1]=sparseArray1.length;
        sparseArray[0][2]=count;

        //将非零元素位置存到对应的稀松矩阵当中
        //辅助非零元素存到稀松矩阵中
        int sum=0;
        for (int i = 0; i <sparseArray1.length ; i++) {
            for (int j = 0; j <sparseArray1.length ; j++) {
                if (sparseArray1[i][j]!=0){
                    sum++;
                    sparseArray[sum][0]=i;
                    sparseArray[sum][1]=j;
                    sparseArray[sum][2]=sparseArray1[i][j];
                }
            }
        }
        System.out.println("对应的稀松矩阵：");
        printArray(sparseArray);

        //由稀松矩阵还原矩阵的行列大小
        int row=sparseArray[0][0];
        int list=sparseArray[0][1];
        //对应稀松矩阵还原的矩阵
        int sparseArray2[][]=new int[row][list];
        //遍历稀松矩阵的行
        for (int i = 1; i <sparseArray.length ; i++) {
            int r=sparseArray[i][0];
            int l=sparseArray[i][1];
            int value=sparseArray[i][2];
            sparseArray2[r][l]=value;
        }
        System.out.println("还原后的稀松矩阵：");
        printArray(sparseArray2);

    }

    private static void printArray(int[][] sparseArray) {
        for (int[] ints : sparseArray) {
            for (int anInt : ints) {
                System.out.print(anInt+"  ");
            }
            System.out.print("\n");
        }
    }
}
