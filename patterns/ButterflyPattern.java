public class ButterflyPattern{
    public static void main(String[] args){

    int n=4;
 
    //(1st part-Upper Half)outer loop
    for(int i=1;i<=n;i++){

        //1st part stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //for middle spaces
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }

        //2nd part stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    System.out.println();

    }

    
    //(2nd part-Lower Half)outer loop
    for(int i=n;i>=1;i--){

        //1st part stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //for middle spaces
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }

        //2nd part stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    System.out.println();

    }



    }
}