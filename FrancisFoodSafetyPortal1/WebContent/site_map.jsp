<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta charset="utf-8">
<meta name = "format-detection" content = "telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="css/stuck.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/touchTouch.css">
<link rel="stylesheet" href="../../../../Desktop/Project/NetBeansProjects/build/web/css/grid.css" type="text/css"/>
<link rel="stylesheet" href="../../../../Desktop/Project/NetBeansProjects/build/web/css/grid.css" type="text/css">


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

<body class="page1" id="top">
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
          <div class="navigation">
            <nav>
              <ul class="sf-menu">
               <li><a href="index.jsp">Home</a></li>
               <li><a href="index-1.jsp">Restaurants</a></li>
               <li><a href="index-2.jsp">Report Problem</a></li>
               <li><a href="index-3.jsp">Blogs</a></li>
               <li><a href="index-4.jsp">Contacts</a></li>
               <li><a href="index-5.jsp">Keep your food safe</a></li>
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
<section class="content gallery pad1"><div class="ic">More Website Templates @ TemplateMonster.com - July 30, 2014!</div>
  <div class="container">
      <table style=" width: 800px" >
          <tr >
              <td >
                  <a href="index.jsp" >Home </a>
              </td>
              <td >
                  <a href="index-1.jsp" >Restaurant </a>
              </td>
              <td >
                  <a href="index-2.jsp" >Report problem </a>
              </td>
              <td >
                  <a href="index-3.jsp" >Blogs </a>
              </td>
              <td >
                  <a href="index-4.jsp" >Contact Us </a>
              </td>
          </tr>
          <tr>
              <td>
                  <ul></ul>
          <li><a href="admin_login.jsp">Admin Login</a></li>
          <li><a href="city_employee_login.jsp">City Employee Login</a></li>
          
              </td>
              <td>
                  <ul> <a href="#"> Search Restaurant</a></ul>
          <li> <a href="#"> search by Name</a></li>
          <li> <a href="#"> search by food</a></li>
          <li> <a href="#"> search by Rating</a></li>
          <li> <a href="#"> search by State</a></li>
          <li> <a href="#"> search by City</a></li>
              </td>
              <td rowspan="3"></td>
          </tr>
      </table>
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
        <div class="copyright"><span class="brand">Food Safety Portal </span> &copy; <span id="copyright-year"></span>  <div>Website designed by <a href="#">Francis Ekka</a></div>
        </div>
      </div>
    </div>
  </div> 
</footer> 
</body>
</html>


