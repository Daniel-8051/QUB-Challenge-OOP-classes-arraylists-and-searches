/**
 * 
 */
package tablet.redo;

/**
 * @author Daniel McAuley
 *
 */
public class Tablet {

	// instance vars
	private String manufacturer;
	private String model;
	private double price;
	private boolean android;
	private double size;
	private String notes;

	/**
	 * Default constructor
	 */
	public Tablet() {

	}

	/**
	 * Constructor with args
	 * @param manufacturer
	 * @param model
	 * @param price
	 * @param android
	 * @param size
	 * @param notes
	 */
	public Tablet(String manufacturer, String model, double price, boolean android, double size, String notes) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.android = android;
		this.setSize(size);
		this.setNotes(notes);
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the android
	 */
	public boolean isAndroid() {
		return android;
	}

	/**
	 * @param android the android to set
	 */
	public void setAndroid(boolean android) {
		this.android = android;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		if(size>5 && size<21) {
			this.size = size;
		} else {
			System.out.println("Size must be more than 5 and less than 21. Defaulting to 0");
			this.size =0;
		}
		
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		if(notes.length()<=250) {
			this.notes = notes;
		} else {
			this.notes = notes.substring(0, Math.min(notes.length(), 250));
		}
		
	}

	/**
	 * Displays all details for tablet
	 */
	public void allDetails() {
		System.out.println("Tablet details_______________");
		System.out.println("Manufactuer : " + this.manufacturer + "\nModel : " + this.model + "\nPrice : " + this.price
				+ "\nAndroid : " + this.android + "\nSize : " + this.size + "\nSize : " + this.size + "\nNotes : "
				+ this.notes);

	}
}
