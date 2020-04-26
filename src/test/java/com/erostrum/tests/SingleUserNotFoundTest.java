package com.erostrum.tests;

import com.erostrum.TestBase;
import com.erostrum.constatnts.Endpoints;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class SingleUserNotFoundTest extends TestBase {

    @Test
    public void testSingleUserNotFound()
    {
        //String url = "https://reqres.in/api/users/2";

        //baseURI="https://reqres.in";
        String url=Endpoints.SINGLE_USER_NOT_FOUND_ENDPOINT;
        given().contentType(ContentType.JSON).
                when().get(url).
                then().statusCode(404);

    }



}
