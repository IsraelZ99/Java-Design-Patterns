package implementation_3;

abstract class BasicCar implements Cloneable {
    String modelName;
    public int basePrice = 0, onRoadPrice = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
