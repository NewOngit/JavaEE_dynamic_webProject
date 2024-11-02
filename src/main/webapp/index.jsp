<!DOCTYPE html>
<html>
<head>
<title>

</title>
<meta  charset="utf-8"/>
<style>
*{
padding:0;
margin:0;} 
div{
    border: 0px ;
    padding-bottom: 10px;
}
html,body,.parent{
    height:100%;
}
.parent{
    display: flex;
    align-items: center;
    justify-content: center;
}

.container{
    padding: 20px;
    border: 0.1px solid black;
    border-radius: 15px;
    border-image: linear-gradient(to right, #3acfd5 0%, #3a4ed5 100%) 1;
    display: flex;
    flex-direction: column;
    align-items: center;
    
    
}


.box1{
flex:1;
}
.box2{
flex:1;
}
.box3{
flex:1;
}

.box4{
    flex:1;
}
.form_box{
    display:flex;
    flex-direction: column;
    align-items: center;
}

</style>

<script>


</script>


</head>

<body  class="parent">

    <div class ="container">
<div class="box1">
<h2>Welcome to MJPRU  !</h2>

</div>
<form action="LogIn" method="post" class ="form_box">
<div class="box2">
    
<input type="text" name="username" placeholder="username"/>

</div>
<div class="box3">
<input name="password" type="text" placeholder="password"/>
</div>

<div class="box4">
    <input type="submit" value="Log in"/>
</div>
</form>
<p><a href="www.google.com/">Forgot password ?</a> | <a href="bing.com/">Sign Up</a></p>
</div>


</body>

</html>