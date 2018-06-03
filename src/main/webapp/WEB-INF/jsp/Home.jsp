<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript"
	src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">
		<div class="table-responsive">
			<table id="medicineDisp" class="table table-striped" width="100%">
				<caption>Your Medicines are</caption>
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
		<div>
			<a class="btn btn-default" href="/add-med">Add a Medicine</a>

		</div>

	</div>

	<script>
		$(document).ready(function() {
			$('#medicineDisp').dataTable();
		});
	</script>
</body>
</html>