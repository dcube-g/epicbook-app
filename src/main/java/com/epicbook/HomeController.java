package com.epicbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


@GetMapping("/")
public String home() {
    return "EpicBook Application Running";
}


}
