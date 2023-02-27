import java.util.Scanner; // importing the scanner package for taking the input

class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inputs");
        String in = sc.nextLine(); // inputing the inputs from the user
        String a = "";
        String b = "";
        char c = in.charAt(0); // storing the value of n as character
        char d = in.charAt(2); // storing the value of m as character
        a = a + c;
        b = b + d;
        int n = Integer.parseInt(a); // converting the value of n from string to integer
        int m = Integer.parseInt(b); // converting the value of m from string to integer
        long out = n + m - 2; // calculating the output and storing it in long variable
        System.out.println(out); // print the output
    }
}