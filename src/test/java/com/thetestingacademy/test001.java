package com.thetestingacademy;

import io.restassured.RestAssured;

public class test001 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Rest assured test case");
        System.out.println("Get Request Demo");
        //gherkins  syntax request
        // given()-url,headers,body or payload
        // when() -http methods-get,post,patch,put,delete  body/payload-json,xml,txt,file doc,excel
        // then()-verify the response - er ==ar
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1").log().all()
                .when()
                    .get()
                .then()
                .statusCode(201);


    }
}
