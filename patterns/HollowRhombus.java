public class HollowRhombus{
    public static void main(String[] args){

    int n=5;

    //outer loop
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
   
        //stars
        for(int j=1;j<=5;j++){
            if(i==1 || j==1 || i==5 || j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }




    }
}