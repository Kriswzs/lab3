public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] newarray = new char[args.length];
        int count = 0;
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] != ' ') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
