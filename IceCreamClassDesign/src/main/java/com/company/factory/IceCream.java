package com.company.factory;

import java.util.Arrays;
import java.util.Objects;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public double profit(double salePrice, double productionCost){
        double profit = salePrice - productionCost;
        System.out.println("we make $" + profit + " per unit");
        return profit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && productionTime == iceCream.productionTime && Objects.equals(flavor, iceCream.flavor) && Arrays.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flavor, salePrice, productionCost, productionTime);
        result = 31 * result + Arrays.hashCode(ingredients);
        return result;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}

