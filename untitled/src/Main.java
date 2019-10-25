public class Main {

    public static String duplicateLetters(String input){
        StringBuilder result = new StringBuilder();
        char [] letters = input.toCharArray();
        for (char c:letters) {
            result.append(c);
            result.append(c);
        }
        return result.toString();
    }


    public static void main (String args[]){

        System.out.println("----------------Algorithms-----------------");

        System.out.println("first exercise");
        System.out.println(duplicateLetters("alma"));

        System.out.println("second exercise");
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else
                System.out.println(i);
        }
    }
}
