package com.erostrum;

import io.restassured.RestAssured;

public class TestBase {

    public static void  setBaseURI(String baseURI
    {
        RestAssured.baseURI=baseURI;


    }
}
