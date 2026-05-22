package day12;

import java.util.ArrayList;
import java.util.Scanner;

class CompanyShares
{
    String symbol;
    int noOfShares;
    double sharePrice;
    String dateTime;

    CompanyShares(String symbol,int noOfShares,
                  double sharePrice,String dateTime)
    {
        this.symbol = symbol;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
        this.dateTime = dateTime;
    }

    double totalValue()
    {
        return noOfShares * sharePrice;
    }

    void display()
    {
        System.out.println("Stock Symbol : "+symbol);
        System.out.println("No Of Shares : "+noOfShares);
        System.out.println("Share Price  : "+sharePrice);
        System.out.println("Date Time    : "+dateTime);
        System.out.println("Total Value  : "+totalValue());
        System.out.println();
    }
}

class StockAccount
{
    ArrayList<CompanyShares> stocks =
            new ArrayList<>();

    public void buy(int amount,String symbol,
                     double price,String datetime)
    {
        boolean found = false;

        for(CompanyShares c : stocks)
        {
            if(c.symbol.equals(symbol))
            {
                c.noOfShares += amount;
                c.dateTime = datetime;
                found = true;

                System.out.println(
                "Shares Added Successfully");

                break;
            }
        }

        if(!found)
        {
            CompanyShares c =
            new CompanyShares(symbol,
                              amount,
                              price,
                              datetime);

            stocks.add(c);

            System.out.println(
            "New Stock Added");
        }
    }

    public void sell(int amount,String symbol)
    {
        boolean found = false;

        for(CompanyShares c : stocks)
        {
            if(c.symbol.equals(symbol))
            {
                found = true;

                if(amount <= c.noOfShares)
                {
                    c.noOfShares -= amount;

                    System.out.println(
                    "Shares Sold Successfully");
                }
                else
                {
                    System.out.println(
                    "Not enough shares");
                }

                break;
            }
        }

        if(!found)
        {
            System.out.println(
            "Stock not found");
        }
    }

    public double valueOf()
    {
        double total = 0;

        for(CompanyShares c : stocks)
        {
            total += c.totalValue();
        }

        return total;
    }

    public void printReport()
    {
        System.out.println(
        "\n------ STOCK REPORT ------");

        for(CompanyShares c : stocks)
        {
            c.display();
        }

        System.out.println(
        "Total Account Value : "+valueOf());
    }
}

public class stockaddress
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);

        StockAccount s = new StockAccount();

        System.out.println(
        "Enter number of stocks:");

        int n = c.nextInt();
        c.nextLine();

        for(int i=0;i<n;i++)
        {
            System.out.println(
            "Enter stock symbol:");

            String symbol = c.nextLine();

            System.out.println(
            "Enter number of shares:");

            int shares = c.nextInt();

            System.out.println(
            "Enter share price:");

            double price = c.nextDouble();

            c.nextLine();

            System.out.println(
            "Enter date and time:");

            String datetime = c.nextLine();

            s.buy(shares,symbol,price,datetime);
        }

        System.out.println(
        "\nEnter stock symbol to sell:");

        String sellsymbol = c.nextLine();

        System.out.println(
        "Enter shares to sell:");

        int sellshares = c.nextInt();

        s.sell(sellshares,sellsymbol);

        s.printReport();

        c.close();
    }
}