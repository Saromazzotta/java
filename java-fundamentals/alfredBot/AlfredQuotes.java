import java.util.Date;

public class AlfredQuotes {
    

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guestGreeting = String.format("Hello %s.", name);
        return guestGreeting;
    }

    
    public String dateAnnoucement() {
        // YOUR CODE HERE
        return String.format("The current date is %s", new java.util.Date());
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE 
        if (conversation.indexOf("Alexis") > - 1) {
            return "What a sorry excuse for an AI. Let me help you instead.";
        }
        if (conversation.indexOf("Alfred") > -1 ) {
            return "Happy to be of assisstance. What can I do for you?";
        }
        
        return "Right. And with that I shall retire.";

    }

        // NINJA BONUS
        // See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}
