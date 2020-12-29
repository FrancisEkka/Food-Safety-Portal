
<!DOCTYPE html>
<html lang="en">
<head>
<title>Contacts</title>
<meta charset="utf-8">
<meta name = "format-detection" content = "telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="css/form.css">
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
<script src="js/TMForm.js"></script>
<script src="js/modal.js"></script>
<script
src="http://maps.googleapis.com/maps/api/js">
</script>
<script>
 $(document).ready(function(){

  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});

  }); 
</script>

<script>
var myCenter=new google.maps.LatLng(23.4123,85.4399);
var marker;

function initialize()
{
var mapProp = {
  center:myCenter,
  zoom:15,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };

var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker=new google.maps.Marker({
  position:myCenter,
  animation:google.maps.Animation.BOUNCE
  });

marker.setMap(map);
}

google.maps.event.addDomListener(window, 'load', initialize);
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
               <li class="current"><a href="index-4.jsp">Contacts</a></li>
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
<section class="content ctn__1">
  <div class="container">
    <div class="row">
      <div class="grid_12">
        <h2>Find Us</h2>
        <div class="map">
          <div class="row">
            
              <div class="grid_9" id="googleMap" style="width:800px;height:480px;"></div>

            <div class="grid_3">
              <div class="map_block">
                <div class="map_title">Address:</div>
                MCA Department, Birla Institute of Technology<br>
                Mesra , Ranchi 835215
              </div>
              <div class="map_block">
                <div class="map_title">Phones:</div>
                9504612055
              </div>
              <div class="map_block">
                <div class="map_title">Email:</div>
                <a href="#">mail.francisalia64@gmail.com</a>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="grid_8">
        
      </div>
    </div>
  </div>
</section>
<div class="form_block">
  <div class="container">
    <div class="row">
      <div class="grid_11">
        <h2>Suggestion Form</h2>
          <form name="f1" action="add_sugg" method="post">
         
                <fieldset>
                    <table style="width: 800px; height: 300px;">
                        <tr>
                            <td>
                    <dl>
                        <dt><label >Name:</label></dt>
                        <dd><input type="text" name="name" id="name_id" size="30" required required maxlength="30" required pattern="[a-zA-Z ]+" title="only alphabet and space"/><font color="#FF0000"></font>						
                        </dd>
                    </dl></td>
                    <td>
                     <dl>
                        <dt><label >email:</label></dt>
                        <dd><input type="email" name="email" id="add_id" size="30" required/><font color="#FF0000"></font>						
						</dd>
                     </dl></td>
                     <td>
                    <dl>
                        <dt><label >number:</label></dt>
                        <dd><input type="text" name="mobile" id="add_id" size="30" required pattern="[0-9]{10}" size="54" maxlength="10" required title="valid mobile no"/><font color="#FF0000"></font>						
						</dd>
                    </dl> </td></tr>
                        <tr><td colspan="3">
                    <dl>
                        <dt><label >message:</label></dt>
                        <dd><textarea name="message" style=" height: 200px; width: 735px;" required > </textarea><font color="#FF0000"></font>						
						</dd>
                    </dl></td></tr>
                    
                        <tr><td colspan="3">
                     <dl class="submit">
                         <input type="submit" name="submit" id="submit" value="Submit" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <input type="reset"  name="clear" value="Clear"/>
                     </dl></td></tr>
                    </table>
                </fieldset>
                
         </form>
      </div>
    </div>
  </div>
</div>
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
