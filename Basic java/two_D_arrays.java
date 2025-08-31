public class two_D_arrays {
    static public void main(){
        // 2D array = An array where each element is an array 
        // useful for sorting a amtrix of data




        // String[][] groceries={ {"Apple","Banana","Mango"},
        //                       {"Pindi","Karela","Tamatar"}};
        //                       groceries[1][2] = "Kadu";
        // for(String[] foods : groceries){
        //     for(String food : foods){
        //         System.out.print(food + " ");
        //     } 
                
        //     System.out.print("\n");
        // }


        

        char[][] telephone= {{'1','2','3'},
                    {'4','5','6'},
                    {'7','8','9'},
                    {'*','0','#'}};
        for(char[] row:telephone){
            for(char number : row){
                System.out.print(number+" ");
            }
            System.out.println();
        }            
    }
}
