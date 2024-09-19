package com.evergent.src.basicapplications.AlcoholManagementSystemBhanu2;
import java.security.PublicKey;
import java.util.*;
import java.util.Spliterators.AbstractDoubleSpliterator;
class AlcoholOrderingSystem {
	
	 static {
     	final String s="\n\t\t\tWelcome to My Liquormart ";
     	System.out.println(s);
     }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String module;
        int quantity = 0;
        double amount = 0.0;
        double discount = 0.0;
        Double amt=0.0;
        StringBuilder currentOrderSummary = new StringBuilder();
        StringBuilder fullOrderSummary = new StringBuilder();
        StringBuilder sumOfTotal =new StringBuilder();
        while (true) {
            System.out.println("\n=====================");
            System.out.println(" Main Menu");
            System.out.println("=====================");
            System.out.println("O - Order Alcohol");
            System.out.println("P - Payment");
            System.out.println("R - Reports");
            System.out.println("E - Exit System");
            System.out.println("=====================");
            System.out.println("Enter your choice (O - Order Alcohol, P - Make Payment, R - View Order Summary, E - Exit System): ");

            module = scanner.nextLine().toUpperCase();

            switch (module) {
                case "O":
                    System.out.println("\nOrder Alcohol");
                    System.out.println("=====================");
                    System.out.println("1 - Beer");
                    System.out.println("2 - Wine");
                    System.out.println("3 - Liquor");
                    System.out.println("=====================");
                    System.out.println("Enter your choice (1, 2, 3): ");

                    int orderChoice = Integer.parseInt(scanner.nextLine());

                    switch (orderChoice) {
                        case 1: // Beer
                            System.out.println("\nSelect Beer Brand");
                            System.out.println("=====================");
                            System.out.println("1 - Kingfisher");
                            System.out.println("2 - Carlsberg");
                            System.out.println("3 - Budwiser");
                            System.out.println("=====================");
                            System.out.println("Enter your choice (1 - Kingfisher, 2 - Carlsberg, 3 - Budwiser): ");

                            int beerChoice = Integer.parseInt(scanner.nextLine());
                            Beer selectedBeer = null;
                            switch (beerChoice) {
                                case 1:
                                    selectedBeer = BeerBrand.KINGFISHER.getBeer();
                                    break;
                                case 2:
                                    selectedBeer = BeerBrand.CARLSBERG.getBeer();
                                    break;
                                case 3:
                                    selectedBeer = BeerBrand.BUDWAISER.getBeer();
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }

                            if (selectedBeer != null) {
                                System.out.print("Enter quantity: ");
                                quantity = Integer.parseInt(scanner.nextLine());
                                amount = selectedBeer.getPrice() * quantity;
                                
                                currentOrderSummary.append(selectedBeer.getType()).append(": ").append(quantity)
                                        .append(" x ").append(selectedBeer.getPrice()).append(" = ").append(amount).append("\n");
                                System.out.println(currentOrderSummary);
   
                                System.out.println("Total Amount :"+amount);
                            }
                            break;

                        case 2: // Wine
                            System.out.println("\nSelect Wine Type");
                            System.out.println("=====================");
                            System.out.println("1 - Red Wine");
                            System.out.println("2 - White Wine");
                            System.out.println("=====================");
                            System.out.println("Enter your choice (1, 2): ");

                            int wineChoice = Integer.parseInt(scanner.nextLine());
                            Wine selectedWine = null;
                            switch (wineChoice) {
                                case 1:
                                    selectedWine = WineType.RED.getWine();
                                    break;
                                case 2:
                                    selectedWine = WineType.WHITE.getWine();
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }

                            if (selectedWine != null) {
                                System.out.println("Enter quantity (bottles): ");
                                quantity = Integer.parseInt(scanner.nextLine());
                                amount = selectedWine.getPrice() * quantity;
                                currentOrderSummary.append(selectedWine.getType()).append(": ").append(quantity)
                                        .append(" x ").append(selectedWine.getPrice()).append(" = ").append(amount).append("\n");
                                System.out.println(currentOrderSummary);
                                
                                System.out.println("Total Amount :"+amount);
                            }
                            break;

                        case 3: // Liquor
                            System.out.println("\nSelect Liquor Type");
                            System.out.println("=====================");
                            System.out.println("1 - Whisky");
                            System.out.println("2 - Vodka");
                            System.out.println("3 - Rum");
                            System.out.println("=====================");
                            System.out.println("Enter your choice (1, 2, 3): ");

                            int liquorChoice = Integer.parseInt(scanner.nextLine());
                            Liquor selectedLiquor = null;
                            switch (liquorChoice) {
                                case 1:
                                    selectedLiquor = LiquorType.WHISKY.getLiquor();
                                    break;
                                case 2:
                                    selectedLiquor = LiquorType.VODKA.getLiquor();
                                    break;
                                case 3:
                                    selectedLiquor = LiquorType.RUM.getLiquor();
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }

                            if (selectedLiquor != null) {
                                System.out.println("Enter quantity (bottles): ");
                                quantity = Integer.parseInt(scanner.nextLine());
                                amount = selectedLiquor.getPrice() * quantity;
                                currentOrderSummary.append(selectedLiquor.getType()).append(": ").append(quantity)
                                        .append(" x ").append(selectedLiquor.getPrice()).append(" = ").append(amount).append("\n");
                                System.out.println(currentOrderSummary);
                                
                                System.out.println("Total Amount :"+amount);
                            }
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                            break;
                    }

                    // Apply discount if applicable
                    discount = new PaymentMethodImpl("N/A").applyDiscount(amount, quantity);
                     amt=amount-discount;
                    currentOrderSummary.append("Discount: ").append(discount).append("\n");
                    System.out.println("Total Amount after Discount "+amt);
                    sumOfTotal.append(" "+amt);
                    fullOrderSummary.append(currentOrderSummary.toString());
                    currentOrderSummary.setLength(0); // Clear the current order summary
                    break;

                case "P":
                    System.out.println("\nMake Payment");
                    System.out.println("=====================");
                    System.out.println("1 - Cash");
                    System.out.println("2 - Card");
                    System.out.println("=====================");
                    System.out.println("Enter your choice (1, 2): ");

                    int paymentChoice = Integer.parseInt(scanner.nextLine());
                    PaymentMethod paymentMethod = (paymentChoice == 1) ? new PaymentMethodImpl("Cash") : new PaymentMethodImpl("Card");

                    System.out.println("Payment Method: " + paymentMethod.getMethod());
         
                    String numbersString = sumOfTotal.toString();
                    paymentMethod.generatePayment(fullOrderSummary.toString(), amount);
                    // Split the string by spaces
                    String[] numberStrings = numbersString.split(" ");

                    // Initialize sum
                    double sum1 = 0.0;

                    // Iterate through the array of number strings
                    for (String numStr : numberStrings) {
                        try {
                            // Parse each string to double and add to sum
                            double num = Double.parseDouble(numStr);
                            sum1+= num;
                        } catch (NumberFormatException e) {
                            System.out.println("Total amount for Order : " + numStr);
                        }
                    }
                    System.out.println(sum1);
                    break;

                case "R": // Generate Report
                    fullOrderSummary.append(currentOrderSummary);
                    OrderReport o=new OrderReport();
                    o.generateReport(fullOrderSummary.toString(), amount);
                    
                    numbersString = sumOfTotal.toString();

                    // Split the string by spaces
                     numberStrings = numbersString.split(" ");

                    // Initialize sum
                     sum1 = 0.0;

                    // Iterate through the array of number strings
                    for (String numStr : numberStrings) {
                        try {
                            // Parse each string to double and add to sum
                            double num = Double.parseDouble(numStr);
                            sum1+= num;
                        } catch (NumberFormatException e) {
                            System.out.println("Total amount for Order after : " + numStr);
                        }
                    }
                    System.out.println(sum1);
                    break;

                case "E": // Exit System
                	SystemExit systemExit=new SystemExit();
                    systemExit.exit();
                  
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice. Please enter O, P, R, or E.");
                    break;
            }
        }
    }
}