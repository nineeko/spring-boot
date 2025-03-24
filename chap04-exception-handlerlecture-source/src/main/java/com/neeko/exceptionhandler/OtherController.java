package com.neeko.exceptionhandler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherController {

    @GetMapping("/other-controller-null")
    public String nullPointerExceptionTest() {
        String str = null;
        System.out.println(str.charAt(0));  // 의도적으로 NullPointerException 발생 시킴
        return "/";
    }

    @GetMapping("/other-controller-user")
    public String arrayExceptionTest() throws MemberRegistException {

        double[] arr = new double[0];
        System.out.println(arr[0]);
        return "/";
    }
}
