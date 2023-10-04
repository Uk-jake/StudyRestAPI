package com.springboot.makingRestAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    //http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }

    //매개변수가 없는 GET 메서드 구현
    @GetMapping(value = "/name")
    public String getName(){
        return "Jake";
    }

    //@PathVariable을 활용한 GET 메서드 구현
    //{여기 있는 값}을 값을 받아 반환한다.
    @GetMapping("/variable1/{variable}")
    public String getVarialbe(@PathVariable String variable){
        return variable;
    }

    //{여기있는 값}의 변수명을 아래와 같이 치환해서 사용할 수 있다.
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    //@RequestParma을 활용하여 키 + 값 반환하기
    //http://localhost:8080/api/v1/get-api/request1?name=value1&email=value&organization=value3
    @GetMapping(value = "/request1")
    public String getRequestParma1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
        return "name : " + name + "\nemail : " + email + "\norganization : " + organization;
    }
}
