package com.isj.ing4.Rest.Controller;

import com.isj.ing4.Rest.model.OperationRequest;
import com.isj.ing4.Rest.model.OperationResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calco")
public class CalculatriceController {

    @GetMapping("/add/op1/{x}/op2/{y}")
    public float add(@PathVariable ("x") float x,@PathVariable("y") float y){
        return x+y;
    }
    @PostMapping("/add")
    public @ResponseBody OperationResponse addPost(@RequestBody OperationRequest request){
        OperationResponse operationResponse=new OperationResponse();
        operationResponse.setResult(request.getOp1()+request.getOp2());
        return operationResponse;
    }
    @GetMapping("/soustraction/op1/{x}/op2/{y}")
    public float soustraction(@PathVariable ("x") float x,@PathVariable("y") float y){
        return x-y;
    }

    @PostMapping("/soustraction")
    public @ResponseBody OperationResponse soustPost(@RequestBody OperationRequest request){
        OperationResponse operationResponse=new OperationResponse();
        operationResponse.setResult(request.getOp1()-request.getOp2());
        return operationResponse;
    }
    @GetMapping("/division/op1/{x}/op2/{y}")
    public float div(@PathVariable ("x") float x,@PathVariable("y") float y){
        return x/y;
    }
    @PostMapping("/div")
    public @ResponseBody OperationResponse divPost(@RequestBody OperationRequest request){
        OperationResponse operationResponse=new OperationResponse();
        operationResponse.setResult(request.getOp1()/request.getOp2());
        return operationResponse;
    }
    @PostMapping("/multi")
    public @ResponseBody OperationResponse multiPost(@RequestBody OperationRequest request){
        OperationResponse operationResponse=new OperationResponse();
        operationResponse.setResult(request.getOp1()*request.getOp2());
        return operationResponse;
    }
    @GetMapping("/multiplication/op1/{x}/op2/{y}")
    public float multiplication(@PathVariable ("x") float x,@PathVariable("y") float y){
        return x*y;
    }


}
