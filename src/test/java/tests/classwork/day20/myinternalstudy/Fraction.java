package tests.classwork.day20.myinternalstudy;

import java.util.Objects;

public class Fraction {

    private Integer numerator;
    private Integer denumerator;

    public Fraction(Integer numerator, Integer denumerator) {
        try {
            if (denumerator == null || numerator == null) {
                throw new IllegalArgumentException("Numerator or Denumarator cannot be null");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        if (denumerator == 0) {
            throw new IllegalArgumentException("Denumerator cannot be Zero");
        }
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return Objects.equals(numerator, fraction.numerator) && Objects.equals(denumerator, fraction.denumerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denumerator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denumerator=" + denumerator +
                '}';
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getDenumerator() {
        return denumerator;
    }

    public void setDenumerator(Integer denumerator) {
        this.denumerator = denumerator;
    }

    public static Fraction addFraction(Fraction fractionOne, Fraction fractionTwo) {
        Integer commonDenumerator = fractionOne.denumerator * fractionTwo.denumerator;
        Integer numerator = fractionOne.numerator * fractionTwo.denumerator + fractionTwo.numerator * fractionOne.denumerator;
        return new Fraction(numerator, commonDenumerator);
    }
}
