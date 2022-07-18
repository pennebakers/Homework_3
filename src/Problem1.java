public class Problem1 {

    public static void sumOfDiagonals(String[][] x){
        int sum = 0;

        if(x.length == x[0].length){
            System.out.println(x.length);
            System.out.println(x[0].length);
            int length = x.length - 1;

            for(int i = 0; i <= length; i++){
                sum = sum + Integer.parseInt(x[i][i]);
            }

            System.out.println(sum);
        }
        else if (x.length != x[0].length){
            throw new IllegalArgumentException();
        }
        else{
            throw new NumberFormatException();
        }
    }
}
