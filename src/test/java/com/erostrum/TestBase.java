package com.erostrum;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void setup(){

        TestBase.setBaseURI("https://reqres.in");
    }

    public static void setBaseURI(String baseURI)
    {
        RestAssured.baseURI=baseURI;


    }
}
