package com.sachin.serverless;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class HelloWorld implements Function<APIGatewayProxyRequestEvent,APIGatewayProxyResponseEvent>{

    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {
        APIGatewayProxyResponseEvent apiGatewayProxyResponseEvent=new APIGatewayProxyResponseEvent();
        apiGatewayProxyResponseEvent.setStatusCode(200);
        apiGatewayProxyResponseEvent.setBody("Hello !! Reached Spring Cloud Function with message "+apiGatewayProxyRequestEvent.getBody());

        return apiGatewayProxyResponseEvent;
    }
}
