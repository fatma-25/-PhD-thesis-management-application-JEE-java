<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
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
                    <li><a href="AjouterDrt.jsp">Consulter Parametre de connexion</a>
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

              <li role="presentation" class="dropdown">
                <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                  <i class="fa fa-envelope-o"></i>
                  <span class="badge bg-green">6</span>
                </a>
                <ul id="menu1" class="dropdown-menu list-unstyled msg_list animated fadeInDown" role="menu">
                  <li>
                    <a>
                        <span>
                            <span>DOCTORANT1</span>
                            <span class="time">FICHE INSCRIT</span>
                        </span>
                        <span class="message"> </span>
                    </a>
                  </li>
                    <li>
                    <div class="text-center">
                      <a>
                        <strong>See All Alerts</strong>
                        <i class="fa fa-angle-right"></i>
                      </a>
                    </div>
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
              <h3>Consulter Candidat</h3>
            </div>

            <div class="title_right">
              <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                <div class="input-group">
                  <input type="text" class="form-control" placeholder="Rechercher">
                  <span class="input-group-btn">
                            <button class="btn btn-default" type="button">OK</button>
                        </span>
                </div>
              </div>
            </div>
          </div>
           <div class="clearfix"></div>

          <div class="row">

            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel" style="height:600px;">
                <div class="x_title">
              
                  <ul class="nav navbar-right panel_toolbox">
                   <div class="input-group">
                        <button class="btn btn-default" onclick="window.print();"><i class="fa fa-print"></i> Imprimer</button>
                        
                 
               </div>
                  </ul>
                  <div class="clearfix"></div>
                </div>
				<div class="x_content">
				 <form method="post" class="form-horizontal form-label-left"  novalidate action="Index?ID=${USER6.id_these}">

                    
           
                      
                 

                  
                      <center><label class="form-control col-md-7 col-xs-12" for="name" value="" type="nom">encadreur: ${USER6.encadreur}<span class="required"></span>
                      </label></center>
                      
                  
					
					  
                      <center><label class="form-control col-md-7 col-xs-12" for="name" value="" type="prenom">titre: ${USER6.titre}<span class="required"></span>
                      </label></center>
                      
                    
					
					
					
			
                   
                 
					
                 
                      <center><label class="form-control col-md-7 col-xs-12" for="email" value="" type="description">description:${USER6.description} <span class="required">*</span>
                      </label></center>
                      
                  
					
					
                     
                   
        
                  
					
                    <div class="ln_solid"></div>
                    <div class="form-group">
                      <div class="col-md-6 col-md-offset-3">
         
                      
                      </div>
                    </div>
                  </form>
				</div>
              </div>
            </div>
          </div>
        </div>

        <!-- footer content -->
        <footer>
          <div class="copyright-info">
           <center>Ecole doctorale de science de gestion</center>
          </div>
          <div class="clearfix"></div>
        </footer>
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
  <!-- pace -->
  <script src="js/pace/pace.min.js"></script>
  <script src="js/custom.js"></script>
 </body>
 </html>