<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="" uri="http://java.sun.com/jsp/jstl/core" %>
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
              <h3>Ecole Doctorale</h3>
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
                  <h2>Modification These deposeé</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Settings 1</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
				<div class="x_content">
				 <form method="post" class="form-horizontal form-label-left"  novalidate action="Index?ID=${USER2.id}">

                   
           
                  

              
			${MSG }
             
					
					
					
					
					
					<div class="item form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Date de depot <span class="required">*</span>
                      </label>
                      <div class="col-md-6 col-sm-6 col-xs-12">
                        <input id="date" class="form-control col-md-7 col-xs-12" ${USER.date} value="${DAT }" data-validate-length-range="6" data-validate-words="2" name="datedep" required="required" type="date">
                      </div>
                    </div>
					
                    
					
					
					 
					
					
				
					 
					 <div class="item form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Rapporteur1<span class="required">*</span>
                      </label>    
                     <div class="row">
  						<div class="col-md-3"> 
                         <select id="heard" class="form-control" name="j1" required="">
                        <c:forEach var="L" items="${LR }">
                          <option value="${L.id }">${L.nom } ${L.prenom }</option>
                         </c:forEach>
                        </select>
                        </div>
 				        
 				        
 				        <div class="col-md-3"> 
 					   				 <select id="heard" class="form-control" name="obs1"  > 
 					   				 
                          <option value="Plus"    <c:if test="${ob1=='Plus' }"> selected </c:if> >Plus</option>
                           <option value="Moins"  <c:if test="${ob1=='Moins' }"> selected </c:if>>Moins</option>
                        </select> 
 				          </div>
							</div>
				    <div class="item form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Rapporteur2<span class="required">*</span>
                      </label>    
                     <div class="row">
  						<div class="col-md-3"> 
                          <select id="heard" class="form-control" name="j2" required="">
                        <c:forEach var="L" items="${LR }">
                          <option value="${L.id }">${L.nom } ${L.prenom }</option>
                         </c:forEach>
                        </select>
                        </div>
 						 <div class="col-md-3"> 
 					   				 <select id="heard" class="form-control" name="obs2"  > 
 					   			
                          <option value="Plus" <c:if test="${ob2=='Plus' }"> selected </c:if> >Plus</option>
                           <option value="Moins"<c:if test="${ob2=='Moins' }"> selected </c:if> >Moins</option>
                        </select> 
 					     </div>
							</div>
                        <c:if test="${RST=='1' }">     <div class="item form-group">
                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Rapporteur3<span class="required">*</span>
                      </label>    
                     <div class="row">
  						<div class="col-md-3"> 
					  <select id="heard" class="form-control" name="j3" required="">
                          <c:forEach var="L" items="${LR }">
                          <option value="${L.id }">${L.nom } ${L.prenom }</option>
                         </c:forEach>
                        </select> 
                        </div>
 						 <div class="col-md-3"> 
 					   				 <select id="heard" class="form-control" name="obs3"  > 
 					   				 
 					   				   <option >observation3</option>
                          <option value="Plus">Plus</option>
                           <option value="Moins">Moins</option>
                        </select> 
 					     </div>
							</div>
                         </c:if>
					
                    
                    
      
					
                    <div class="ln_solid"></div>
                    <div class="form-group">
                      <div class="col-md-6 col-md-offset-3">
                      <a href="Index?can=list2" type="submit" class="btn btn-primary">Retourner</a>
                        <button id="send" type="submit" class="btn btn-success" name="can" value="Modifier2">Modifier</button>
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
  <!-- form validation -->
  <script src="js/validator/validator.js"></script>
  <script>
    // initialize the validator function
    validator.message['date'] = 'not a real date';

    // validate a field on "blur" event, a 'select' on 'change' event & a '.reuired' classed multifield on 'keyup':
    $('form')
      .on('blur', 'input[required], input.optional, select.required', validator.checkField)
      .on('change', 'select.required', validator.checkField)
      .on('keypress', 'input[required][pattern]', validator.keypress);

    $('.multi.required')
      .on('keyup blur', 'input', function() {
        validator.checkField.apply($(this).siblings().last()[0]);
      });

    // bind the validation to the form submit event
    //$('#send').click('submit');//.prop('disabled', true);

    $('form').submit(function(e) {
      e.preventDefault();
      var submit = true;
      // evaluate the form using generic validaing
      if (!validator.checkAll($(this))) {
        submit = false;
      }

      if (submit)
        this.submit();
      return false;
    });

    /* FOR DEMO ONLY */
    $('#vfields').change(function() {
      $('form').toggleClass('mode2');
    }).prop('checked', false);

    $('#alerts').change(function() {
      validator.defaults.alerts = (this.checked) ? false : true;
      if (this.checked)
        $('form .alert').remove();
    }).prop('checked', false);
  </script>

</body>

</html>
