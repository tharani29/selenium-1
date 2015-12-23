package org.sayem.api;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by sayem on 12/7/15.
 */
public class DeleteAdapter implements RestAdapter {

    @Override
    public JsonPath execute() {
        Response response = given()
                .log().all(true)
                .baseUri("")
                .contentType("")

                .expect()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .log().all(true)

                .when()
                .delete("");

        String json = response.asString();
        return new JsonPath(json);
    }
}
