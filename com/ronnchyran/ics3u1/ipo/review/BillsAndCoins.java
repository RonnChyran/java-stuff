/*
	File Name:   BillsAndCoins.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 6, 2016
	Description: Determines the least amount of coins needed to represent
					 a certain monetary value. Uses BigDecimal to avoid floating-point
					 division errors.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.math.BigDecimal;
import java.util.*;

public class BillsAndCoins
{
    /**
     * The monetary value of a penny (1 cent).
     */
    private static final BigDecimal COIN_1_VALUE = new BigDecimal("0.01");

    /**
     * The monetary value of a nickel (5 cents).
     */
    private static final BigDecimal COIN_5_VALUE = new BigDecimal("0.05");

    /**
     * The monetary value of a dime (10 cents).
     */
    private static final BigDecimal COIN_10_VALUE = new BigDecimal("0.10");

    /**
     * The monetary value of a quarter (25 cents).
     */
    private static final BigDecimal COIN_25_VALUE = new BigDecimal("0.25");

    /**
     * The monetary value of a loonie (100 cents = $1).
     */
    private static final BigDecimal COIN_100_VALUE = new BigDecimal("1.00");

    /**
     * The monetary value of a toonie (200 cents = $2).
     */
    private static final BigDecimal COIN_200_VALUE = new BigDecimal("2.00");

    /**
     * The monetary value of a 5 dollar bill ($5.00).
     */
    private static final BigDecimal BILL_5_VALUE = new BigDecimal("5.00");

    /**
     * The monetary value of a 10 dollar bill ($10.00).
     */
    private static final BigDecimal BILL_10_VALUE = new BigDecimal("10.00");

    /**
     * The monetary value of a 20 dollar bill ($20.00).
     */
    private static final BigDecimal BILL_20_VALUE = new BigDecimal("20.00");

    /**
     * The monetary value of a 50 dollar bill ($50.00).
     */
    private static final BigDecimal BILL_50_VALUE = new BigDecimal("50.00");

    /**
     * The monetary value of a 100 dollar bill ($100.00).
     */
    private static final BigDecimal BILL_100_VALUE = new BigDecimal("100.00");

    public static void main(String[] args)
    {
        BigDecimal remainingMoneyValue, originalMoneyValue;
        TreeMap<BigDecimal, Integer> valueMap = // Initialize all valid tender divisions.
                getBillValueMap(BILL_100_VALUE, BILL_50_VALUE, BILL_20_VALUE, BILL_10_VALUE, BILL_5_VALUE,
                COIN_200_VALUE, COIN_100_VALUE, COIN_25_VALUE, COIN_10_VALUE, COIN_5_VALUE, COIN_1_VALUE);
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a dollar value: $");
        originalMoneyValue = new BigDecimal(input.nextLine());
        remainingMoneyValue = originalMoneyValue;

        for (BigDecimal billValue : valueMap.keySet())
        {
            valueMap.put(billValue, getRepresentableBills(remainingMoneyValue, billValue));
            remainingMoneyValue = remainingMoneyValue.remainder(billValue); 
        }

        System.out.println("\nBills and Coins Required");
        System.out.println("------------------------");

        for (Map.Entry<BigDecimal, Integer> entry : valueMap.entrySet())
        {
            System.out.println("$" + entry.getKey().toPlainString() + ": " + entry.getValue());
        }

        System.out.println("Total: $" + originalMoneyValue);
    } // static void main

    /**
     * Gets a Map of each bill value as a BigDecimal and an integer used to store the amount of bills
     * that value of bill can represent.
     * @param billValues The list of valid tender divisions.
     * @return A TreeMap sorted from greatest to least value, with a default value of 0 for each key.
     */
    private static TreeMap<BigDecimal, Integer> getBillValueMap(BigDecimal... billValues)
    {
        List<BigDecimal> sortedBillValues = Arrays.asList(billValues);
        Collections.sort(sortedBillValues);

        TreeMap<BigDecimal, Integer> valueMap = new TreeMap<>(Collections.reverseOrder()); //sort the list of values from greatest to least
        for (BigDecimal bill : billValues)
        {
            valueMap.put(bill, 0);
        }
        return valueMap;
    } // TreeMap<BigDecimal, Integer> getBillValueMap

    /**
     * Gets the least amount of bills that can most closely represent a certain monetary value.
     * For example, given a billValue of 5.00 and a value of 15.57, the value returned would be 3.
     * Given a billValue of 10.00 and a value of 15.57, the value returned would be 1.
     * @param value The monetary value.
     * @param billValue The value of the bill.
     * @return The amount of bills that can represent a certain monetary value the closest.
     */
    public static int getRepresentableBills(BigDecimal value, BigDecimal billValue)
    {
        return value.divide(billValue).intValue();
    } // static int getRepresentableBills

} // class BillsAndCoins