public class Main {
    public static void main(String[] args) {
        /*
        Problem 1

        */

        Problem1 prob1 = new Problem1();

        String[][] s1 = {{"2", "3", "4"},
                {"5", "6", "7"},
                {"8", "9", "10"}};

        String[][] s2 = {{"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"13", "14", "15"}};

        String[][] s3 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try
        {
            prob1.sumOfDiagonals(s1);
            prob1.sumOfDiagonals(s2);
            prob1.sumOfDiagonals(s3);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Not a valid integer");
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Array not a square");
        }




    }
}