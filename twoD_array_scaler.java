public class twoD_array_scaler {
    public static void main(String[] args) {
        int [][]arr= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
                                };
//Transpose of matrix
//    for(int i=0;i< arr.length;i++){
//    for (int j=0;j<i;j++){
//        int temp=arr[i][j];
//        arr[i][j]=arr[j][i];
//        arr[j][i]=temp;
//                        }
//                                }
//        System.out.println("Matrix after transpose :");
//        for(int i=0;i< arr.length;i++){
//    for (int j=0;j<arr[i].length;j++){
//
//        System.out.print(arr[i][j]+" ");}
//        System.out.println(" ");    }

    //90 degree clockwise rotation
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i< arr.length;i++){
            int left=0;
            int right=arr.length-1;

            while(left<right){
                int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
        left++;
            right--;
            }
        }
        System.out.println("Matrix after 90 degree clockwise rotation :");
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");}
            System.out.println(" ");    }



    }
    }