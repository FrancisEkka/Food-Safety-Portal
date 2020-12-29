<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="css/style_1.css" type="text/css"/>
    <link rel="stylesheet" href="css/niceforms-default.css" type="text/css">
    <link rel="stylesheet" href="css/ie.css" type="text/css"/>

<title>Admin login</title>


</head>
    <body class="b">
<div id="main_container">

	<div class="header_login">
    <div class="logo"><img src="images/logo.png" alt="" title="" border="0" height="250" width="650"/></div>
    
    </div>

     
         <div class="login_form">
         
         <h3>Admin Panel Login</h3>
         
         
         <form name="adminf1" action="admin_login" method="post">
         
                <fieldset>
                    <dl>
                        <dt><label >Username:</label></dt>
                        <dd><input type="text" name="id" id="user_id" size="54" required/><font color="#FF0000"><?php echo $per;?></font>						
						</dd>
                    </dl>
                    <dl>
                        <dt><label >Password:</label></dt>
                        <dd><input type="password" name="pw" id="pass_id" size="54" required/><font color="#FF0000"><?php echo $error; echo $fer;?></font>
						</dd>
                    </dl>
                    
                    <dl>
                        <dt><label></label></dt>
                        <dd>
                    <input type="checkbox" name="interests[]" id="" value="" /><label class="check_label">Remember me</label>
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

