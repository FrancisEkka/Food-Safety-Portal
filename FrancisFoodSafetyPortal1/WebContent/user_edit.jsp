<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="css/style_1.css" type="text/css"/>
    <link rel="stylesheet" href="css/niceforms-default.css" type="text/css">
   <link rel="stylesheet" href="css/ie.css" type="text/css"/>
   
<title>User Edit</title>

</head>
    <body class="b">
<div id="main_container">

	<div class="header_login">
    <div class="logo"><img src="images/logo.png" alt="" title="" border="0" height="70" width="130"/></div>
    
    </div>

     
         <div class="login1_form">
         
         <h3>User Edit Form</h3>
         
         
         <form name="f1" action="" method="post">
         
                <fieldset>
                     <dl>
                        <dt><label >Name:</label></dt>
                        <dd><input type="text" name="name" id="name_id" size="54"  maxlength="30" readonly required pattern="[a-zA-Z ]+" title="only alphabet and space"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                    <dl>
                        <dt><label >Password:</label></dt>
                        <dd><input type="password" name="pass" id="pass_id" size="54" required/><font color="#FF0000"></font>
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Email Id:</label></dt>
                        <dd><input type="text" name="email" id="email_id" size="54" readonly required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Mobile:</label></dt>
                        <dd><input type="text" name="mobile" id="mobile_id" size="54" required pattern="[0-9]{10}" size="54" maxlength="10" required title="valid mobile no"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >State:</label></dt>
                        <dd><input type="text" name="state" id="state_id" size="54" required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >City:</label></dt>
                        <dd><input type="text" name="city" id="city_id" size="54" required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                    
                     <dl class="submit">
                         <input type="submit" name="submit" id="submit" value="Enter" />
                     </dl>
                    
                </fieldset>
                
         </form>
         </div>  
          
	
    
    <div class="footer_login">
    
    	<div class="left_footer_login">Food Safety Portal | Powered by Francis Ekka</div>
    	<div class="right_footer_login"><img src="images/logo.png" alt="" title="" border="0" height="70" width="130" /></div>
    
    </div>

</div>		
</body>
</html>

