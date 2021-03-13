package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Main {

    public static void main(String[] args) {
	    customer[] customers = {
	            new customer("0013","490","0","490"),
                new customer("0052","1000","100","900"),
                new customer("0081","290","0","290"),
                new customer("2122","2000","200","1800"),
        };
	    for(int i=0;i<4;i++)
        {
            customers[i].print();
        }
    }
    static class customer
    {
        String number;
        String cash;
        String good;
        String price;
        public customer(String a, String b, String c, String d){
            this.number = a;
            this.cash = b;
            this.good = c;
            this.price = d;
        }
        public void print()
        {
            System.out.println(number+"\t"+cash+"\t"+good+"\t"+price+"\t");
        }
    }
}
