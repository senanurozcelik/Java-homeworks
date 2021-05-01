package homework2;


public class Course {
	private int id;
	private int instructorId;
	private int categoryId;
	private String name;
	private String shortDescription;
	private String longDescription;
	private double sellingPrice;
	
	public Course() {} 
	
	
	public Course(int id, int instructorId, int categoryId, String name, String shortDescription,
			String longDescription, double sellingPrice) {
		this.id = id;
		this.instructorId = instructorId;
		this.categoryId = categoryId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.sellingPrice = sellingPrice;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	
}
