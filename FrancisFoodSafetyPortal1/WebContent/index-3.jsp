<!DOCTYPE html>
<html lang="en">
<head>
<title>Blogs</title>
<meta charset="utf-8">
<meta name = "format-detection" content = "telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
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

<script>
 $(document).ready(function(){

  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});

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
               <li class="current"><a href="index-3.jsp">Blogs</a></li>
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
      <div class="grid_7">
        <div class="blog">
          <div class="blog_title"><a href="#">Prevent Swine Flu </a></div>
          <img src="images/swineflu3.jpg" alt="">
          
          
        </div>
        <div class="blog">
          <div class="blog_title"><a href="#">More Blogs </a></div>
          <img src="images/swineflu1.jpg" alt=""height="268" width="365" >
          
          
          
        </div>
        <div class="blog">
          <div class="blog_title"><a href="#">Related Articles </a></div>
          <img src="images/swineflu2.jpg" alt="">
          
        </div>
      </div>
      <div class="grid_4 preffix_1">
        <h2>Categories</h2>
        <ul class="list">
          <li><a href="blogs1.html">Swine Flu </a></li>
          <li><a href="blogs2.html">Bird Flu </a></li>
          <li><a href="blogs3.html">Food Safety Practices</a></li>
          <li><a href="blogs4.html">Dos n Donts </a></li>
          <li><a href="blogs5.html">Must Know </a></li>
          <li><a href="blogs6.html">Protection against germs</a></li>
          <li><a href="blogs7.html">Avoiding certain drugs </a></li>
        </ul>
        <h2>Recent Posts</h2>
        
        <div class="block3">
          <img src="images/protein.jpg" alt="" class="img_inner noresize fleft">
          <div class="extra_wrapper">
            <div class="text1 color1">
              <time datetime="2014-01-01">29-04-2015</time>
              <a href="article1.html" class="color1">Protein </a>
            </div>Important source of protein discovered <a href="article1.html" class="color1">[...]</a>
          </div>
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

