import java.io.Console;

public class TreeStory {
	
	public static void main(String[] args) {
		Console console = System.console();
		/* Some terms:
			noun - Person, place, or thing
			verb - An Action
			adjective - A description used to modify or describe a noun
			Enter your amazing code here:
		*/
	// __Name__ is a __adjective__ __noun__.  They are always __adverb__ __verb__.
	String ageAsString = console.readLine("How old are you? ");
	int age = Integer.parseInt(ageAsString);
	if (age < 13) {
		//Insert exit code
		console.printf("Sorry, you must be at least 13 years of age to use this program.\n");
		System.exit(0);
	}
	String name = console.readLine("Enter a name: ");
	String adjective = console.readLine("Enter an adjective: ");
	String noun;
	boolean isInvalidWord;
	do {
		noun = console.readLine("Enter a name: ");
	boolean isInvalidWord;
	isInvalidWord = (noun.equalsIgnoreCase("dork") ||
								noun.equalsIgnoreCase("jerk"));
			if (isInvalidWord {
				console.printf("That language is not allowed.  Try again. \n\n");
			  }
			} while (isInvalidWord) {
				console.printf("That language is not allowed.  Try again.  \n\n");
	String adverb = console.readLine("Enter an adjective: ");
	String verb = console.readLine("Enter a verb ending in -ing: ");

	console.printf("Your TreeStory:\n______________\n");
	console.printf("%s is a(n) %s %s. ", name, adjective, noun);
	console.printf("They are always %s %s.\n", adverb verb);
	};