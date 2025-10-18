package com.wixsite.mupbam1.exception_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wixsite.mupbam1.exception_service.exceptions.CustomException;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        // Для проверки глобальной обработки
        throw new CustomException("Simulated exception in Exception Service");
    }
}
