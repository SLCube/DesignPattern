package credentialPattern.builder.joshuaBuilder;

public class Phone {
    private String name;
    private int price;
    private String companyName;
    private boolean isAndroid;

    public static class Builder {
        private String name;
        private int price;
        private String companyName;
        private boolean isAndroid;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder isAndroid(boolean isAndroid) {
            this.isAndroid = isAndroid;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    private Phone(Builder builder) {
        name = builder.name;
        price = builder.price;
        companyName = builder.companyName;
        isAndroid = builder.isAndroid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("name is " + this.name + ", \n")
                .append("price is " + this.price + ", \n")
                .append("companyName is " + this.companyName + ", \n")
                .append(this.isAndroid ? "this phone is android phone" : "this phone is not android phone")
                .toString();
    }
}
