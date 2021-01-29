/**
 * 
 */
package tablet.redo;

/**
 * @author Daniel McAuley
 *
 */
public class TabletsAreUs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// simulating a few tablets
		Tablet t1 = new Tablet("Apple", "iPad", 338.94, false, 10.2,
				"10.2 inch Retina display A10 Fusion chip Up to 10 hours of battery life");
		Tablet t2 = new Tablet("Apple", "iPad Air", 449.00, false, 10.5,
				"10.5 inch 10.5-inch Retina display with ProMotion, True Tone and wide colour, Up to 20 hours of battery life ");
		Tablet t3 = new Tablet("Google", "Fire", 79.99, true, 8, "8 inch display 10 hours of battery life");
		Tablet t4 = new Tablet("Samsung", "Galazy Tab", 180.00, true, 10.1,
				"10.1 inch  Entertainment for All: Designed with the whole family in mind, the Galaxy Tab A has what it takes to keep everyone happy. 5 hours battery.  ");
		Tablet t5 = new Tablet("Vankyo", "MatrixPad", 69.99, true, 7,
				"7-inch display Full-Featured Android Tablet with Eye Care for Kids Up to 4 hours of battery life");

		// adding to an arraylist
		Tablet[] tablets = { t1, t2, t3, t4 };

		// show all in stock
		showAllStock(tablets);

		// exercising a few searches

		// 1. all screen sizes > 10 inches in size
		searchByScreenSize(tablets, 10.0);

		// 2. all Apple products (over priced!)
		searchByManufacturer(tablets, "Apple");

		// 3. all Android tablets
		areAndroidTablets(tablets);

		// 4. note search .. e.g. by key word search (note this is case sensitive)
		searchNotes(tablets, "Kids");

	}

	public static void searchNotes(Tablet[] tablets, String keyword) {
		System.out.println("Searching tablet notes for '" + keyword + "'");
		for (int loop = 0; loop < tablets.length; loop++) {
			if (tablets[loop].getNotes().toLowerCase().indexOf(keyword.toLowerCase()) != -1) {
				System.out.println(tablets[loop].getManufacturer() + "\n\t" + tablets[loop].getNotes());
			} else {
				System.out.println("not found");
			}
		}
	}

	/**
	 * Searches for Android tablets in a stock list of tablets
	 * 
	 * @param tablets
	 */
	public static void areAndroidTablets(Tablet[] tablets) {
		System.out.println("Searching for all Android tablets");
		for (int loop = 0; loop < tablets.length; loop++) {
			if (tablets[loop] != null) {
				if (tablets[loop].isAndroid()) {
					System.out.println(tablets[loop].getManufacturer() + " " + tablets[loop].getModel());
				}
			}
		}
		System.out.println();
	}

	/**
	 * Searches a list of tablets in stock by manufacturer
	 * 
	 * @param tablets
	 * @param manufacturer
	 */
	public static void searchByManufacturer(Tablet[] tablets, String manufacturer) {
		System.out.println("Searching tablets from " + manufacturer);
		for (int loop = 0; loop < tablets.length; loop++) {
			if (tablets[loop] != null) {
				if (tablets[loop].getManufacturer().equalsIgnoreCase(manufacturer)) {
					System.out.println(tablets[loop].getModel());
				}
			}
		}
		System.out.println();
	}

	// create all the searches as methods here (make them all static)

	/**
	 * Shows all tablet details in stock list
	 * 
	 * @param tablets
	 */
	public static void showAllStock(Tablet[] tablets) {
		for (Tablet t : tablets) {
			if (t != null) {
				t.allDetails();
			}
		}
		System.out.println();
	}

	/**
	 * Searches tablets in stock and outputs the tablet models with a screen size
	 * over a specified amount
	 * 
	 * @param tablets
	 * @param screenSize
	 */
	public static void searchByScreenSize(Tablet[] tablets, double screenSize) {
		System.out.println("Searching tablets with a screen size more than " + screenSize + " inches");
		for (int loop = 0; loop < tablets.length; loop++) {
			if (tablets[loop] != null) {
				if (tablets[loop].getSize() > screenSize) {
					System.out.println(tablets[loop].getManufacturer() + " " + tablets[loop].getModel());
				}
			}
		}
		System.out.println();
	}

}
