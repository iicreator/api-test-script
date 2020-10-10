package ren.eatbox.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ren.eatbox.request.LoginRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: HalaTestService
 * @Description: TODO
 **/
@Service
public class DemoService {
    private static final String HOST = "http://127.0.0.1:30000";
    private static final String API_LOGIN = HOST + "/users/login";


    @Autowired
    private RestTemplate restTemplate;

    public void testLogin(){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("test_agent");
        loginRequest.setPassword("test123");
        String resp = restTemplate.postForObject(API_LOGIN, loginRequest, String.class);
        System.out.println(resp);
    }
}
