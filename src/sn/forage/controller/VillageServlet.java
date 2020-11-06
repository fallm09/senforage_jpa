package sn.forage.controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Village;


@WebServlet(urlPatterns = { "/Village","/listevillage"}, name ="village")
public class VillageServlet extends HttpServlet {
	
  EntityManagerFactory emf= Persistence.createEntityManagerFactory("testPU");
	
	EntityManager em = emf.createEntityManager();
	
	
	
	
	private static final long serialVersionUID = 1L;
       	private IVillage villagedao ;
    
    
       	 
    @Override
     public void init(ServletConfig config) throws ServletException {
    	villagedao = new VillageImpl();
    	
    }
    
    
     
    
    @Override
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	String url=request.getServletPath();
    	if (url.equals("/Village")) {
        	request.getRequestDispatcher("/WEB-INF/village/add.jsp").forward(request,response);

    	}
    	else if (url.equals("/listevillage")) {
    		
        	request.getRequestDispatcher("/WEB-INF/village/listevillage.jsp").forward(request,response);

    	}
 
    	
    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
    	Village village = new Village();
		
    	village.setNom(request.getParameter("village").toString());
    	
    	  villagedao.add(village);
    	
    	
    	
   
		
    	
	}

}
