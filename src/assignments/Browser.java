package assignments;

import java.util.ArrayList;

public class Browser {

	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> listOfPlugins;

	// Constructor using two parameters
	public Browser(String browserName, String vendorName) {

		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	// Constructor using all parameters
	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> listOfPlugins) {

		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.listOfPlugins = listOfPlugins;
	}

	// getting values
	public String getBrowserName() {
		return this.browserName;
	}

	public String getVendorName() {
		return this.vendorName;
	}

	public double getCurrentVersion() {
		return this.currentVersion;
	}

	public ArrayList<String> getListOfPlugins() {
		return this.listOfPlugins;
	}

	public static void main(String[] args) {

		Browser br1 = new Browser("Firefox", "Microsoft Corporation");

		System.out.println(br1.browserName + " " + "is developed by" + " " + br1.vendorName);

		ArrayList<String> plugin = new ArrayList<String>();
		plugin.add("Google Earth");
		plugin.add("Google Dictionary");
		Browser br2 = new Browser("Chrome", "Google", 81.0, plugin);
		System.out.println(br2.getBrowserName());
		System.out.println(br2.getVendorName());
		System.out.println(br2.getCurrentVersion());
		System.out.println(br2.getListOfPlugins());

	}

}
