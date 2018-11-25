package com.zoe.springboot.mapper;


import java.util.List;

import com.zoe.springboot.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

 
    List<Member> findAll();


}