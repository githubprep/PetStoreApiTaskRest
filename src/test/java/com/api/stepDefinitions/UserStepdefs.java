package com.api.stepDefinitions;

import com.api.pojo.PostUser;
import com.api.utilities.ResponseInstance;
import com.api.utilities.RestAssuredExt;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;


public class UserStepdefs extends ResponseInstance {

    String methodName;
    Map<String, String> pathParams = new HashMap<>();

    @Given("the user sets body")
    public void theUserSetsBody(Map<String, String> expectedList) {

        PostUser postUser = new PostUser();
        postUser.setId(Integer.valueOf(expectedList.get("id")));
        postUser.setUsername(expectedList.get("username"));
        postUser.setFirstName(expectedList.get("firstname"));
        postUser.setLastName(expectedList.get("lastname"));
        postUser.setEmail(expectedList.get("email"));
        postUser.setPassword(expectedList.get("password"));
        postUser.setPhone(expectedList.get("phone"));
        postUser.setUserStatus(Integer.valueOf(expectedList.get("userStatus")));

        Gson gson = new Gson();

        switch (methodName){

            case "POST":
                response = restAssuredExt.ExecuteWithBody("[" + gson.toJson(postUser) + "]");
                break;

            case "PUT":
                response = restAssuredExt.ExecuteWithBody( gson.toJson(postUser) );
                break;
        }


    }


    @Given("the user sets Url {string} and method {string}")
    public void theUserSetsUrlAndMethod(String uri, String method)  {
        methodName=method;
        restAssuredExt = new RestAssuredExt(method, uri);

    }

    @Then("the user sees status code {int}")
    public void theUserSeesStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }



    @And("the user sends the request with path param {string}")
    public void theUserSendsTheRequestWithPathParam(String pathParam) {
        pathParams.put("username",pathParam);
        response=restAssuredExt.ExecuteWithPathParams(pathParams);
    }

    @Then("the user sees the value {string} in response body")
    public void theUserSeesTheValueInResponseBody(String value) {
        Assert.assertTrue(response.getBody().asString().contains(value));
    }



}
