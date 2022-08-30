public class Main {

    public static void main(String[] args) {
	 String[][] arr=new String[5][10];

     for (int i=0;i<arr.length;i++){
         for (int j=0;j<arr[i].length;j++){

             if (i==0&&j==0){
                 arr[i][j]=" * ";
             }
             else if (i==0&&j==8){
                 arr[i][j]=" * ";
             }
            else if (j==8){
                 arr[i][j]=" * ";
             }
             else if (i==1&&j==1){
                 arr[i][j]=" * ";
             }
             else if (i==1&&j==7){
                 arr[i][j]=" * ";
             }
             else if(i==2&&j==2){
                 arr[i][j]=" * ";
             }
             else if (i==2&&j==6){
                 arr[i][j]=" * ";
             }
             else if (i==3&&j==3){
                 arr[i][j]=" * ";
             }
             else if (i==3&&j==5){
                 arr[i][j]=" * ";
             }
             else if (i==4&&j==4){
                 arr[i][j]=" * ";
             }
             else if (j==0){
                 arr[i][j]=" * ";
             }
             else{
                 arr[i][j]="   ";
             }
         }
     }
     for (String[] row:arr){
         for (String col:row){
             System.out.print(col);
         }
         System.out.println();
     }

    }
}
