package Day6Training;

public enum Currency {

    RUPEE("USD"){


        @Override
        public String getSymbol() {
            return "rs";
        }

        @Override
        public double toINR(double amount) {
            return 87.73*amount;
        }
    },
    DOLLAR(" RE"){
        public String getSymbol(){return "$";}
        @Override
        public double toINR(double amount) {
            return amount*88.67;
        }
    },
    EURO("RE"){
        public String getSymbol(){return "e";}
        @Override
        public double toINR(double amount) {
            return amount*102.49;
        }
    },
    YEN("RE"){
        public String getSymbol(){return "Y";}
        @Override
        public double toINR(double amount) {
            return 0.59*amount;
        }
    },
    POUND(" RE"){
        public String getSymbol(){return "P";}
        @Override
        public double toINR(double amount) {
            return 116.59*amount;
        }
    };

    private String country;

    //private double amount;
   // public String getSymbol() {
   //     return null;
   // }

    private Currency(String country) {

        this.country = country;

    }

public abstract String getSymbol();
    public abstract double toINR(double amount);
}
