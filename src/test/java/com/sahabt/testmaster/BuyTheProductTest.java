package com.sahabt.testmaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuyTheProductTest  extends Base{

    @Test
    public void Buying(){

            //     new LogIn(webDriver).LoggingIn("ali.aktolun@sahabt.com", "12345a", "Daniel Wellington 0209Dw Erkek Kol Saati");
            //      new LogIn(webDriver).Searching("Daniel Wellington 0209Dw Erkek Kol Saati");

            new BuyTheProduct(webDriver).LogIn("ali.aktolun@sahabt.com","12345a","Daniel Wellington 0209Dw Erkek Kol Saati");

        }

    }
