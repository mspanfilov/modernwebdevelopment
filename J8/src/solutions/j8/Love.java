package solutions.j8;

/**
 * Created by yfain11 on 4/3/14.
 */
public class Love {
    public static void main(String[] args) {


    // Anonymous class implementation
     Lovable anonymousLove = new Lovable(){
        public String showLove(){
            System.out.println("I love you the old way");
            return "Forever!";
        }
    };

    String result;
    result = anonymousLove.showLove();
    System.out.println(result);


    // Implementing a functional interface with lambda expression
    Lovable lambdaLove = () -> {
        System.out.println("I love you the new way");
        return "Forever and ever!";
    };

    result = lambdaLove.showLove();
    System.out.println(result);
    }
}
