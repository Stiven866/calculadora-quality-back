package io.quind.calculator.service;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class CalculatorContoller {


    @RequestMapping("/suma")
    public String addGetRequest(@RequestParam(name="num1", defaultValue = "0") float numero1, @RequestParam(name="num2", defaultValue = "0") float numero2){


        if(numero2 == 0.0){
            return "Error matematico";
        }else {
            float result = numero1 + numero2;
            return String.valueOf(result);
        }

    }

}
