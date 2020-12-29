<!DOCTYPE html>
<html lang="en">
<head>
<title>Edit Restaurant</title>
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
                        <li><h2><a href="#">New Entries</a></h2></li>
                        <li><a href="entry_new_user.jsp">User</a></li>
                    <li><a href="entry_new_resto.jsp">Restaurants</a></li>
                    </ul>
                </div>
                <br/><br/>
                <div class="submenu">
                    <ul>
                    <li><h2><a href="#">Views</a></h2></li>
                    <li><a href="view_user.jsp">User</a></li>
                    <li><a href="view_resto.jsp">Restaurants</a></li>
                    <li><a href="view_report.jsp">Reports</a></li>
                    <li><a href="view_comment.jsp">Comments</a></li>
                    <li><a href="view_sugg.jsp">Suggestions</a></li>
                    </ul>
                </div>
                
                <a href="admin_edit.jsp"><font style=" color:  springgreen">Edit Profile</font></a>
                <br/>
                <a href="logout"><font style=" color: tomato">Logout</font></a>
                    
            </div>
      </div>
      <div class="right_content">
          <a><h1 align="center"><font style="font-size: 16px">Edit Restaurant</font></h1></a><br/><br/><br/>
          <form name="f1" action="" method="post">
         
                <fieldset>
                    <dl>
                        <dt><label >Restaurant Name:</label></dt>
                        <dd><input type="text" name="name" id="name_id" size="54" maxlength="30" required pattern="[a-zA-Z ]+" title="only alphabet and space"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Restaurant Address:</label></dt>
                        <dd><input type="text" name="address" id="add_id" size="54" required pattern="[a-zA-Z0-9\- ]+" title="only aplhanumeric characters,- and space"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                    <dl>
                        <dt><label >Restaurant Contacts:</label></dt>
                        <dd><input type="text" name="contact" id="contact_id" size="54" required pattern="[0-9]{10}" size="54" maxlength="10" required title="valid mobile no"/><font color="#FF0000"></font>
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Restaurant URL:</label></dt>
                        <dd><input type="url" name="url" id="url_id" size="54" required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Restaurant Email Id:</label></dt>
                        <dd><input type="text" name="email" id="email_id" size="54" required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Restaurant Ratings:</label></dt>
                        <dd><input type="range" name="rating" id="rating_id" size="54" min="0" max="5"  required/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                    <dl>
                        <dt><label >Restaurant famous food:</label></dt>
                        <dd><input type="text" name="famous" id="famous_id" size="54" required pattern="[a-zA-Z ]+" title="only alphabet and space"/><font color="#FF0000"></font>						
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