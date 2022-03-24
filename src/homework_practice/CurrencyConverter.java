package homework_practice;

public class CurrencyConverter {
    public static Double currencyConverter (String curency, double amount){
        switch (curency){
            case "euro":
                return amount * 0.91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return  amount * 14.84;
            case "won":
                return amount *1217.52;
            case "rupee":
                return  amount * 181.45;

        }
        return amount;
    }

    public static void main(String[] args) {
        System.out.println(currencyConverter("rupee",10));
    }


}
