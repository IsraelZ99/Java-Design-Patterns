package implementation_2;

interface Builder {
    Builder addBrandName();
    Builder buildBody();
    Builder insertWheels();

    // The following method is used to
    // retrieve the object that is constructed
    Vehicle getVehicle();
}
