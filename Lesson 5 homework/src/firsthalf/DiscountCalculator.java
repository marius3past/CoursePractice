package firsthalf;
        class DiscountCalculator {
            public static void main(String[] args) {
                int totalAmount = 220;
                double finalPrice = (totalAmount > 100) ? totalAmount - (220 * 10) /100 : totalAmount;
                System.out.println(" The final price is " + finalPrice);
            }
        }


