//     Define a Smartphone class that implements Cloneable and has:
//        5 attributes:
//          a string brandName
//          a string modelName
//          an int batterymAh
//          an attribute producerPrice of type SmartphonePrice
//          an attribute retailPrice of type SmartphonePrice
//          [using IntelliJ] an override of the toString() method in order to print all the attributes of a Smartphone object
//          [using IntelliJ] an override of the equals() method that check all the 5 attributes to establish if two Smartphone objects are equal
//          [using IntelliJ] an override of the hashCode(), using all the 5 attributes
//          [using IntelliJ] an override of the clone() method (that will have to be public) where:
//              a clonedSmartphone is generated using super.clone()
//              there's an assignment to the clonedSmartphone.producerPrice
//              there's an assignment to the clonedSmartphone.retailPrice
//              the return value is a Smartphone object
//          a constructor method that accepts 5 params (brand, model, battery, prodP, retailP) and assign the right values to the object

import java.util.Objects;

public class Smartphone implements Cloneable{
    String brandName;
    String modelName;
    String batterymAh;
    SmarthphonePrice producerPrice;
    SmarthphonePrice retailPrice;

    // a constructor method that accepts 5 params (brand, model, battery, prodP, retailP) and assign the right values to the object
    public Smartphone(String brand, String model, String battery, SmarthphonePrice prodP, SmarthphonePrice retailP) {
        brandName = brand;
        modelName = model;
        batterymAh = battery;
        producerPrice = prodP;
        retailPrice = retailP;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBatterymAh() {
        return batterymAh;
    }

    public SmarthphonePrice getProducerPrice() {
        return producerPrice;
    }

    public SmarthphonePrice getRetailPrice() {
        return retailPrice;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setBatterymAh(String batterymAh) {
        this.batterymAh = batterymAh;
    }

    public void setProducerPrice(SmarthphonePrice producerPrice) {
        this.producerPrice = producerPrice;
    }

    public void setRetailPrice(SmarthphonePrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    // [using IntelliJ] an override of the toString() method in order to print all the attributes of a Smartphone object
    @Override
    public String toString() {
        return brandName + ", " + modelName + ", " + batterymAh + ", " + producerPrice + ", " + retailPrice;
    }

    // Ovverride di equals e hashCode li ho fatti con click destro e generate
    // [using IntelliJ] an override of the equals() method that check all the 5 attributes to establish if two Smartphone objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(batterymAh, that.batterymAh) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    //[using IntelliJ] an override of the hashCode(), using all the 5 attributes
    @Override
    public int hashCode() {
        return Objects.hash(brandName + modelName + batterymAh + producerPrice + retailPrice);
    }

    // [using IntelliJ] an override of the clone() method (that will have to be public) where:
    //     a clonedSmartphone is generated using super.clone()
    //     there's an assignment to the clonedSmartphone.producerPrice
    //     there's an assignment to the clonedSmartphone.retailPrice
    //     the return value is a Smartphone object
    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;
        return clonedSmartphone;
    }
}
