package view;

import inscrit.Candidat;
import inscrit.Encadrement;
import inscrit.Enseignant;
import inscrit.Impgestion;
import inscrit.Juger;
import inscrit.Observation;
import inscrit.Rapporter;
import inscrit.Ressource;
import inscrit.These;
import inscrit.Thesedepose;
import inscrit.Thesesoutenu;
import inscrit.Utilisateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	String UPLOAD_DIRECTORY ="C:/wamp/www/uploads" ;
	Impgestion gestion = new Impgestion(); 
	String filename ; 
	String docname ; 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param system 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("can");
		 System.out.println("fffffff");
		 if(action!=null){
			
			 
			 if(action.equals("delete")){
				 System.out.println("DELETEEEEE");
				String ID = request.getParameter("IDd");
				 System.out.println("IDDDDDD  "+ID);
				 gestion.delete(ID);
				 request.getRequestDispatcher("Index?can=list").forward(request, response);
			 }
			 
			 if(action.equals("delete1")){
				 int ID1 = Integer.parseInt(request.getParameter("IDd1"));
				 gestion.delete1(ID1);
				 response.sendRedirect("Index?can=list1");
			 }
			 
			
			 
			
			 if(action.equals("modCan")){
				 String cinn =  request.getParameter("id");
				 Candidat  c = gestion.getCondidatByIdC(cinn);
				 request.setAttribute("USER", c);
				 request.getRequestDispatcher("ModCan.jsp").forward(request, response);
			 }
			 
			 
			 
			 if(action.equals("modUtl")){
				 int id = Integer.parseInt(request.getParameter("id"));
				 Utilisateur  c = gestion.getUtilisateurtById(id);
				 request.setAttribute("utl", c);
				 request.getRequestDispatcher("ModUtl.jsp").forward(request, response);
			 }
			 
			 if(action.equals("importdoc")){
				 String id = request.getParameter("idx");
				 request.setAttribute("IDCAN", id);
				 request.getRequestDispatcher("IMPO.jsp").forward(request, response);
			 }
			 
			 
			 
			 
			 if(action.equals("showCan")){
				 String cinn =  request.getParameter("id");
				 Candidat  c = gestion.getCondidatByIdC(cinn);
				 request.setAttribute("USER11", c);
				 request.getRequestDispatcher("ConsCan.jsp").forward(request, response);
			 }
			 
			
			 
			 if(action.equals("modEns")){
				 int idEns = Integer.parseInt(request.getParameter("id1"));
				 Enseignant  e = gestion.getEnseignantById(idEns);
				 request.setAttribute("USER1", e);
				 request.getRequestDispatcher("ModEns.jsp").forward(request, response);
			 }
			 
			 if(action.equals("showEns")){
				 int idEns = Integer.parseInt(request.getParameter("id1"));
				 Enseignant  e = gestion.getEnseignantById(idEns);
				 request.setAttribute("USER12", e);
				 request.getRequestDispatcher("ConsEns.jsp").forward(request, response);
			 }
			 
		
			 if(action.equals("modDep")){
				 int cin = Integer.parseInt(request.getParameter("id2"));
				 Thesedepose  d = gestion.getThesedeposeByid(cin);
				 request.setAttribute("USER2", d);
				 request.getRequestDispatcher("ModDep.jsp").forward(request, response);
			 } 
			 
			 if(action.equals("showDep")){
				 int cin = Integer.parseInt(request.getParameter("id2"));
				 Thesedepose  d = gestion.getThesedeposeByid(cin);
				 request.setAttribute("USER13", d);
				 request.getRequestDispatcher("ConsDep.jsp").forward(request, response);
			 } 
			 
			 
			
			 if(action.equals("modSou")){
	
				 int cin = Integer.parseInt(request.getParameter("id3"));
				 Thesesoutenu  s = gestion.getThesesoutenuByid(cin);
				 List<Enseignant>lee =  gestion.getAllEnseignant();
				 
				 
				 request.setAttribute("SSSS", lee); 
				 request.setAttribute("USER3", s);
				 request.getRequestDispatcher("ModSou.jsp").forward(request, response);
			 } 
			 
			 
			 if(action.equals("showSou")){
				 int cin = Integer.parseInt(request.getParameter("id3"));
				 Thesesoutenu  s = gestion.getThesesoutenuByid(cin);
				 request.setAttribute("USER14", s);
				 request.getRequestDispatcher("ConsSou.jsp").forward(request, response);
			 } 
			 
			 
			 if(action.equals("modEn")){
				 int cin = Integer.parseInt(request.getParameter("idthese"));
				 These  t = gestion.getTheseById(cin);
				 request.setAttribute("USER15", t);
				 request.getRequestDispatcher("ModifEn.jsp").forward(request, response);
			 } 
			 
			 
			 
			 if(action.equals("list")){
				 System.out.println("lsttttttttttttttttttttttt");
				 List<Candidat> LS  = new ArrayList<>();
				 LS = gestion.getAllCondidat();
				 request.setAttribute("lstc", LS);
				 request.getRequestDispatcher("ListCan.jsp").forward(request, response);
			 }
			 
			 if(action.equals("list1")){
				 System.out.println("lsttttttttttttttttttttttt");
				 List<Enseignant> LS1  = new ArrayList<>();
				 LS1 = gestion.getAllEnseignant();
				 request.setAttribute("lstc1", LS1);
				 request.getRequestDispatcher("ListEns.jsp").forward(request, response);
			 }
		 
			 if(action.equals("list2")){
				 System.out.println("lsttttttttttttttttttttttt");
			
				 List<Observation> LS2   = gestion.getAllThesedepose();
				 request.setAttribute("lstc2", LS2);
				
				 request.getRequestDispatcher("ListDep.jsp").forward(request, response);
			 }
		 
		 
			 if(action.equals("list3")){
				 System.out.println("lsttttttttttttttttttttttt");
				 List<Thesesoutenu> LS3  = new ArrayList<>();
				 LS3 = gestion.getAllThesesoutenu();
				 request.setAttribute("lstc3", LS3);
				 request.getRequestDispatcher("ListSou.jsp").forward(request, response);
			 }
			 
			 if(action.equals("list4")){
				 System.out.println("lsttttttttttttttttttttttt");
				 List<These> LS4  = new ArrayList<>();
				 LS4 = gestion.getAllThese();
				 request.setAttribute("lstc4", LS4);
				 request.getRequestDispatcher("ListEn.jsp").forward(request, response);
			 }
			 if(action.equals("addThese")){
				 List<Enseignant> LS1 =  gestion.getAllEnseignant();
				 request.setAttribute("lstc1", LS1);
				 List<Candidat> LS  = gestion.getAllCondidat();
				 request.setAttribute("lstc", LS);
				 request.getRequestDispatcher("then.jsp").forward(request, response);
				
			 }
			
			 if(action.equals("showthese")){
				 int iddd = Integer.parseInt(request.getParameter("id"));
				 These tt = gestion.getTheseById(iddd);
				 request.setAttribute("USER6", tt);
				
				 request.getRequestDispatcher("ConsEn.jsp").forward(request, response);
			 }
			 
		 if(action.equals("AjouterSou")){
			 System.out.println("souuuuuuuuun");
			 List<Enseignant> ls = gestion.getAllEnseignant();
			 request.setAttribute("LS", ls);  
		
			 request.getRequestDispatcher("AjouterSou.jsp").forward(request, response);
		 }
		
		 
		 /*if(action.equals("AjouterDep")){
			 List<Enseignant> ls = gestion.getAllEnseignant();
			 request.setAttribute("LR", ls); 
			 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
		 }*/
			
		 if(action.equals("th en")){
			 List<Enseignant> ls = gestion.getAllEnseignant();
			 request.setAttribute("LR", ls); 
			 request.getRequestDispatcher("then.jsp").forward(request, response);
		 }
			
	   if(action.equals("goaddThese")){
		   System.out.println("xxxxx : "+gestion.getLastThese());
		   int id = Integer.parseInt(request.getParameter("id"));
		   
		   //verif 
		   int nn = gestion.getThesedeposeByThese1(id);
		   System.out.println("nnnnn : "+nn);
		   if(nn>0){
			   request.setAttribute("MSG", "Thése déja déposé"); 
			   List<These> LS4  = new ArrayList<>();
				 LS4 = gestion.getAllThese();
				 request.setAttribute("lstc4", LS4);
			   request.getRequestDispatcher("ListEn.jsp").forward(request, response); 
			   return ; 
		   }
		   List<Enseignant>lee =  gestion.getAllEnseignant();
		   request.setAttribute("LR", lee);
		   request.setAttribute("THESEE", id);
		   request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);

	   }
		 
		 
	   if(action.equals("thesesoutenue")){
		   System.out.println("xxxxx 8888888: "+gestion.getLastThese());
		   int id = Integer.parseInt(request.getParameter("idd"));
		   System.out.println("theseee :  ; "+id);
		   int idtt = Integer.parseInt(request.getParameter("idtt"));
		   //verif 
		   int nn = gestion.getThesesoutenuByThese(idtt);
		   System.out.println("nnnnn : "+nn);
		   if(nn>0){
			   request.setAttribute("MSG", "Thése déja soutenue"); 
			   List<Observation> LS2   = gestion.getAllThesedepose();
				 request.setAttribute("lstc2", LS2);
			   request.getRequestDispatcher("ListDep.jsp").forward(request, response); 
			   return ; 
		   }
		   List<Rapporter>  rr =     gestion.getAllRapporteurByThese(idtt);
		   Encadrement enc = gestion.getEncadreurByThese(idtt);
		   System.out.println("rapporteurs : "+rr);
		  
		   List<Enseignant>lee =  gestion.getAllEnseignant();
		   System.out.println("membre : "+enc);
		  request.setAttribute("RR", rr);
		  request.setAttribute("MM", enc);
		   request.setAttribute("LS", lee);
		   request.setAttribute("IT", idtt);
		   request.setAttribute("THESEE", id);
		   request.getRequestDispatcher("AjouterSou.jsp").forward(request, response);
	   } 
	   
	   
	   
	   if(action.equals("list7")){
			 System.out.println("lsttttttttttttttttttttttt");
			 List<Utilisateur> LS4  = new ArrayList<>();
			 LS4 = gestion.getAllUtilisateur();
			 request.setAttribute("lstc7", LS4);
			 request.getRequestDispatcher("ListUtl.jsp").forward(request, response);
		 }
		 
		 }
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String action = request.getParameter("can");
		 System.out.println(action);
		 if(action!=null){
			  
			 if(action.equals("Se connecter")){
				 System.out.println("CCCCCCCC");
					// Recuperation de contenue des champs login et password 
					 String username = request.getParameter("login");
					 String password = request.getParameter("password");
					 String nom = request.getParameter("nom");
					 String prenom = request.getParameter("prenom");
					 Utilisateur u = gestion.verifUtilisateur(username, password);
					 if(u.getNom()!=null){
						 HttpSession session = request.getSession(true);
						 session.setAttribute("USER", u);
						 request.setAttribute("USER", u);
						 request.getRequestDispatcher("Ecole.jsp").forward(request, response);
					 }else {
						 request.setAttribute("ERREUR", "SVP verifier votre login et password");
						 request.getRequestDispatcher("Login.jsp").forward(request, response);
					 }
				 }
		 
			
			 if(action.equals("Ajoutercandidat")){
				 request.getRequestDispatcher("Ecole.jsp").forward(request, response);
				 
			 } 
			 
			 if (action.equals("valider")){
				 System.out.println("importeeeeerrrrrr");
				 MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_DIRECTORY); 
			        Enumeration files = multipartRequest.getFileNames(); 
			         
			        while (files.hasMoreElements()) 
			         { 
			              String name = (String)files.nextElement(); 
			              filename = multipartRequest.getFilesystemName(name); 
			              String type = multipartRequest.getContentType(name); 
			              System.out.println("name photo : " + filename);  
			           } 
			   // out.print("successfully uploaded");  
			    // Recuperation de contenue des champs 
				 String idC = multipartRequest.getParameter("idC");
				 String nom = multipartRequest.getParameter("nom");
				 System.out.println("nomm : "+nom);
				 String prenom = multipartRequest.getParameter("prenom");
				 String dateNais =  multipartRequest.getParameter("dateNais");
				 int tel1 = Integer.parseInt(multipartRequest.getParameter("tel1"));
				 int tel2 = Integer.parseInt(multipartRequest.getParameter("tel2"));
				 String email = multipartRequest.getParameter("email");
				 int num = Integer.parseInt(multipartRequest.getParameter("num"));
				 String nationalite = multipartRequest.getParameter("nationalite");
				 String niveau = multipartRequest.getParameter("niveau");
				 String lieu = multipartRequest.getParameter("lieu");
				 String genre = multipartRequest.getParameter("genre");
				 String specialite = multipartRequest.getParameter("specialite");
				 String inscription = multipartRequest.getParameter("inscription");
				 String id = multipartRequest.getParameter("idC");
				  int nn = gestion.verifExistanceCandidat(id);
				 if(nn>0){
					 
					   request.setAttribute("MSG", "candidat existe déja "); 
			       
					   request.getRequestDispatcher("AjouterCan.jsp").forward(request, response); 
					   return ; 
				   }
				 Candidat c = new Candidat(idC, nom, prenom, dateNais, tel1, tel2, email, num, nationalite, niveau, lieu, genre, specialite, inscription, filename);
				 gestion.addCandidat(c);
				 request.setAttribute("MSG", "Ajouté avec sucéé "); 
				 request.getRequestDispatcher("AjouterCan.jsp").forward(request, response);
				// response.sendRedirect("AjouterCan.jsp");
				 
				 
			 }
			 
			 if (action.equals("Modifier")){
					// Recuperation de contenue des champs 
				String idC = request.getParameter("idC");
				 String nom = request.getParameter("nom");
				 String prenom = request.getParameter("prenom");
				 String dateNais =  request.getParameter("date");
				 int tel1 = Integer.parseInt(request.getParameter("tel1"));
				 int tel2 = Integer.parseInt(request.getParameter("tel2"));
				 String email = request.getParameter("email");
				 int num = Integer.parseInt(request.getParameter("num"));
				 String nationalite = request.getParameter("nationalite");
				 String niveau = request.getParameter("niveau");
				 String lieu = request.getParameter("lieu");
				 String genre = request.getParameter("genre");
				 String specialite = request.getParameter("specialite");
				 String inscription = request.getParameter("inscription");
				 
				 Candidat c1 = new Candidat(idC, nom, prenom, dateNais, tel1, tel2, email, num, nationalite, niveau, lieu, genre, specialite, inscription);
					 gestion.updateCandidat(c1);
					 request.setAttribute("MSG", "Modification avec sucéé "); 
					 request.getRequestDispatcher("ModCan.jsp").forward(request, response);
					 //response.sendRedirect("Index?can=list");
				 }
			 
			 
			
			
			 
			 
			 

			
			 
			 if (action.equals("ajouter")){
				// Recuperation de contenue des champs 
				 
				 String nom = request.getParameter("nom");
				 String prenom = request.getParameter("prenom");
			
				 int tel = Integer.parseInt(request.getParameter("tel"));
				 String email = request.getParameter("email");
			
			
				
				 String lieu = request.getParameter("lieu"); 
				 String grade = request.getParameter("grade");
				 String genre = request.getParameter("genre");
				 
				 Enseignant e = new Enseignant(nom, prenom, tel, email, lieu, grade, genre);
				 gestion.addEnseignant(e);
				 request.setAttribute("MSG", "Ajouté avec sucéé "); 
				 request.getRequestDispatcher("AjouterEns.jsp").forward(request, response);
				 //response.sendRedirect("AjouterEns.jsp");
			 }
			 
			 if (action.equals("Modifier1")){
					// Recuperation de contenue des champs 
				 String nom = request.getParameter("nom");
			
				 String prenom = request.getParameter("prenom");
			
				 int tel = Integer.parseInt(request.getParameter("tel"));
				 String email = request.getParameter("email");
			
				 int id = Integer.parseInt(request.getParameter("ID"));
		
			
				 String lieu = request.getParameter("lieu");
				 String grade = request.getParameter("grade");
				 String genre = request.getParameter("genre");
				 Enseignant e1 = new Enseignant(id, nom, prenom, tel, email, lieu, grade, genre);
					 gestion.updateEnseignant(e1);
					 request.setAttribute("MSG", "Modification avec sucéé "); 
					 request.getRequestDispatcher("ModEns.jsp").forward(request, response);
					// response.sendRedirect("Index?can=list1");
				 }
			 
			 
			 
			 
		 
		
			 }
		 
		 
		 if (action.equals("Modifierutl")){
				// Recuperation de contenue des champs 
			 System.out.println("lfffffaaaat");
			 String nom = request.getParameter("nom");
			
			 String prenom = request.getParameter("prenom");
			 int id = Integer.parseInt(request.getParameter("idd"));
	
			 String login = request.getParameter("login");
			 String password = request.getParameter("password");

	
		
		
			 Utilisateur u = new Utilisateur(id, nom, prenom, login, password);
				 gestion.updateUtilisateur(u);
				 request.setAttribute("MSG", "Modification avec sucéé "); 
				 request.getRequestDispatcher("ModUtl.jsp").forward(request, response);
				// response.sendRedirect("Index?can=list7");
			 }
		 
		 
	
		 if(action.equals("Ajouterthesedepose")){
			 request.getRequestDispatcher("Ecole.jsp").forward(request, response);
			 
		 } 
		 
		 if(action.equals("ajoutobservation")){
			 String date = request.getParameter("date");
			 int rp1 = Integer.parseInt(request.getParameter("rap1"));
			 int rp2 = Integer.parseInt(request.getParameter("rap2"));
			 String ob1 = request.getParameter("obs1");
			 String ob2 = request.getParameter("obs2");
			 
			
		 }
		 
		 if(action.equals("addRaporteur")){
			 request.setAttribute("PLUS", "1");
			 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
			 
		 } 
		 
		 
		 /////////////////////////
		 if(action.equals("ajoutTHESE")){
			 String cd =  request.getParameter("candidat");
			 int rp = Integer.parseInt(request.getParameter("encadreur"));
			 String titre = request.getParameter("titre");
			 String description = request.getParameter("description");
			 These th = new These(titre, description, gestion.getCondidatByIdC(cd));
			 gestion.addThese(th);
			 
			 Encadrement en = new Encadrement(gestion.getEnseignantById(rp), gestion.getTheseById(gestion.getLastThese()));
			 
			 gestion.addEncadreur(en);
			 
			 request.setAttribute("MSG", "Ajouté avec sucéé "); 
			 request.getRequestDispatcher("then.jsp").forward(request, response);
			// response.sendRedirect("then.jsp"); 
		 }
		 
		 if (action.equals("ModifierEN")){
				// Recuperation de contenue des champs 

				
			 String idC =  request.getParameter("idc");
			
		
			 String titre = request.getParameter("titre");
			 String description = request.getParameter("description");
			 int id_these = Integer.parseInt(request.getParameter("id_these"));
			 These th = new These(id_these, titre, description, gestion.getCondidatByIdC(idC));
			 gestion.updateThese(th);
			 response.sendRedirect("Index?can=list4");
			 }

		
		 if (action.equals("valider1")){
			// Recuperation de contenue des champs 
			 int id = Integer.parseInt(request.getParameter("id"));
		
			 String date =  request.getParameter("date");
			
			 String titre = request.getParameter("titre");
			 
			 String id_these = request.getParameter("id_these");
			 
			 These t = gestion.getTheseById(id);
			 Thesedepose d = new Thesedepose(id, date, t);
			 gestion.addThesedepose(d);
			 response.sendRedirect("AjouterDep.jsp");
			  
		 }
	
		 if (action.equals("Modifier2")){
				// Recuperation de contenue des champs 
 
				
			 String date =  request.getParameter("date");
			
			 
			 String id_these = request.getParameter("id_these");
			 
			 These t = gestion.getTheseById(Integer.parseInt(id_these ));
			 
			 Thesedepose d1 = new Thesedepose(date, t);
			 gestion.updateThesedepose(d1);
			 response.sendRedirect("Index?can=list2");
			 }
	
	
	
	 if(action.equals("Ajouterthesesoutenu")){
		 request.getRequestDispatcher("Ecole.jsp").forward(request, response);
		 
	 } 
	 
	
	 
	 
	 
	
	 if (action.equals("addthesesoutenue")){
		 
		 int id_these = Integer.parseInt(request.getParameter("idthese"));
	  int idt =  Integer.parseInt(request.getParameter("idtt"));
		 String date =  request.getParameter("date");
		 String mention = request.getParameter("mention");

		 
		// int id = Integer.parseInt(request.getParameter("jury1"));
		// int id1 = Integer.parseInt(request.getParameter("user"));
		// int id2 = Integer.parseInt(request.getParameter("rap")); 
		 
		
		 
		 These t = gestion.getTheseById(id_these); 
				 
		// Juger j4 = new Juger(gestion.getEnseignantById(id), t); 
		// Juger j1 = new Juger(gestion.getEnseignantById(id1), t);
		// Juger j2 = new Juger(gestion.getEnseignantById(id2), t);
		// Juger j3 = new Juger(gestion.getEnseignantById(id3), t);
		//Encadrement e = gestion.getEncadreurByThese(id_these);
		 System.out.println("these : "+idt); 
		 Thesedepose tth = gestion.getThesedeposeByid(idt); 
		 System.out.println("d1 : "+tth.getDate()); 
		 System.out.println("d2 : "+date); 
		
		/*if (java.sql.Date.valueOf(date).compareTo(java.sql.Date.valueOf(tth.getDate()) ) == -1) { 
			// traitement du cas date1 < date2 
			 request.setAttribute("MSG", "Erreur date de depot doit etre de la date de soutnance "); 
			 request.getRequestDispatcher("AjouterSou.jsp").forward(request, response);
			 return ; 
			} 
			*/
		
		
		 Thesesoutenu s = new Thesesoutenu(date, mention, t); 
		 gestion.addThesesoutenu(s);
		// gestion.addJugement(j4);
		 //gestion.addJugement(j1);
		 //gestion.addJugement(j2);
		// gestion.addJugement(j3);
		//gestion.addEncadreur(e);
		response.sendRedirect("Index?can=list3");
		 //request.setAttribute("MSG", "Ajouté avec sucéé "); 
		 //request.getRequestDispatcher("AjouterSou.jsp").forward(request, response);
			
	 }
	 
	 if (action.equals("Modifier3")){
			// Recuperation de contenue des champs 
		 String date =  request.getParameter("date");
			
		 String mention = request.getParameter("mention");
		 
		 int id = Integer.parseInt(request.getParameter("jury1"));
		 int id1 = Integer.parseInt(request.getParameter("jury2"));
		 int id2 = Integer.parseInt(request.getParameter("jury3"));
		 int id3 = Integer.parseInt(request.getParameter("jury4"));
		 
		 int id_these = Integer.parseInt(request.getParameter("idthese"));
		 
		 These t = gestion.getTheseById(id_these);
		 Juger j = new Juger(gestion.getEnseignantById(id), t); 
		 Juger j1 = new Juger(gestion.getEnseignantById(id1), t);
		 Juger j2 = new Juger(gestion.getEnseignantById(id2), t);
		 Juger j3 = new Juger(gestion.getEnseignantById(id3), t);
		 
		 Thesesoutenu s = new Thesesoutenu(date, mention, t); 
		 gestion.updateThesesoutenu(s);
		 gestion.updateJugement(j);
		 gestion.updateJugement(j1);
		 gestion.updateJugement(j2);
		 gestion.updateJugement(j3);
		 }

	 
	 
	 if(action.equals("importer")){
		 
		 MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_DIRECTORY); 
        Enumeration files = multipartRequest.getFileNames(); 
         
        while (files.hasMoreElements()) 
         { 
              String name = (String)files.nextElement(); 
             docname = multipartRequest.getFilesystemName(name); 
              String type = multipartRequest.getContentType(name); 
              System.out.println("name photo : " + docname);  
           } 
   // out.print("successfully uploaded");  
		 String id =  request.getParameter("id");  
        // String document = request.getParameter("document");
		 Candidat ca = gestion.getCondidatByIdC(id);
		 Ressource rr = new Ressource(docname, ca);
		 gestion.addRessource(rr);
		 request.setAttribute("MSG", "Ajouté avec sucéé "); 
		 request.getRequestDispatcher("IMPO.jsp").forward(request, response);
		// response.sendRedirect("IMPO.jsp");
	 }
	 
	 
	 if(action.equals("ValidObservaton22"))
	 {
		 String resultaty = null ; 
		 System.out.println("je suis laa ");
		 String obs1 =  request.getParameter("obs1"); 
		 String obs2 = request.getParameter("obs2");
		  if(obs1.equals("Moins") & obs2.equals("Moins")){
			   resultaty = "Moins";
		 }
		 if(obs1.equals("Plus") & obs2.equals("Plus")){ 
			   resultaty = "Plus";
		 } 
		 String date = request.getParameter("date");
		 int rp = Integer.parseInt(request.getParameter("j1"));
		 int rp1 = Integer.parseInt(request.getParameter("j2"));
		 int rp2 = Integer.parseInt(request.getParameter("j3"));
		 int idthese = Integer.parseInt(request.getParameter("idthese"));
		

        Thesedepose td = new Thesedepose(date, gestion.getTheseById(idthese));
        gestion.addThesedepose(td);
        
        Observation ob = new Observation( gestion.getThesedeposeByid(gestion.getLastThesedepose()), resultaty); 
        gestion.addObservation(ob); 
        These t = gestion.getTheseById(idthese);
        Rapporter r1 = new Rapporter(t, gestion.getEnseignantById(rp));
        Rapporter r2 = new Rapporter(t, gestion.getEnseignantById(rp1));
        Rapporter r3 = new Rapporter(t, gestion.getEnseignantById(rp2));
        gestion.addRapporteur(r1);
        gestion.addRapporteur(r2);
        gestion.addRapporteur(r3);
		// Observation ob = new Observation(rp, ges, obs1);
		 //Observation ob = new Observation(rp, thesedepose, obs2);
		 
	 }
	 if(action.equals("ValidObservaton")){
		 String resultaty = null ; 
		 System.out.println("je suis laa 1111");
		 String obs1 =  request.getParameter("obs1"); 
		 String obs2 = request.getParameter("obs2");
		 String date = request.getParameter("datedep");
		 int idthese = Integer.parseInt(request.getParameter("idthese"));
		 
		 int rp1 = Integer.parseInt(request.getParameter("j1"));
		 int rp2 = Integer.parseInt(request.getParameter("j2"));
		 These t = gestion.getTheseById(idthese);
		// Rapporter rpp = new Rapporter(t, gestion.getEnseignantById(rp1));
		// Rapporter rpp2 = new Rapporter(t, gestion.getEnseignantById(rp2));
	// gestion.addRapporteur(rpp);
	//	gestion.addRapporteur(rpp2);
		// 
		 System.out.println("date : "+date);
		 if(rp1==rp2){
			 request.setAttribute("MSG", "Erreur de choix de la 2éme rapporteur"); 
			 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
			 return ; 
		 }
		 String obs3 = request.getParameter("obs3");
		 if(obs3==null)
		 {
		 if(obs1.equals("Moins") & obs2.equals("Moins")){
			 
			 resultaty = "Moins";
			

		        Thesedepose td = new Thesedepose(date, gestion.getTheseById(idthese));
		        gestion.addThesedepose(td);
		        
		        Observation ob = new Observation( gestion.getThesedeposeByid(gestion.getLastThesedepose()), resultaty); 
		        gestion.addObservation(ob); 
		        
		        request.setAttribute("MSG", "Ajouté avec sucéé "); 
				 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
		        //response.sendRedirect("Index?can=list2");	
		 }
		 if(obs1.equals("Plus") & obs2.equals("Plus")){ 
			   resultaty = "Plus"; 

		        Thesedepose td = new Thesedepose(date, gestion.getTheseById(idthese));
		        gestion.addThesedepose(td);
		        
		        Observation ob = new Observation( gestion.getThesedeposeByid(gestion.getLastThesedepose()), resultaty); 
		        gestion.addObservation(ob); 
		        
		        request.setAttribute("MSG", "Ajouté avec sucéé "); 
				 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
		        //response.sendRedirect("Index?can=list2");
		 } 
		 if((obs1.equals("Plus") & obs2.equals("Moins") )|| (obs1.equals("Moins") & obs2.equals("Plus") )){ 
			   request.setAttribute("RST", "1");
			   request.setAttribute("DAT", date);
			   request.setAttribute("ob1", obs1);
			   request.setAttribute("ob2", obs2);
			   request.setAttribute("THESEE", idthese);
			   List<Enseignant>lee =  gestion.getAllEnseignant();
			   request.setAttribute("LR", lee);
			   request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
			 
			   
		 } 
		 
		 }else{
			 int rp3 = Integer.parseInt(request.getParameter("j3"));
			 if(rp1==rp3 || rp2==rp3){
				 request.setAttribute("MSG", "Erreur de choix de la 3éme rapporteur"); 
				 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
				 return ; 
			 }
			 System.out.println("date : "+date);
		        Thesedepose td = new Thesedepose(date, gestion.getTheseById(idthese));
		        gestion.addThesedepose(td);
		          
			 Observation ob = new Observation( gestion.getThesedeposeByid(gestion.getLastThesedepose()), obs3); 
		        gestion.addObservation(ob); 
		        
		        Rapporter r1 = new Rapporter(t, gestion.getEnseignantById(rp1));
				 Rapporter r2 = new Rapporter(t, gestion.getEnseignantById(rp2));
			 gestion.addRapporteur(r1);
				gestion.addRapporteur(r2);
		        
		        Rapporter r3 = new Rapporter(t, gestion.getEnseignantById(rp3));
		        gestion.addRapporteur(r3);
		      
		        request.setAttribute("MSG", "Ajouté avec sucéé "); 
				 request.getRequestDispatcher("AjouterDep.jsp").forward(request, response);
		        
		        // response.sendRedirect("Index?can=list2");
			 
			 
			 
		 }
	
		
		
	 }
}
	

	
}

			
				 