<!DOCTYPE html>
<html lang="en">
<head>
<title>city employee home</title>
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
                        <li><h2><a href="city_employee_home.jsp">City Employee Home</a></h2></li>
                        
                    </ul>
                </div>
          
                <div class="submenu">
                   <ul>
                       <li class="current1"><h2><a href="#">New Entries</a></h2></li>
                        <li class="current2"><a href="c_entry_new_resto.jsp">Restaurants</a></li>
                    </ul>
                </div>
                <br/><br/>
                <div class="submenu">
                    <ul>
                    <li><h2><a href="#">Views</a></h2></li>
                    <li><a href="c_view_resto">Restaurants</a></li>
                    <li><a href="c_view_report">Reports</a></li>
                    <li><a href="c_view_user">User</a></li>
                    <li><a href="c_view_sugg">Suggestions</a></li>
                    </ul>
                </div>
                
                <a href="city_employee_edit"><font style=" color:  springgreen">Edit Profile</font></a>
                <br/>
                <a href="logout"><font style=" color: tomato">Logout</font></a>
                    
            </div>
      </div>
      <div class="right_content">
          <a><h1 align="center"><font style="font-size: 16px">Menu</font></h1></a><br/><br/><br/>
          <table style="text-align: center; width:600px; height: 400px">
              <tr>
                  <td><a href="city_employee_edit"><img src="images/edit.png"><br/>Edit<br/></a></td>
                  <td><a href="c_entry_new_resto.jsp"><img src="images/add_resto.png"><br/>Add Restaurant<br/></a></td>
                  <td><a href="c_view_sugg"><img src="images/view_sugg.png"><br/>View Suggestion<br/></a></td>
              </tr>
              <tr>
                  <td><a href="c_view_report"><img src="images/view_report.png"><br/>View Report<br/></a></td>
                  <td><a href="c_view_resto"><img src="images/view_resto.png"><br/>View Restaurant<br/></a></td>
                  <td><a href="c_view_user"><img src="images/view_user.png"><br/>View User<br/></a> </td>
              </tr>
              
          </table>
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