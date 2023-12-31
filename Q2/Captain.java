// Title: Captain Class
// Description: Captain class with specifies fields which represents drivers in CDRC.
public class Captain {
	// required fields for Captain class
	private int id;
	private String name;
	private Boolean available;
	private int rating;

	// Constructor for Captain class
	public Captain(int id, String name) {
		this.id = id;
		this.name = name;
		this.available = true;
		this.rating = 0;
	}

	// Getters and Setters for all fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		// rating increase or decrease check
		if (rating == 0 && this.rating > 0) {
			this.rating--;
		} else if (rating == 1 && this.rating >= 0 && this.rating < 5) {
			this.rating++;
		}
	}

}