package com.example.workflow.controller;


import com.example.workflow.service.CamundaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CamundaController {

    @Autowired
    CamundaService service;

    @GetMapping("/process-instance/{processKey}")
    public void getCamunda(@PathVariable String processKey){
        service.getProcess(processKey);
    }

    @GetMapping("/process-instance/getEmployee/{varName}")
    public String getEmployee(@PathVariable String varName){
        return service.getEmployeeDetails(varName);
    }
}
