import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greeting = String.format("Hello, %s. Nice to see you.", name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Today date: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String response = "Right. And with that I shall retire";
        if (conversation.indexOf("Alexis") >= 0) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that";
        } else if (conversation.indexOf("Alfred") >= 0) {
            response = "At your service. As you wish, naturally.";
        }
        return response;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        String greeting = String.format("Good %s, %s.", dayPeriod, name);
        return greeting;
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String alfredQuote(String personName) {
        String response = String.format("Bruce Wayne is not %s.", personName);
        return response;
    }
}

