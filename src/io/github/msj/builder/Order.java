package io.github.msj.builder;

public class Order {

    private String mainDish;

    private String drink;

    private String dessert;

    private boolean extraSauce;

    private boolean cutleryIncluded;

    // Construtor privado para forçar o uso do Builder
    private Order(OrderBuilder builder) {
        this.mainDish = builder.mainDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.extraSauce = builder.extraSauce;
        this.cutleryIncluded = builder.cutleryIncluded;
    }

    // Getters para acessar os atributos
    public String getMainDish() { return mainDish; }

    public String getDrink() { return drink; }

    public String getDessert() { return dessert; }

    public boolean isExtraSauce() { return extraSauce; }

    public boolean isCutleryIncluded() { return cutleryIncluded; }

    @Override
    public String toString() {
        return "Order{" +
                "mainDish='" + mainDish + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                ", extraSauce=" + extraSauce +
                ", cutleryIncluded=" + cutleryIncluded +
                '}';
    }

    // Classe interna estática para o Builder
    public static class OrderBuilder {

        private String mainDish;

        private String drink;

        private String dessert;

        private boolean extraSauce;

        private boolean cutleryIncluded;

        public OrderBuilder(String mainDish) { // Obrigatório
            this.mainDish = mainDish;
        }

        public OrderBuilder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public OrderBuilder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public OrderBuilder extraSauce(boolean extraSauce) {
            this.extraSauce = extraSauce;
            return this;
        }

        public OrderBuilder cutleryIncluded(boolean cutleryIncluded) {
            this.cutleryIncluded = cutleryIncluded;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}

