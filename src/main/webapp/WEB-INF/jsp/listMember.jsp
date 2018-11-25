<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>member_ID</td>
        <td>member_name</td>
        <td>member_password</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.member_ID}</td>
            <td>${c.member_name}</td>
            <td>${c.member_password}</td>
                
        </tr>
    </c:forEach>
</table>