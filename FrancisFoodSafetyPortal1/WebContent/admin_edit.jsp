<!DOCTYPE html>
<html lang="en">
<head>
<title>Edit Admin</title>
<meta charset="utf-8">
<meta name = "format-detection" content = "telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="css/stuck.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/touchTouch.css">
<link rel="stylesheet" href="css/style_1.css" type="text/css"/>
<link rel="stylesheet" href="css/niceforms-default.css" type="text/css">
<link rel="stylesheet" href="css/niceforms-default.css" type="text/css"/>



<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/script.js"></script> 
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/tmStickUp.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script src="js/touchTouch.jquery.js"></script>

<script>
 $(document).ready(function(){

  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});
  $('.gallery .gall_item').touchTouch();

  }); 
</script>

</head>

<body>
<!--==============================
              header
=================================-->
<header>
<!--==============================
            Stuck menu
=================================-->
  <section id="stuck_container">
    <div class="container">
      <div class="row">
        <div class="grid_12">
        <h1>
          <a href="index.jsp">
              <img src="images/logo.png" alt="Logo alt" height="150" width="200">
          </a>
        </h1>  
          <div class="navigation ">
            <nav>
              <ul class="sf-menu">
               <li><a href="index.jsp">Home</a></li>
               <li><a href="index-1.jsp">Restaurants</a></li>
               <li><a href="index-2.jsp">Report Problem</a></li>
               <li><a href="index-3.jsp">Blogs</a></li>
               <li><a href="index-4.jsp">Contacts</a></li>
             </ul>
            </nav>       
            <div class="clear"></div>
          </div>
        </div>
      </div>
    </div>
  </section> 
</header>        

<!--=====================
          Content
======================-->
<section class="content gallery pad1">
  <div class="container">
      <div class="left_content">
          
            <div class="sidebarmenu">
                <div class="submenu">
                    <ul>
                        <li><h2><a href="admin_home.html">Admin Home</a></h2></li>
                        
                    </ul>
                </div>
                <br/><br/>
          
                <div class="submenu">
                    <ul>
                        <li><h2><a href="#">New Entries</a></h2></li>
                        <li><a href="entry_new_city_employee.jsp">City Employee</a></li>
                    <li><a href="entry_new_resto.jsp">Restaurants</a></li>
                    </ul>
                </div>
                <br/><br/>
                <div class="submenu">
                    <ul>
                    <li><h2><a href="#">Views</a></h2></li>
                    <li><a href="view_user">User</a></li>
                    <li><a href="view_resto">Restaurants</a></li>
                    <li><a href="view_report">Reports</a></li>
                    <li><a href="view_city_employee">Comments</a></li>
                    <li><a href="view_sugg.jsp">Suggestions</a></li>
                    </ul>
                </div>
                
                <a href="admin_edit"><font style=" color:  springgreen">Edit Profile</font></a>
                <br/>
                <a href="logout"><font style=" color: tomato">Logout</font></a>
                    
            </div>
      </div>
      
      <%
                   
                  String id=(String)session.getAttribute("id");
                  String pw=(String)session.getAttribute("pw");
                  String email=(String)session.getAttribute("email");
                  String mobile=(String)session.getAttribute("mobile");
                  String city=(String)session.getAttribute("city");
                  String state=(String)session.getAttribute("state");
                  
                   %>
      
      <div class="right_content">
          <a><h1 align="center"><font style="font-size: 16px">Edit Admin</font></h1></a><br/><br/><br/>
          <form name="f1" action="admin_edit_save" method="post">
         
                <fieldset>
                    
                     <dl>
                        <dt><label >Name:</label></dt>
                        <dd><input type="text" name="name" id="name_id" size="54" value="<%out.println(id);%>" readonly required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                    <dl>
                        <dt><label >Password:</label></dt>
                        <dd><input type="password" name="pass" id="pass_id" size="54" value="<%out.println(pw);%>" required /><font color="#FF0000"></font>
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Email Id:</label></dt>
                        <dd><input type="email" name="email" id="email_id" size="54" value="<%out.println(email);%>" readonly required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Mobile:</label></dt>
                        <dd><input type="text" name="mobile" id="mobile_id" size="54" value="<%out.println(mobile);%>" required pattern="[0-9]{10}" size="54" maxlength="10" required title="valid mobile no"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >State:</label></dt>
                        <dd><input type="text" name="state" id="state_id" value="<%out.println(state);%>" size="54" required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >City:</label></dt>
                        <dd><input type="text" name="city" id="city_id" value="<%out.println(city);%>" size="54" required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                    
                     <dl class="submit">
                         <input type="submit" name="submit" id="submit" value="Enter" />
                     </dl>
                    
                </fieldset>
                
         </form>
                        <%
                        session.removeAttribute("city");
                        session.removeAttribute("state");
                        session.removeAttribute("mobile");
                        %>
      </div>
  </div>
</section>
<!--==============================
              footer
=================================-->
<footer id="footer">
  <div class="container">
    <div class="row">
      <div class="grid_12">  
        <div class="socials">
          <a href="site_map.jsp">Site Map</a>

        </div>
        <div class="copyright"><span class="brand">Food Safety Portal </span> &copy; <span id="copyright-year"></span> | <a href="#">Privacy Policy</a> <div>Website designed by <a href="#">Francis Ekka</a></div>
        </div>
      </div>
    </div>
  </div> 
</footer> 
</body>
</html>