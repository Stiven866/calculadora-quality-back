package io.quind.calculator.service;


import io.quind.calculator.model.Resultado;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class CalculatorContoller {


    @RequestMapping("/suma")
    public Resultado addGetRequest(@RequestParam(name="num1", defaultValue = "0") float numero1, @RequestParam(name="num2", defaultValue = "0") float numero2) {
        Resultado suma = new Resultado();

        if(numero2==0.0){
            suma.setResult("error matematico");
            suma.setStatus("falla");
            return suma;
        }else {
            suma.setResult(String.valueOf(numero1+numero2));
            suma.setStatus("ok");
            return suma;
        }

    }
}
