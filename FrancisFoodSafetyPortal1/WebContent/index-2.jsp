<!DOCTYPE html>
<html lang="en">
<head>
<title>Report Problem</title>
<meta charset="utf-8">
<meta name = "format-detection" content = "telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="booking/css/booking.css">
<link rel="stylesheet" href="css/stuck.css">
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/script.js"></script> 
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/tmStickUp.js"></script>
<script src="js/jquery.ui.totop.js"></script>
    <script src="booking/js/booking.js"></script>

<script>
 $(document).ready(function(){

  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});

  }); 
</script>
<script>
function fun() {
    confirm("you will recived a verification email containing registration code");
}
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
               <li class="current"><a href="index-2.jsp">Report Problem</a></li>
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
<section class="content">
  <div class="container">
    <div class="row">
      <div class="grid_8">
        <h2>Express your view</h2>
        <img src="images/11.jpg" alt="" class="img_inner fleft inn__1">
        <div class="extra_wrapper">
          <div class="text1 tx__1"><a href="#">We would welcome suggestions and complains </a></div>
          <form name="f1" action="report_problem" method="post" onSubmit="return fun();">
                <fieldset>
                     <dl>
                        <dt><label >Name:</label></dt>
                        <dd><input type="text" name="name" id="name_id" size="54" required maxlength="30" required pattern="[a-zA-Z ]+" title="only alphabet and space"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Email Id:</label></dt>
                        <dd><input type="email" name="email" id="email_id" size="54" required /><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Mobile:</label></dt>
                        <dd><input type="text" name="mobile" id="mobile_id" size="54" required pattern="[0-9]{10}" size="54" maxlength="10" required title="valid mobile no"/><font color="#FF0000"></font>						
						</dd>
                    </dl>
                     <dl>
                        <dt><label >Problem</label></dt>
                        <dd><textarea name="problem" maxlength="200" style=" height:100px; width: 340px;" required></textarea><font color="#FF0000"></font>						
						</dd>
                    </dl><br/>
                    
                     <dl class="submit">
                         <input type="submit" name="submit" id="submit" value="submit" /> &nbsp;&nbsp;&nbsp;&nbsp;
                         <input type="reset" name="clear" value="clear"/>
                     </dl>
                    
                </fieldset>
                
         </form>
        </div>
        <div class="clear"></div>
        
      </div>
      <div class="grid_4">

      </div>
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
        <div class="copyright"><span class="brand">Food Safety Portal </span> &copy; <span id="copyright-year"></span>  <div>Website designed by <a href="#">Francis Ekka</a></div>
        </div>
      </div>
    </div>
  </div> 
</footer>  
</body>
</html>

