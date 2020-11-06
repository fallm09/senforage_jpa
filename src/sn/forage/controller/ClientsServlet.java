package sn.forage.controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.forage.dao.ClientsImpl;
import sn.forage.dao.IClients;
import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Clients;
import sn.forage.entities.Village;

import java.io.IOException;



@WebServlet(urlPatterns = {"/Clients","/listeclient"}, name ="clients")
public class ClientsServlet extends HttpServlet {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("testPU");
	
	EntityManager em = emf.createEntityManager();
	
	private IVillage villagedao;
	
	private IClients clientsdao;
	
	
	@Override
	public void init (ServletConfig config) throws ServletException {
		clientsdao = new ClientsImpl();
		villagedao = new VillageImpl();
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
	//resp.getWriter().println("ok");
		String url =req.getServletPath();
		
		if (url.equals("/Clients")){
			req.setAttribute("ListVillage",villagedao.list() );
		req.getRequestDispatcher("WEB-INF/clients/add.jsp").forward(req,resp);
	}
		
			else if (url.equals("/listeclient")) {
    		
        	req.getRequestDispatcher("clients/liste.jsp").forward(req,resp);

    	}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		
		String nom = req.getParameter("nom").toString();
		String adresse = req.getParameter("adresse").toString();
		String prenom = req.getParameter("prenom").toString();
		String numero = req.getParameter("numero").toString();
		int idvillage = Integer.parseInt(req.getParameter("idVillage")); 
		
		
		
		Clients clients = new Clients();
		//village.setNom((Village)em.createQuery("select c FROM Village c WHERE c.id=:id").setParameter("id", 1));
		clients.setNom(nom);
		clients.setPrenom(prenom);
		clients.setAdresse(adresse);
		clients.setNumero(numero);
		clients.setVillage((Village)
				em.createQuery("select c FROM Village c WHERE c.id=:id").setParameter("id", idvillage).getSingleResult());
		
		
		
					int ok=	clientsdao.add(clients);
					resp.getWriter().println(ok);
		
	}
	
	}

	
