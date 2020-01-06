package inscrit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import inscrit.Cnxbd;
import inscrit.Utilisateur;
import inscrit.Candidat;

import inscrit.Enseignant;



public class Impgestion implements Gestionecoledoctorale{

	@Override
	public void addCandidat(Candidat c) {
		// TODO Auto-generated method stub
		
		Connection cnx = Cnxbd.getCon();
		try {
			PreparedStatement st = cnx.prepareStatement("INSERT INTO Candidat (idC, nom, prenom, dateNais, tel1, tel2, email, num, nationalite, niveau, lieu, genre, specialite, inscription, photo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, c.getIdC());
			st.setString(2, c.getNom());
			st.setString(3, c.getPrenom());
			st.setString(4, c.getDateNais());
			st.setInt(5, c.getTel1());
			st.setInt(6, c.getTel2());
			st.setString(7, c.getEmail());
			st.setInt(8, c.getNum()); 
			st.setString(9, c.getNationalite());
			st.setString(10, c.getNiveau());
			st.setString(11, c.getLieu());
			st.setString(12, c.getGenre());
			st.setString(13, c.getSpecialite());
			st.setString(14, c.getInscription());
			st.setString(15, c.getPhoto());
			
			st.executeUpdate();
		} catch (SQLException c1) {
			// TODO Auto-generated catch block
			c1.printStackTrace();
		}	
	}

	@Override
	public void updateCandidat(Candidat c) {
		// TODO Auto-generated method stub
		Connection cnx = Cnxbd.getCon();
		try {
			PreparedStatement st = cnx.prepareStatement("update Candidat set nom = ?, prenom = ?, dateNais = ?, tel1 = ?, tel2 = ?, email =?, num = ?, nationalite = ?, niveau = ?,  lieu= ?, genre = ?, specialite = ?, inscription = ? WHERE idC = ?");
			
	
			st.setString(1, c.getNom());
			st.setString(2, c.getPrenom());
			st.setString(3, c.getDateNais());
			st.setInt(4, c.getTel1());
			st.setInt(5, c.getTel2());
			st.setString(6, c.getEmail());
			st.setInt(7, c.getNum()); 
			st.setString(8, c.getNationalite());
			st.setString(9, c.getNiveau());
			st.setString(10, c.getLieu());
			st.setString(11, c.getGenre());
			st.setString(12, c.getSpecialite());
			st.setString(13, c.getInscription());
			st.setString(14, c.getIdC());
			st.executeUpdate();
				} catch (SQLException c1) {
			// TODO Auto-generated catch block
			c1.printStackTrace();
	}
	}


		@Override
		public void delete(String code) {
			Connection cnx = Cnxbd.getCon();
			try {
				PreparedStatement st = cnx.prepareStatement("delete from Candidat where idC = ?");
				st.setString(1, code);
				st.executeUpdate();
			} catch (SQLException c1) {
				// TODO Auto-generated catch block
				c1.printStackTrace();
			}
		}

		
		
		@Override
		public Utilisateur verifUtilisateur(String login, String password){
			Connection cnx = Cnxbd.getCon();
			Utilisateur utl = new Utilisateur();
			try {
				PreparedStatement st = cnx.prepareStatement("select * from Agent_administratif where  login = ? and password = ?"); 
				st.setString(1, login);
				st.setString(2, password);
				ResultSet rs = st.executeQuery();
				while(rs.next()){
					utl.setId(rs.getInt("id"));
					utl.setNom(rs.getString("nom"));
					utl.setPrenom(rs.getString("prenom"));
			        utl.setLogin(rs.getString("login"));
					utl.setPassword(rs.getString("password")); 
				}
			} catch (SQLException u) {
				// TODO Auto-generated catch block
				u.printStackTrace();
			}
			return utl;
		}
		@Override
		public void addEnseignant(Enseignant e) {
			// TODO Auto-generated method stub
			
			Connection cnx = Cnxbd.getCon();
			try {
				PreparedStatement st = cnx.prepareStatement("INSERT INTO Enseignant (nom, prenom, tel, email, lieu, grade, genre) VALUES (?, ?, ?, ?, ?, ?, ?)");
	            st.setString(1, e.getNom());
				st.setString(2, e.getPrenom());
	            st.setInt(3, e.getTel());
				st.setString(4, e.getEmail());
		 
		        st.setString(5, e.getLieu());
		   	    st.setString(6, e.getGrade());
		        st.setString(7, e.getGenre());
		        
				st.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}

		@Override
		public void updateEnseignant(Enseignant e) {
			// TODO Auto-generated method stub
			Connection cnx = Cnxbd.getCon();
			try {
				PreparedStatement st = cnx.prepareStatement("update Enseignant set nom = ?, prenom = ?, tel = ?, email =?, lieu = ?, grade = ?, genre = ? WHERE id = ?");
				
				st.setString(1, e.getNom());
				st.setString(2, e.getPrenom());
				
				st.setInt(3, e.getTel());
				st.setString(4, e.getEmail());
				
			
				
				st.setString(5, e.getLieu());
		   	    st.setString(6, e.getGrade());
		        st.setString(7, e.getGenre());
		        
				
				
				
				st.setInt(8, e.getId());
				st.executeUpdate();
					} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
		}


			@Override
			public void delete1(int pass) {
				Connection cnx = Cnxbd.getCon();
				try {
					PreparedStatement st = cnx.prepareStatement("delete from Enseignant where id = ?");
					st.setInt(1, pass);
					st.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			

		
			

			

			@Override
			public List<Enseignant> getAllEnseignant() {
				Connection cnx = Cnxbd.getCon();
				List<Enseignant> Ens = new ArrayList<>();
				try {
					PreparedStatement st = cnx.prepareStatement("select * from Enseignant");  
					ResultSet rs = st.executeQuery();
					while(rs.next()){
						Enseignant  e1 = new Enseignant();
                        e1.setId(rs.getInt("id"));
						
						e1.setNom(rs.getString("nom"));
						e1.setPrenom(rs.getString("prenom"));
					
						e1.setTel(rs.getInt("tel"));
						e1.setEmail(rs.getString("email"));
					
						e1.setLieu(rs.getString("lieu"));
						e1.setGrade(rs.getString("grade")); 
						e1.setGenre(rs.getString("genre")); 
						Ens.add(e1);
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				return Ens;
			}

			
		
			public void addThesedepose(Thesedepose t) {
				// TODO Auto-generated method stub
				
				Connection cnx = Cnxbd.getCon();
				try {
					PreparedStatement st = cnx.prepareStatement("INSERT INTO Thesedepose (date, id_these) VALUES (?, ?)");
					
					st.setString(1, t.getDate());
					st.setInt(2, t.getThese().getId_these() );
					st.executeUpdate();
				} catch (SQLException c1) {
					// TODO Auto-generated catch block
					c1.printStackTrace();
				}	
			}

			@Override
			public void updateThesedepose(Thesedepose t) {
				// TODO Auto-generated method stub
				Connection cnx = Cnxbd.getCon();
				try {
					PreparedStatement st = cnx.prepareStatement("update thesedepose set date = ? WHERE id = ?");
					
				
					st.setString(1, t.getDate());
				
					st.setInt(2, t.getId());
					st.executeUpdate();
						} catch (SQLException c1) {
					// TODO Auto-generated catch block
					c1.printStackTrace();
			}
			}


			

				public Thesedepose getThesedeposeByid(int id) {
				Connection cnx = Cnxbd.getCon();
				Thesedepose dep = new Thesedepose();
				try {
					PreparedStatement st = cnx.prepareStatement("select * from Thesedepose where  id = ?"); 
					st.setInt(1, id);
					
					ResultSet rs = st.executeQuery();
					while(rs.next()){
						dep.setId(rs.getInt("id"));
						dep.setThese(getTheseById(rs.getInt("id_these")));
						dep.setDate(rs.getString("date"));
					
					}
				} catch (SQLException c1) {
					// TODO Auto-generated catch block
					c1.printStackTrace();
				}
				return dep;
			}
				
				@Override
				public List<Observation> getAllThesedepose() {
					Connection cnx = Cnxbd.getCon();
					List<Observation> LST1 = new ArrayList<>();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Observation");  
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							Observation  t1 = new Observation(); 
				
							t1.setIdOb(rs.getInt("id_observation"));  
							t1.setResult_observation(rs.getString("result_observation"));
							t1.setThesedepose(getThesedeposeByid(rs.getInt("id_these_dep")));
							 
							LST1.add(t1);
						}
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					return LST1;
				}

				
				
				
				@Override
				public Enseignant  getEnseignantById(int id) {
					Connection cnx = Cnxbd.getCon();
					Enseignant Ens1 = new Enseignant();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Enseignant where  id = ?"); 
						st.setInt(1, id);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							Ens1.setId(rs.getInt("id"));
					        Ens1.setNom(rs.getString("nom"));
							Ens1.setPrenom(rs.getString("prenom"));
				
							Ens1.setTel(rs.getInt("tel"));
							Ens1.setEmail(rs.getString("email"));
					
						
							Ens1.setLieu(rs.getString("lieu")); 
							Ens1.setGrade(rs.getString("grade"));
							Ens1.setGenre(rs.getString("genre")); 
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return Ens1;
				}

				@Override
				public void addThesesoutenu(Thesesoutenu s) {
					// TODO Auto-generated method stub
					
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO Thesesoutenu (date, mention, id_these) VALUES (?, ?, ?)");
						
						st.setString(1, s.getDate());
					
						st.setString(2, s.getMention());
						st.setInt(3, s.getThese().getId_these());
						st.executeUpdate();
						 } catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}	
					
				}

				@Override
				public void updateThesesoutenu(Thesesoutenu s) {
					
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("update Thesesoutenu set date = ?, mention = ? WHERE idD = ?");
					
					
					
						st.setString(1, s.getDate());
					
						st.setString(2, s.getMention());
						
						st.setInt(3, s.getIdD());
						st.executeUpdate();
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}	
					
				}

				

				@Override
				public Thesesoutenu getThesesoutenuByid(int idD) {
					// TODO Auto-generated method stub
					
					Connection cnx = Cnxbd.getCon();
					Thesesoutenu sou = new Thesesoutenu();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Thesesoutenu where  idD = ?"); 
						st.setInt(1, idD);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
						
							sou.setDate(rs.getString("date"));
							
							sou.setMention(rs.getString("mention"));
							sou.setThese(getTheseById(rs.getInt("id_these")));
							
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return sou;
					
				}

				@Override
				public List<Thesesoutenu> getAllThesesoutenu() {
					
					
					Connection cnx = Cnxbd.getCon();
					List<Thesesoutenu> LST2 = new ArrayList<>();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Thesesoutenu");  
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							Thesesoutenu  s1 = new Thesesoutenu();
							
							
							s1.setDate(rs.getString("date"));
						 
							s1.setIdD(rs.getInt("idD"));
							s1.setMention(rs.getString("mention"));
							s1.setThese(getTheseById(rs.getInt("id_these")));
							
							LST2.add(s1);
						}
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
			
					return LST2;
				}

				@Override
				public void addEncadreur(Encadrement e) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO Encadrement (id_these, id_enseignant)  values (?, ?)");
						st.setInt(1, e.getThese().getId_these());
						st.setInt(2, e.getEnseignant().getId());
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

				@Override
				public List<Encadrement> getAllEncadrement() {
					List<Encadrement> le = new ArrayList<>();
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("SELECT * from Encadrement");
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							Encadrement  c = new Encadrement();
							c.setEnseignant(getEnseignantById(rs.getInt("id_enseignant")));
							c.setThese(getTheseById(rs.getInt("id_these")));
							le.add(c);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return le;
				}

				@Override
				public These getTheseById(int id_these) {
					These t =new These();
					Connection cnx = Cnxbd.getCon();
				try{
					
					PreparedStatement st = cnx.prepareStatement("SELECT * from These where id_these = ?");
					st.setInt(1, id_these);
					ResultSet rs = st.executeQuery();
					while(rs.next()){
					
						t.setCandidat(getCondidatByIdC(rs.getString("idC")));
			
					
					 t.setId_these(rs.getInt("id_these"));
						t.setTitre(rs.getString("titre"));
						t.setDescription(rs.getString("description"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return t;
			}

				@Override
				public void addThese(These t) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO These (idC, titre, description)  values (?, ?, ?)");
						st.setString(1, t.getCandidat().getIdC());
						st.setString(2, t.getTitre());
						st.setString(3,t.getDescription());
						
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

				@Override
				public void updateThese(These t) {
				Connection cnx = Cnxbd.getCon();
				try{
				PreparedStatement st = cnx.prepareStatement("update These set titre = ?, description = ?, idC = ? WHERE id_these = ?");
				st.setString(1, t.getTitre());
				st.setString(2,t.getDescription());
				st.setString(3, t.getCandidat().getIdC());	
				st.setInt(4,t.getId_these());
				st.executeUpdate();
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
}
				@Override
				public List<These> getAllThese() {
					List<These> t = new ArrayList<>();
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("SELECT * from These");
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							These  th = new These();
							th.setCandidat(getCondidatByIdC(rs.getString("idC")));
							th.setTitre(rs.getString("titre"));
							th.setId_these(rs.getInt("id_these"));
							th.setDescription(rs.getString("description"));
							t.add(th);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return t;
				}

			

				@Override
				public List<Candidat> getAllCondidat() {
					List<Candidat> c = new ArrayList<>();
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("SELECT * from Candidat");
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							Candidat  can = new Candidat();
							can.setIdC(rs.getString("idC"));
							can.setNom(rs.getString("nom"));
							can.setPrenom(rs.getString("prenom"));
							can.setDateNais(rs.getString("dateNais"));
							can.setTel1(rs.getInt("tel1"));
							can.setTel2(rs.getInt("tel2"));
							can.setEmail(rs.getString("email"));
							can.setNum(rs.getInt("num")); 
							can.setNationalite(rs.getString("nationalite"));
							can.setNiveau(rs.getString("niveau"));
							can.setLieu(rs.getString("lieu"));
							can.setGenre(rs.getString("genre"));
							can.setSpecialite(rs.getString("specialite"));
							can.setInscription(rs.getString("inscription"));
							can.setPhoto(rs.getString("photo"));
							c.add(can);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return c;
				}

				public void addRessource(Ressource r) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO Ressource (idC, document)  values (?, ?)");
						st.setString(1, r.getCandidat().getIdC());
				
						st.setString(2,r.getDocument());
						
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

			
				public List<Ressource> getAllRessource() {
					{
						List<Ressource> r = new ArrayList<>();
						Connection cnx = Cnxbd.getCon();
						try {
							PreparedStatement st = cnx.prepareStatement("SELECT * from Ressource");
							ResultSet rs = st.executeQuery();
							while(rs.next()){
								Ressource  re = new Ressource();
								re.setCandidat(getCondidatByIdC(rs.getString("idC"))); 
								re.setDocument(rs.getString("document"));
								r.add(re);
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return r;
					}
				}
			
				@Override
				public void delete2(int code) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("delete from Enseignant where idR = ?");
						st.setInt(1, code);
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

				@Override
				public Candidat getCondidatByIdC(String idC) {
					Connection cnx = Cnxbd.getCon();
					Candidat can = new Candidat();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Candidat where  idC = ?"); 
						st.setString(1, idC);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							
							can.setIdC(rs.getString("idC"));
							can.setNom(rs.getString("nom"));
							can.setPrenom(rs.getString("prenom"));
							can.setDateNais(rs.getString("dateNais"));
							can.setTel1(rs.getInt("tel1"));
							can.setTel2(rs.getInt("tel2"));
							can.setEmail(rs.getString("email"));
							can.setNum(rs.getInt("num")); 
							can.setNationalite(rs.getString("nationalite"));
							can.setNiveau(rs.getString("niveau"));
							can.setLieu(rs.getString("lieu"));
							can.setGenre(rs.getString("genre"));
							can.setSpecialite(rs.getString("specialite"));
							can.setInscription(rs.getString("inscription"));
							can.setPhoto(rs.getString("photo"));
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return can;
				}

				@Override
				public void addObservation(Observation ob) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO Observation (id_these_dep, result_observation)  values (?, ?)");
						
			
						st.setInt(1, ob.getThesedepose().getId());
						st.setString(2,ob.getResult_observation());
						
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}


				@Override
				public void updateObservation(Observation ob) {
					Connection cnx = Cnxbd.getCon();
					try{
					PreparedStatement st = cnx.prepareStatement("update Observation set result_observation = ? WHERE id_these = ?");
	
					st.setInt(1, ob.getThesedepose().getId());
					st.setString(2,ob.getResult_observation());
					st.executeUpdate();
					
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

				@Override
				public void addJugement(Juger ju) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO Juger (id, id_these)  values (?, ?)");
						
						st.setInt(1, ju.getEnseignant().getId());
						st.setInt(2, ju.getThese().getId_these());
					
						
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

				@Override
				public void updateJugement(Juger ju){
				Connection cnx = Cnxbd.getCon();
				try{
					PreparedStatement st = cnx.prepareStatement("update Juger set id = ? WHERE id_these = ?");
					st.setInt(1, ju.getEnseignant().getId());
					st.setInt(2, ju.getThese().getId_these());
					
					st.executeUpdate();
					
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

				@Override
				public Encadrement getEncadreurByThese(int idEn) {
					Connection cnx = Cnxbd.getCon();
					Encadrement en = new Encadrement();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Encadrement where  id_these = ?"); 
						st.setInt(1, idEn);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							
							en.setEnseignant(getEnseignantById(rs.getInt("id_enseignant")));
							en.setThese(getTheseById(rs.getInt("id_these")));
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return en;
				}

				@Override
				public int getLastThese() {
			       
						    int xx =0 ; 
							Connection cnx = Cnxbd.getCon();
							These t = new These();
							try {
								PreparedStatement st = cnx.prepareStatement("select Max(id_these) as max from These"); 
							
								
								ResultSet rs = st.executeQuery();
								while(rs.next()){
									xx= rs.getInt("max");
								}
							} catch (SQLException c1) {
								// TODO Auto-generated catch block
								c1.printStackTrace();
							}
							return xx; 
							
							
							
				}

				@Override
				public int getLastThesedepose() {
					 int xx =0 ; 
						Connection cnx = Cnxbd.getCon();
						Thesedepose td = new Thesedepose();
						try {
							PreparedStatement st = cnx.prepareStatement("select Max(id) as max from Thesedepose"); 
						
							
							ResultSet rs = st.executeQuery();
							while(rs.next()){
								xx= rs.getInt("max");
							}
						} catch (SQLException c1) {
							// TODO Auto-generated catch block
							c1.printStackTrace();
						}
						return xx; 
						
						
				}

				@Override
				public List<Utilisateur> getAllUtilisateur() {
					Connection cnx = Cnxbd.getCon();
					List<Utilisateur> utl = new ArrayList<>();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Agent_administratif");  
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							Utilisateur  u = new Utilisateur();
	                        u.setId(rs.getInt("id"));
							
							u.setNom(rs.getString("nom"));
							u.setPrenom(rs.getString("prenom"));
						
						u.setLogin(rs.getString("login"));
							u.setPassword(rs.getString("password"));
						
							utl.add(u);
						}
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					return utl;
				}

				
				
				
				

				@Override
				public Juger getEnseignantByJuger(int id) {
					Connection cnx = Cnxbd.getCon();
					Juger ens = new Juger ();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Enseignant where  id = ?"); 
						st.setInt(1, id);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							
							ens.setEnseignant(getEnseignantById(rs.getInt("id_enseignant")));
							ens.setThese(getTheseById(rs.getInt("id_these")));
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return ens;
				}

				@Override
				public Utilisateur getUtilisateurtById(int id) {
					Connection cnx = Cnxbd.getCon();
					Utilisateur ult = new Utilisateur();
					try {
						PreparedStatement st = cnx.prepareStatement("select * from Agent_administratif where  id = ?"); 
						st.setInt(1, id);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
							
							
							ult.setNom(rs.getString("nom"));
							ult.setPrenom(rs.getString("prenom"));
							
							
							ult.setLogin(rs.getString("login"));
							ult.setId(rs.getInt("id"));
							ult.setPassword(rs.getString("password"));
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return ult;
				}

				@Override
				public void updateUtilisateur(Utilisateur u) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("update Agent_administratif set nom = ?, prenom = ?, login = ?, password =? WHERE id = ?");
						
						st.setString(1, u.getNom());
						st.setString(2, u.getPrenom());
						
						
						st.setString(3, u.getLogin());
						
					
						
						st.setString(4, u.getPassword());
				   	    
						st.setInt(5, u.getId());
						st.executeUpdate();
							} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}
					
				}

				@Override
				public Thesedepose getThesedeposeByThese(int id) 
				{
					Connection cnx = Cnxbd.getCon();
				Thesedepose th = new Thesedepose();
				try {
					PreparedStatement st = cnx.prepareStatement("select * from Thesedepose where  id_these = ?"); 
					st.setInt(1, id);
					
					ResultSet rs = st.executeQuery();
					while(rs.next()){
						 
						th.setThese(getTheseById(rs.getInt("id_these")));
						th.setDate(rs.getString("date"));
						
					}
				} catch (SQLException c1) {
					// TODO Auto-generated catch block
					c1.printStackTrace();
				}
				return th;
					// TODO Auto-generated method stub
					
				}

				@Override
				public void addRapporteur(Rapporter r) {
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("INSERT INTO rapporter (id_thesedep, id_enseignant) VALUES (?, ?)");
			           
						st.setInt(1, r.getThese().getId_these());
						st.setInt(2, r.getEnseignant().getId());
						st.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
					// TODO Auto-generated method stub
					
				}

				@Override
				public List<Rapporter> getAllRapporteurByThese(int id) {
					List<Rapporter> le = new ArrayList<>();
					Connection cnx = Cnxbd.getCon();
					try {
						PreparedStatement st = cnx.prepareStatement("SELECT * from Rapporter where  id_thesedep = ?");
						st.setInt(1, id);
						ResultSet rs = st.executeQuery(); 
						while(rs.next()){
							Rapporter  c = new Rapporter();
							c.setIdR(rs.getInt("idR")); 
							c.setEnseignant(getEnseignantById(rs.getInt("id_enseignant"))); 
							c.setThese(getTheseById(rs.getInt("id_thesedep")));
							le.add(c);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return le;
				}

				@Override
				public int getThesesoutenuByThese(int these) {
					int nbr = 0; 
					Connection cnx = Cnxbd.getCon();
					Thesesoutenu sou = new Thesesoutenu();
					try {
						PreparedStatement st = cnx.prepareStatement("select count(id_these) as nbrr  from Thesesoutenu where id_these = ?"); 
						st.setInt(1, these);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
						
							nbr = rs.getInt("nbrr"); 
							
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return nbr;
					
				}

				@Override
				public int getThesedeposeByThese1(int these) {
					int nbr = 0; 
					Connection cnx = Cnxbd.getCon();
					Thesedepose dep = new Thesedepose();
					try {
						PreparedStatement st = cnx.prepareStatement("select count(id_these) as nbrr  from Thesedepose where id_these = ?"); 
						st.setInt(1, these);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
						
							nbr = rs.getInt("nbrr"); 
							
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return nbr;
					
				}

				@Override
				public int verifExistanceCandidat(String id) {
					int nbr = 0; 
					Connection cnx = Cnxbd.getCon();
					Candidat sou = new Candidat();
					try {
						PreparedStatement st = cnx.prepareStatement("select count(idC) as nbrr  from Candidat where idC = ?"); 
						st.setString(1, id);
						
						ResultSet rs = st.executeQuery();
						while(rs.next()){
						
							nbr = rs.getInt("nbrr"); 
							
							
						}
					} catch (SQLException c1) {
						// TODO Auto-generated catch block
						c1.printStackTrace();
					}
					return nbr;
					
				}
}
				

	


