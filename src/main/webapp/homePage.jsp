<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.Content"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang ="en">

<% ArrayList<Content>al=(ArrayList<Content>)request.getAttribute("content"); 
//out.print(al);
int size=al.size();
if(size!=0){
	int id=al.get(0).getId();
	String name=al.get(0).getName();
	
}

%>


<head>
    <title>
        HomePage
    </title>
</head>
<style>
    img{
        width: 20%;
        
    }
.sec{
    display:flex;
    justify-content:space-between;
    align-items:center;
     
}
section{
    padding: 10px;
}

.orientation{
   margin-left: 10px;
    float: right;
    
}
.spn{
    float:right;
}


.flex{
        padding: 1rem;
        display: flex;
        gap: 2rem;
        align-content: space-between;
        
        flex-wrap: wrap;
       }
     .flex div{
        width: 6rem;
        background-color: rgb(231, 232, 209);
        border: 1px solid purple;
        border-radius: 7px;
        overflow: hidden;
      }
      p{
       font-size: x-small;
        word-wrap: break-word;
    overflow-wrap: break-word;
    line-height: 1em;

      }
      
     body{
     background-image:linear-gradient(rgb(81, 206, 206) ,white);
     }
     
</style>
<c:set  var="name" value="fan of Fam"/>

<c:set var="al" value="<%= al %>" />
<script type="text/javascript">
var getAllData=function(event){
	
        const id=event.target.id;
        
	window.location.href="ContentDetails?id="+encodeURIComponent(id);
	
	//window.location.href ="Controller"; 
//	var req=new XMLHttpRequest();
//	req.open("POST","Controller",true);
//	req.onreadystatechange=function(){
//		if(this.readyState==2 && this.status==400){
//			alert(this.responseText);
			
//		}
	//	req.send("category="+response);
	//}
	
	 //alert("Div tag Clicked !");
	 
}



function electronics(){
    window.location.href="LogIn?category=electronic applainces";
	
	
	//var httprequest=new XMLHttpRequest();
    //httprequest.open("POST","Controller",true);
    //httprequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    //httprequest.onreadystatechange=function(){
    	//if(this.readyState==4 && this.status==200)
    		//alert("Successful");
    	//document.getElementById("s").innerHTML=this.responseText;
    //}
    //httprequest.send("username=uday");
    //alert("${name}");
    
}

function homeApplainces(){
    window.location.href="LogIn?category=home applainces";
    }

function garments(){
	window.location.href="LogIn?category=garments";
    }

function home(){
	window.location.href="LogIn";
    }

function cart(){
	window.location.href="LogIn?category=cart";
    }


function fun(id,name,category){
    
    let sect=document.getElementById("se");
    for(let i=0;i<1;i++){
        let parent=document.createElement("div");
        parent.id=id;
    
    let child=document.createElement("p");
    let child_1=document.createElement("p");
    child.textContent="Id : "+id;
    child_1.textContent="Name : "+name;
    
     parent.appendChild(child);
     parent.appendChild(child_1);
     parent.onclick=getAllData;
    sect.appendChild(parent);
    }
    
   
}


</script>
<body>

    <h1></h1>
<section class="sec" >
<img src="Ecommerse.png" alt="logo photo" />
<div>
<input id="serch" type="text" placeholder="Serach" />
<button type="submit" class="butto" id="butt">Search</button>
</div>
<span class="spn" >Hello <%= ((String)session.getAttribute("username")).toUpperCase() %></span>
</section>
<section>
<button onclick="home()" class="oreintation">Home</button>
<button onclick="electronics()" class="oreintation">Electronics</button>
<button onclick="homeApplainces()" class="oreintation">Home Appliances</button>
<button onclick="garments()" class="oreintation">Garments</button>
<button onclick="cart()" class="orientation">Your Cart</button>
</section>

<section id="se" class ="flex">
<%int i=0;
for( i=0;i<size;i++){%>
	
	<script type="text/javascript">fun("<%=al.get(i).getId() %>","<%=al.get(i).getName() %>")</script>
<%}
%>
</section>

<div id="s"></div>
</body>

</html>