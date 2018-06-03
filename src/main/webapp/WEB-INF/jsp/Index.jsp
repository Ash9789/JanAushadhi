<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>View Medicines</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css">

<link rel="stylesheet" type="text/css"
	href="fonts/iconic/css/material-design-iconic-font.min.css">
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>

</head>
<body>

	<div class="container-contact100">
		<div class="wrap-contact100">
			<span class="contact100-form-title"> View Medicines </span>
			<div class="float-right" style="margin-bottom:20px;">
				<a class="btn btn-outline-success" href="/add-med">Add a Medicine</a>

			</div>
				<div class="table-responsive">
					<table id="medicineDisp"
						class="table table-striped table-condensed order-column hover"
						width="100%">
						<thead>
							<tr>
								<th>Medicine Name</th>
								<th>Generic Name</th>
								<th>Indication</th>
								<th>Dosage</th>
								<th>Drug Form</th>
								<th>Side Effects</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="medicine" items="${allMedicine}">
								<tr>
									<td>${medicine.medicineName}</td>
									<td>${medicine.genericName}</td>
									<td>${medicine.indications}</td>
									<td>${medicine.dosage}</td>
									<td>${medicine.drugForm}</td>
									<td>${medicine.sideEffects}</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
			</div>
			
		</div>

	</div>

	<script src="js/main.js"></script>
	<script>
		$(document).ready(function() {
			$('#medicineDisp').dataTable();
		});
	</script>

</body>
</html>
