import java.util.Scanner;

//  TODO: [x]Create a class named Bob with a main method for the following exercise.
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question.
//        [x](the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him.
//        [x](the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//        [x](empty input)
//        [x]He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your
//        command line application can have a conversation with Bob.

public class Bob {
    public static void main(String[] args) {
        //create Strings with Bob's responses(4)
        String messageWithQuestionMark = "Bob: Sure.";
        String messageWithExclamation = "Bob: Whoa, chill out!";
        String messageWithNothing = "Bob: Fine. Be that way!";
        String messageWithAnythingElse = "Bob: Whatever.";
        String contQuestion = "Do you still want to talk to Bob?";
        //create a Scanner.
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to talk to Bob? yes/no");
        String usersResponse = sc.nextLine();
        String continues;
        switch(usersResponse.toLowerCase()) {
            case "yes":
                do {
                    System.out.println("What would you like to say?");
                    System.out.println("Bob: ...");
                    String usersResponse2 = sc.nextLine();
                    //ORIGINALLY HAD IT INDEXOF >= 0 BUT != -1 FUNCTIONS BETTER.
                    if (usersResponse2.indexOf("?") != -1) {
                        System.out.println(messageWithQuestionMark);
                    } else if (usersResponse2.indexOf("!") != -1) {
                        System.out.println(messageWithExclamation);
                    } else if (usersResponse2.length() < 1) {
                        System.out.println(messageWithNothing);
                    } else {
                        System.out.println(messageWithAnythingElse);
                    }
                    System.out.println(contQuestion);
                    continues = sc.nextLine();
                } while (continues.equals("yes"));
                //ORIGINALLY HAD CASE: "NO" FIRST, BUT HAVING IT LAST GIVES ME THE MSG W/ EVERY USER RESPONSE OF "NO"
            case "no":
                System.out.println("*Bob shrugs and walks away*");
                break;
        }
    }
}

//       if (usersResponse.equals("no")){
//               System.out.println("He's busy anyway.");
//           } else if (usersResponse.equals("yes")) {
//       }
//        String usersResponse2 = sc.nextLine();
//       if (usersResponse2.equals("hi")){
//
//       }