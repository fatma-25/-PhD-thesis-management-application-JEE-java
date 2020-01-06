<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>BIENVENUE   ${USER.nom} ${USER.prenom}</h1>
<hr>
<a href="Index?can=delete&IDd=${USER.id}">SUPPRIMER MON COMPTE</a>
<Hr>
information generale
 <form method="post" action="Index?ID=${USER.id}">
    
     
         <p>Nom : <input type="text" name="nom" value="${USER.nom}" placeholder="nom" required></p> 
         <p>Prenom : <input type="text" name="prenom" value="${USER.prenom}" placeholder="Prenom" required></p> 
           <p>Date de naissance : <input type="text" name="date" value="${USER.date}" placeholder="date" required></p> 
          <p>tel : <input type="text" name="tel" value="${USER.tel}" placeholder="teL" required></p> 
     
         <p>Email : <input type="text" name="email" value="${USER.email}" placeholder="email" required></p> 
          <p>CIN : <input type="hidden" name="cin" value="${USER.cin}" placeholder="cin" required></p>    
        <p>numéro d'inscription: <input type="text" name="num" value="${USER.num}" placeholder="num" required></p> 
        <p>Encadreur: <input type="text" name="encadreur" value="${USER.encadreur}" placeholder="encadreur" required></p> 
         <p>Titre de la thése: <input type="text" name="titre" value="${USER.titre}" placeholder="titre" required></p>  
         <input type="submit" name="can" value="Modifier"></p>
      </form>
</body>
</html>