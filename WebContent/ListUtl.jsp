<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Doctorat</title> 

  <!-- Bootstrap core CSS -->

  <link href="css/bootstrap.min.css" rel="stylesheet">

  <link href="fonts/css/font-awesome.min.css" rel="stylesheet">
  <link href="css/animate.min.css" rel="stylesheet">

  <!-- Custom styling plus plugins -->
  <link href="css/custom.css" rel="stylesheet">
  <link href="css/icheck/flat/green.css" rel="stylesheet">
  <script src="js/jquery.min.js"></script>
 

</head> 
<body class="nav-md"> 
  <div class="container body"> 
    <div class="main_container"> 
      <div class="col-md-3 left_col">
        <div class="left_col scroll-view"> 
          <div class="clearfix"></div> 
          <!-- menu prile quick info -->
          <div class="profile">
            <div class="profile_pic">
               <a href="Ecole.jsp"><img src="images/img.jpg" alt="..." class="img-circle profile_img"></a>
            </div>
            <div class="profile_info">
             
              <h2>Ecole doctorale</h2>
            </div>
          </div>
          <!-- /menu prile quick info -->

          <br />

          <!-- sidebar menu -->
           <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

            <div class="menu_section">
              <h3>Bienvenue</h3>
               <h2></h2>
              <ul class="nav side-menu">
                 <li><a><i class="fa fa-home"></i>Gestion Candidats <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="AjouterCan.jsp">Ajouter Candidat</a>
                    </li>
					 <li><a href="Index?can=list">liste des Candidats</a>
                    </li>
                                       
                  </ul>
                </li>
                <li><a><i class="fa fa-edit"></i>Gestion Enseingnants<span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
					<li><a href="AjouterEns.jsp">Ajouter Enseignant</a>
                    </li>
					<li><a href="Index?can=list1">Liste des Enseignants</a>
					
					
                    </li> 
                  </ul>
                </li>
                
                
                 <li><a><i class="fa fa-edit"></i>Gestion These <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
					<li><a href="th en.jsp">Ajouter These</a>
                    </li>
                    <li><a href="Index?can=list4">Liste des Theses</a>
                    </li> 
                  </ul>
                </li>
				
				
				
				<li><a><i class="fa fa-edit"></i>These deposee<span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
					
                    <li><a href="Index?can=list2">liste des Theses</a>
                    </li> 
                  </ul>
                </li>
                <li><a><i class="fa fa-server"></i>Theses Soutenue<span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none"> 
					
					<li><a href="Index?can=list3">liste des théses</a>
                    </li>
                  </ul>
                </li> 
                
                
               <ul class="nav side-menu">
                <li><a><i class="fa fa-home"></i> Gestion droit d'acceé <span class="fa fa-chevron-down"></span></a>
                  <ul class="nav child_menu" style="display: none">
                    <li><a href="Index?can=list7">Consulter Parametre de connexion</a>
                    </li>
                      
               
                  </ul>

                </li>

		</div>
            
          </div> 
          <!-- /menu footer buttons -->
        </div>
      </div>

      <!-- top navigation -->
      <div class="top_nav">

        <div class="nav_menu">
          <nav class="" role="navigation">
            <div class="nav toggle">
              <a id="menu_toggle"><i class="fa fa-bars"></i></a>
            </div>

            <ul class="nav navbar-nav navbar-right">
              <li class="">
                <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                  Administrateur
                  <span class=" fa fa-angle-down"></span>
                </a>
                <ul class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
                  <li><a href="javascript:;">  Profile</a>
                  </li> 
                  </li> 
                  <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Deconnexion</a>
                  </li>
                </ul>
              </li>

             

            </ul>
          </nav>
        </div>

      </div>
      <!-- /top navigation -->

      <!-- page content -->
      <div class="right_col" role="main">
        <div class="">
          <div class="page-title">
            <div class="title_left">
      <h3>Droits d'Accès</h3>
            </div>

            
          </div>
          <div class="clearfix"></div>

          <div class="row">

            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel" style="height:600px;">
                <div class="x_title">
                  <h2></h2>
                   <ul class="nav navbar-right panel_toolbox">
                   
                  </ul>
                  <div class="clearfix"></div>
                </div>
				<div class="x_content">
                  
                  
                   <table class="table table-striped projects">
                    <thead>
                      <tr>
                           
                        <th style="width: 20%"> nom</th>
                        <th>prenom</th>
                      <th>login</th>
                        <th>password</th>
                       <th>action</th>
                        </th>
                      </tr>
                    </thead>

                    <tbody>
					
                    <c:forEach var="M" items="${lstc7 }">
                      <tr class="odd pointer">
                        
                         
                    
                        <td class=" ">${M.nom }</td>
                        <td class=" ">${M.prenom }</td>
                       <td class=" ">${M.login }</td>
                       <td class=" ">${M.password }</td>
       
                   
                      <td class=" last"><a href="#"> 
					  				    
                          <a href="Index?can=modUtl&id=${M.id }" type="submit" class="btn btn-info btn-xs"><i class="fa fa-pencil" name="can" value="Modifier"></i> Modif </a>
                         
                       </td>
                        </td>
                      </tr>
                      </c:forEach>
                      </tbody>
                      
                  </table>
				  
				  
				  
				</div>
              </div>
            </div>
          </div>
        </div>

        <!-- footer content -->
        
        <!-- /footer content -->

      </div>
      <!-- /page content -->
    </div>

  </div>

  <div id="custom_notifications" class="custom-notifications dsp_none">
    <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
    </ul>
    <div class="clearfix"></div>
    <div id="notif-group" class="tabbed_notifications"></div>
  </div>

  <script src="js/bootstrap.min.js"></script>

  <!-- chart js -->
  <script src="js/chartjs/chart.min.js"></script>
  <!-- bootstrap progress js -->
  <script src="js/progressbar/bootstrap-progressbar.min.js"></script>
  <script src="js/nicescroll/jquery.nicescroll.min.js"></script>
  <!-- icheck -->
  <script src="js/icheck/icheck.min.js"></script>

  <script src="js/custom.js"></script>


  <!-- Datatables -->
  <script src="js/datatables/js/jquery.dataTables.js"></script>
  <script src="js/datatables/tools/js/dataTables.tableTools.js"></script>

  <!-- pace -->
  <script src="js/pace/pace.min.js"></script>
  <script>
    $(document).ready(function() {
      $('input.tableflat').iCheck({
        checkboxClass: 'icheckbox_flat-green',
        radioClass: 'iradio_flat-green'
      });
    });

    var asInitVals = new Array();
    $(document).ready(function() {
      var oTable = $('#example').dataTable({
        "oLanguage": {
          "sSearch": "Search all columns:"
        }
       
       
      });
      $("tfoot input").keyup(function() {
        /* Filter on the column based on the index of this element's parent <th> */
        oTable.fnFilter(this.value, $("tfoot th").index($(this).parent()));
      });
      $("tfoot input").each(function(i) {
        asInitVals[i] = this.value;
      });
      $("tfoot input").focus(function() {
        if (this.className == "search_init") {
          this.className = "";
          this.value = "";
        }
      });
      $("tfoot input").blur(function(i) {
        if (this.value == "") {
          this.className = "search_init";
          this.value = asInitVals[$("tfoot input").index(this)];
        }
      });
    });
  </script>
</body>

</html>
