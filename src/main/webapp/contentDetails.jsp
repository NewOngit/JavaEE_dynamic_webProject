<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Content,java.util.*,serviceController.ContentServiceProvider"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% ArrayList<Content> al=(ArrayList<Content>)request.getAttribute("content");
ContentServiceProvider contentServiceProvider=new ContentServiceProvider();
int id=0;	
if(contentServiceProvider.getCart().contains(al.get(0)))
		id=1;

%>
<c:set var="id" value="<%= al.get(0).getId()%>"/>
<c:set var="name" value="<%= al.get(0).getName()%>"/>
<c:set var="qty" value="<%= al.get(0).getQuantity()%>"/>
<c:set var="desc" value="<%= al.get(0).getDescription()%>"/>
<c:set var="category" value="<%= al.get(0).getCategories()%>"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

button{
    background-color: rgb(223, 193, 22);
    border: 0px;
    border-radius: 10px;
    width:16px;
    height:28px;
    
}
.flx{
display :flex;
flex-direction:column;
align-items:center;
justify-content:center;
flex-wrap:wrap;
gap:1rem;
}
    </style>
    
    <script>
    function addToCart(id){
    	let id=event.target.id;
    
    	var  req=new XMLHttpRequest();
    	req.open("POST","AddToCart",true);
    	req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    	req.onreadystatechange=function(){
    		if(this.readyState==4 && this.status==200)
    			alert(this.responseText);
    	}
    	if(id==1)
    	req.send("id="+id+"&category=add");
    	else
    		req.send("id="+id+"&category=remove");
    	
    }
    
    
    function  changeButton(){
    	let i=0;
    	if("<%= id%>"==i){
    		document.getElementById("1").id=0;
    		document.getElementById("0").innerHTML="";
    		document.getElementById("0").innerHTML="Remove from cart";
    	}
    		
    }
    
    
    </script>
    
    
</head>
<body>
<script>changeButton();</script>
<main class="flex">
    <section class="flx">
        <img src="" alt="this is a content"/>
                <span>name : <%=al.get(0).getName() %>" </span><span>quantity : <%=al.get(0).getQuantity() %></span>
        <span>description : <%= al.get(0).getDescription()%></span>

<button id="1" onclick="addToCart(<%= al.get(0).getId()%>)">Add to Cart</button>
    </section>
    
</main>
    
</body>
</html>