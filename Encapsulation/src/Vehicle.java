
public class Vehicle {
	 private String vehicleNumber;
	 private String modelName;
	 private String color;
	 private Double capacity;
	 private Integer manufacturingYear;
	 

	 public void setVehicleNumber(String vehicleNumber){
		 this.vehicleNumber=vehicleNumber;
	 }
	 public String getVehicleNumber(){
		 return vehicleNumber;
	 }
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void  setCapacity(double capacity) {
		this.capacity=capacity;
	}
	public double getCapacity() {
		return capacity;
	}
	public Integer getManufacturingYear() {
		return manufacturingYear;
	}
	public void setManufacturingYear(Integer manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [vehicleNumber=");
		builder.append(vehicleNumber);
		builder.append(", modelName=");
		builder.append(modelName);
		builder.append(", color=");
		builder.append(color);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", manufacturingYear=");
		builder.append(manufacturingYear);
		builder.append("]");
		return builder.toString();
	}
}
	