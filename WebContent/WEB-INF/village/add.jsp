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
			<h6 class m="m-0 font -weight-bold text primary">Ajout du village</h6>
			</div>
				<!-- Card Body -->
					<div class="card-body">
				           <form method="Post" action="Village"> 
				            
				  
					     
				           <div class="form-group">
					    <label class="control-label" for="nom">Village</label>
					<input class="form-control" type="text" name="village" id="numero" />
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