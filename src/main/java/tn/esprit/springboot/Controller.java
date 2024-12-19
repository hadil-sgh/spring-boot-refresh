package tn.esprit.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello ";
    }

    @GetMapping("/hello2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    // NOTE:
    // 📝 It is always recommended to tailor the response  status to the methods
    public String sayHello2() {
        return "Hello2 ";
    }

    @PostMapping("/post")
    public String postMethodTest(
            @RequestBody String message
    ) {
        return "This attempt is successfully Congrats " + message;
    }

    @PostMapping("/post-order")
    public String postOrder(
            @RequestBody Order order
    ) {
        return order.toString() + ": This order Request has been accepted successfully !!";
    }

    @PostMapping("/post-order-record")
    public String postOrderRecord(
            @RequestBody OrderRecord order
    ) {
        return order.toString() + ": This order Request has been accepted successfully !!";
    }

    //FACT:
    // ✅ Used when the value is a part of the URL
    // Example : http://localhost:8080/path/hadil03
    @GetMapping("/path/{user-name}")
    public String pathVariable(
            @PathVariable("user-name") String userName
    ) {
        return "My value =" + userName;
    }

    //FACT:
    // Used when the value is passes as a Query param
    // Example : http://localhost:8080/hello?param_name1=paramvalue2&param_name2=paramvalue2
    @GetMapping("/hello")
    public String paramVariable(
            @RequestParam("user-name") String userName,
            @RequestParam("user-lastName") String lastName
    ) {
        return "Hello =" + userName + " " + lastName;
    }


}
