package week1.day2;

public class Browser {
	// Method to launch a browser
    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName; // Return the browser name
    }

    // Method to load the URL
    public void loadUrl() {
        System.out.println("Application URL loaded successfully");
    }

    public static void main(String[] args) {
        // Create an object of Browser class
        Browser myBrowser = new Browser();
        
        // Call the launchBrowser method and print the returned browser name
        String browser = myBrowser.launchBrowser("Google Chrome");
        System.out.println("The browser launched: " + browser);
        
        // Call the loadUrl method
        myBrowser.loadUrl();
    }

}
