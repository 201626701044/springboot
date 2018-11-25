package com.zoe.springboot.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @Autowired
    com.zoe.springboot.mapper.MemberMapper memberMapper;
     
    @RequestMapping("/listMember")
    public String listMember(Model m) throws Exception {
        List<com.zoe.springboot.pojo.Member> cs=memberMapper.findAll();
         
        m.addAttribute("cs", cs);
         
        return "listMember";
    }
     
}