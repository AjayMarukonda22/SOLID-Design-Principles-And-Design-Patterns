package DesignPatterns.CreationalDesignPatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean olives;
    private List<String> extraToppings;

    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isOlives() {
        return olives;
    }

    public List<String> getExtraToppings() {
        return extraToppings;
    }

    private Pizza(Builder builder){
        this.size = builder.getSize();
        this.cheese = builder.isCheese();
        this.bacon = builder.isBacon();
        this.pepperoni = builder.isPepperoni();
        this.olives = builder.isOlives();
        this.extraToppings = builder.getExtraToppings();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
   public static class Builder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean bacon;
        private boolean olives;
        private List<String> extraToppings = new ArrayList<>();

        public Builder setSize(String size) {
            this.size = size;
            return (this);
        }

        public Builder setCheese(boolean cheese) {
            this.cheese = cheese;
            return (this);
        }

        public Builder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return (this);
        }

        public Builder setBacon(boolean bacon) {
            this.bacon = bacon;
            return (this);
        }

        public Builder setOlives(boolean olives) {
            this.olives = olives;
            return (this);
        }

        public Builder setExtraToppings(List<String> extraToppings) {
            this.extraToppings = extraToppings;
            return (this);
        }
       public Builder addTopping(String item){
           this.extraToppings.add(item);
           return (this);
       }

        public String getSize() {
            return size;
        }

        public boolean isCheese() {
            return cheese;
        }

        public boolean isPepperoni() {
            return pepperoni;
        }

        public boolean isBacon() {
            return bacon;
        }

        public boolean isOlives() {
            return olives;
        }

        public List<String> getExtraToppings() {
            return extraToppings;
        }

        public Builder(){

        }
        public Pizza build(){
            return new Pizza(this);
        }

       }
    }
