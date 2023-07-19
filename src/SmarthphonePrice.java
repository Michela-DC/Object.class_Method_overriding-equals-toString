//      define a SmartphonePrice class that implements Cloneable and has:
//        2 attributes:
//          a string priceType
//          a double priceInEuros
//          [using IntelliJ] an override of the clone() method (that will have to be public) where:
//              a clonedSmartphonePrice is generated using super.clone()
//              the return value is a SmartphonePrice object
//          [using IntelliJ] an override of the toString() method for returning an informative String about the 2 SmartphonePrice attributes
//          [using IntelliJ] an override of the equals() method that check the 2 attributes to establish if two SmartphonePrice objects are equal
//          [using IntelliJ] an override of the hashCode(), using the 2 attributes
//          a constructor method that accepts 2 params (type, price) and assign the right values to the object

import java.util.Objects;

public class SmarthphonePrice implements Cloneable{
    String priceType;
    Double priceInEuros;

    public SmarthphonePrice(String type, Double price) {
        priceType = type;
        priceInEuros = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public Double getPriceInEuros() {
        return priceInEuros;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public void setPriceInEuros(Double priceInEuros) {
        this.priceInEuros = priceInEuros;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SmarthphonePrice clonedSmartphonePrice = (SmarthphonePrice) super.clone(); // specifico che il clone deve essere di tipo SmartphonePrice facendo il casting
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return priceType + ", " + priceInEuros;
    }


    // Ovverride di equals e hashCode li ho fatti con click destro e generate
    @Override
    public boolean equals(Object o) {
        // confronto l'oggetto che viene passato in input a equals con l'istanza corrente es: samsung.equals(iphone) --> samsung è l'istanza corrente e iphone è l'input
        if (this == o) return true;

        // Se o è null oppure se la classe dell'oggetto corrente è diverso dalla classe di o allora return false
        if (o == null || getClass() != o.getClass()) return false;

        SmarthphonePrice that = (SmarthphonePrice) o; // salvo nella variabile smartphonePrice il casting a SmarthphonePrice di obj

        return Objects.equals(priceType, that.priceType) && Objects.equals(priceInEuros, that.priceInEuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
