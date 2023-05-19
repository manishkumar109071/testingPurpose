package recursion;

public class MyRecursion {
    public int sum(int number) {
        int total = 0;
        if (number > 0) {
            return number + sum(number - 1);
        } else {
            return 0;
        }
    }

    String reverseString(String str){
        if(str.length()>0){
            return reverseString(str.substring(0,str.length()-1));
        }else {
            return "---";
        }
    }

    public static void main(String[] args) {
        MyRecursion myRecursion = new MyRecursion();
        System.out.println(myRecursion.sum(10));
        System.out.println(myRecursion.reverseString("manish"));
    }
}
