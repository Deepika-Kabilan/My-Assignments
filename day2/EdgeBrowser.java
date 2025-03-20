package week1.day2;

public class EdgeBrowser {
	  public static void main(String[] args) {
	        // Create an object of Browser class in EdgeBrowser
	        Browser browserObject = new Browser();

	        // Call the launchBrowser method from Browser class and print the returned browser name
	        String browserName = browserObject.launchBrowser("Microsoft Edge");
	        System.out.println("The browser launched: " + browserName);

	        // Call the loadUrl method from Browser class
	        browserObject.loadUrl();
	    }

}
