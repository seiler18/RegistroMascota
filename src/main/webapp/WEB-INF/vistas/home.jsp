<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="cl.jesus.model.entity.RegistroMascotaDueno"%>
<%@page import="cl.jesus.model.entity.Dueno"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Certificacion</title>
</head>
<body>
	<div class="container">
		<div class="form-row">
			<div class="col-sm-8">

				<!--    desarrollo del ensayo -->
				<div id="titulo" class="my-2">
					<h3>Registro de Mascotas</h3>
					<br />
				</div>



				<br />

				<form action="/agregar"  method="post" >
				


					<div class="row">
						<div class="col">
							<label for="nombre_mascota">Nombre mascota</label> <input
								id="mascotaId" name="nombreMascota" placeholder="Ingrese nombre"
								class="form-control" required="required">
						</div>
					
						<div class="col">
							<label for="tipo_mascota">Tipo de mascota</label> <select
								id="Tipo" name="Tipo" class="form-control"
								required="required">
								<option selected disabled="disabled">Tipo de mascota</option>
								<option value="Perro">Perro</option>
								<option value="Gato">Saab</option>
								<option value="Lobo">Lobo</option>
								<option value="Loro">Loro</option>
							</select>
						</div>

						<div class="col">
							<label for="raza_mascota">Raza</label> <select id="Raza"
								name="Raza" class="form-control" required="required">
								<option selected disabled="disabled">Razas</option>
								<option value="Pitbull">Pitbull</option>
								<option value="Salchicha">Salchicha</option>
								<option value="Siberiano">Siberiano</option>
								<option value="Bulldog">Bulldog</option>
							</select>
						</div>
					</div>


					<br />
					<div class="row">

						<div class="col">
							<label for="sexo_mascota">Sexo</label> <select id="Sexo"
								name="Sexo" class="form-control" required="required">
								<option selected disabled="disabled">Sexos</option>
								<option value="Masculino">Masculino</option>
								<option value="Femenino">Femenino</option>
							</select>
							
						</div>

						<div class="col">
							<label for="edad_mascota">Edad</label> <input type="number"
								min="0" max="99" id="edadMascota" name="edadMascota"
								class="form-control" placeholder="Ingrese edad"
								required="required">
						</div>

						<div class="col">
							<label for="descripcion_mascota">Descripcion</label> <input
								id="descripcion" name="descripcion" type="text"
								class="form-control" placeholder="Ingrese descripcion"
								required="required">
						</div>


					</div>


					<br />
					<div class="row">
						<div class="col">

							<label for="region_registro">Region</label> <select
								id="Region" name="Region" class="form-control"
								required="required">
								<option selected disabled="disabled">Lista regiones</option>
								<option value="Los Lagos">Los Lagos</option>
								<option value="Los Rios">Los Rios</option>
							</select>
							
						</div>

						<div class="col ">
							<label for="comuna_registro">Comuna</label> <select
								id="Comuna" name="Comuna" class="form-control"
								required="required">
								<option selected disabled="disabled">Lista comunas</option>
								<option value="Llanquihue">Llanquihue</option>
								<option value="Puerto Varas">Puerto Varas</option>
							</select>

						</div>
						<div class="col">
							<label for="direccion_registro">Direccion</label> <input
								id="Direccion" name="Direccion" type="text"
								class="form-control" placeholder="Ingrese dirección"
								required="required">
						</div>

					</div>

					<br />

					<div class="row">
						<div class="col">

							<label for="rut_dueno">RUT del Dueño</label> <input
								id="rut" name="rut" type="text" class="form-control"
								placeholder="Ingrese RUT" required="required">
						</div>

						<div class="col">
							<label for="nombre_dueno">Nombre del Dueño</label><input id="duenoId"
								 name="nombreDueno" type="text" class="form-control"
								placeholder="Ingrese Nombre" required="required">
                 
						</div>
						<div class="col">
							<label for="edad_dueno">Edad del dueño</label> <input
								id="edadDueno" name="edadDueno" type="number" min="0" max="99"
								class="form-control" placeholder="Ingrese edad"
								required="required">
						</div>

					</div>
					<br />
					<div class="container row justify-content-center">
						<input type="submit" onclick="getRegistro()" id="crearRegistro"
							value="Agregar"/>
							<button type="submit" onclick="window.location.href='eliminar?id=${u.getId()}'"/>Eliminar</button>
							<button type="submit" onclick="window.location.href='eliminar?id=${u.getId()}'"/>Buscar</button>
					</div>
					
					
					
				</form>
				<script type="text/javascript">
					var getRegistro = function() {

						var nombreDueno = document.getElementById("duenoId").value
						var nombreMascota = document.getElementById("mascotaId").value
						alert('El dueño '
								+ '  '
								+ nombreDueno
								+ ' '
								+ ' y la mascota '
								+ nombreMascota
								+ ' '
								+ 'se han registrado correctamente, y su id de registro es ');
					}
				</script>


				<!-- por si me pidieran mostrar los resultados en una tabla -->
				<!-- 				<br /> -->
				<!-- 				<div id="titulo" class="my-2"> -->
				<!-- 					<h3>Tabla de datos</h3> -->
				<!-- 					<br /> -->
				<!-- 				</div> -->


				<!-- 				<div class="row"> -->
				<!-- 					<div class="col"> -->
				<!-- 						<table class="table"> -->
				<!-- 							<thead> -->
				<!-- 								<tr> -->
				<!-- 									<th scope="col">#ID</th> -->
				<!-- 									<th scope="col">Estado</th> -->
				<!-- 									<th scope="col">Departamento</th> -->
				<!-- 									<th scope="col">Fecha</th> -->
				<!-- 								</tr> -->
				<!-- 							</thead> -->


				<!-- 							<tbody> -->
				<!-- 								<tr> -->
				<!-- 									<th scope="row">1</th> -->
				<!-- 									<td>Mark</td> -->
				<!-- 									<td>Otto</td> -->
				<!-- 									<td>@mdo</td> -->
				<!-- 								</tr> -->
				<!-- 								<div class="row my-2"> -->
				<!-- 									<div class="col"> -->
				<!-- 										<button type="button" class="btn btn-dark ">Buscar</button> -->
				<!-- 									</div> -->
				<!-- 								</div> -->

				<!-- 							</tbody> -->
				<!-- 						</table> -->
				<!-- 					</div> -->


				<!-- 				</div> -->

				<!--    desarrollo del ensayo -->
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>