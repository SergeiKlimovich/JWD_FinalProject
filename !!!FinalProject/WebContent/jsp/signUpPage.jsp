<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />

<style>
.form-group{
 margin-bottom: 15px;
}
label{
 margin-bottom: 15px;
}
input,
input::-webkit-input-placeholder {
 font-size: 11px;
 padding-top: 3px;
}
.form-control {
 height: auto!important;
padding: 8px 12px !important;
}
.input-group {
 box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
}
#button {
 border: 1px solid #ccc;
 margin-top: 28px;
 padding: 6px 12px;
 color: #666;
 text-shadow: 0 1px #fff;
 cursor: pointer;
 border-radius: 3px 3px;
 box-shadow: 0 1px #fff inset, 0 1px #ddd;
 background: #f5f5f5;
 background: -moz-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
 background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #f5f5f5), color-stop(100%, #eeeeee));
 background: -webkit-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
 background: -o-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
 background: -ms-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
 background: linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
 filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f5f5f5', endColorstr='#eeeeee', GradientType=0);
}
.main-form{
 margin-top: 30px;
 margin: 0 auto;
 max-width: 400px;
 padding: 10px 40px;
background:#009edf;
color: #FFF;
text-shadow: none;
box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);
}
span.input-group-addon i {
 color: #009edf;
 font-size: 17px;
}
.login-button{
 margin-top: 5px;
}
</style>
<%
	String message = request.getParameter("message");
if (message != null) {
%>
<font color="red"> <%
 	out.write(message);
 }
 %>
</font>
 <div class="container">
 <div class="row main-form">
 <form action="Controller" method="post">
 
 <div class="form-group">
 <label for="name" class="cols-sm-2 control-label">Your Name</label>
 <div class="cols-sm-10">
 <div class="input-group">
 <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
 <input type="text" class="form-control" name="name" id="name" placeholder="Enter your Name"/>
 </div>
 </div>
 </div>

<div class="form-group">
 <label for="surname" class="cols-sm-2 control-label">Surname</label>
 <div class="cols-sm-10">
 <div class="input-group">
 <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
 <input type="text" class="form-control" name="surname" id="surname" placeholder="Enter your Surname"/>
 </div>
 </div>
 </div>

<div class="form-group">
 <label for="phone" class="cols-sm-2 control-label">Your Phone</label>
 <div class="cols-sm-10">
 <div class="input-group">
 <span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span>
 <input type="text" class="form-control" name="phone" id="phone" placeholder="Enter your Phone"/>
 </div>
 </div>
 </div>

 <div class="form-group">
 <label for="email" class="cols-sm-2 control-label">Your Email</label>
 <div class="cols-sm-10">
 <div class="input-group">
 <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
 <input type="text" class="form-control" name="email" id="email" placeholder="Enter your Email"/>
 </div>
 </div>
 </div>

 <div class="form-group">
 <label for="address" class="cols-sm-2 control-label">Your Address</label>
 <div class="cols-sm-10">
 <div class="input-group">
 <span class="input-group-addon"><i class="fa fa-home" aria-hidden="true"></i></span>
 <input type="text" class="form-control" name="address" id="address" placeholder="Enter your Address"/>
 </div>
 </div>
 </div>


 <div class="form-group ">
 <a href="Controller?command=sign_up_ok_command" target="_blank" type="button" id="button" class="btn btn-primary btn-lg btn-block login-button">Sign Up</a>
 </div>
 
 </form>
 
 
 </div>
 </div>