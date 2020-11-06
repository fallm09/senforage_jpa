			    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
			<jsp:include page="/header.jsp"></jsp:include>
			
			<!--  Content Row -->
			
			<div class="row">
			
			<!--  Content Row -->
			
			
			<div class="col-xl-8 col-lg-7">
			<div class="car shadow mb-4">
			<!-- Card header - Dropdown -->
			<div class="car-header py-3 d-flex flex-row align-items-center justify-content-between">
			<h6 class m="m-0 font -weight-bold text primary">Liste des Clients</h6>
			</div>
			<!-- Card Body -->
			<div class="card-body">
					Tableau
				</div>
			</div>
		</div>
			
	<!--  Pie Chart -->
	
			<div class="col-xl-4 col-lg-5">
			<div class="card shadow mb-4">
			<!--  Card Header -Dropdown -->
			<div class="car-header py-3 d-flex flex-row align-items-center justify-content-between">
			<h6 class m="m-0 font -weight-bold text primary">Ajout des Clients</h6>
			</div>
				<!-- Card Body -->
					<div class="card-body">
				           <form method="Post" action="Clients"> 
				            
				           <div class="form-group">
					    <label class="control-label" for="nom">Nom du Client</label>
					<input class="form-control" type="text" name="nom" id="nom" />
                    </div> 
						
						     
				           <div class="form-group">
					    <label class="control-label" for="nom">Prenom du Client</label>
					<input class="form-control" type="text" name="prenom" id="prenom" />
                    </div> 
						
						     
				           <div class="form-group">
					    <label class="control-label" for="nom">Village du Client</label>
					<select name='idVillage'> 
						<c:forEach items="${ListVillage}" var="Mareme">
						<option value="<c:out value="${Mareme.id}"></c:out>" >
						<c:out value="${Mareme.nom}"></c:out>
						</option>
						</c:forEach>
					</select>
                    </div> 
						     
				           <div class="form-group">
					    <label class="control-label" for="nom">Adresse du Client</label>
					<input class="form-control" type="text" name="adresse" id="adresse" />
                    </div> 
						
					     
				           <div class="form-group">
					    <label class="control-label" for="nom">Numero du Client</label>
					<input class="form-control" type="number" name="numero" id="numero" />
                    </div> 
						
						<div class="form-group">
                        <input class="btn btn-success" type="submit" name="Envoyer" id="envoyer" value="Envoyer"/>
                        <input class="btn btn-danger"  type="reset" name="Annuler" id="annuler" value="Annuler"/>
                    </div>
						</form>
					</pre>
							
				  </div>
				</div>
			</div>
		</div>
		<jsp:include page="/footer.jsp"></jsp:include>
							
			
			
			
			
			
			
			
			
			
			
			
			
			
				