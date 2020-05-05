$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(employee, status){
			$('#idEdit').val(employee.id);
			$('#firstnameEdit').val(employee.firstname);
			$('#lastnameEdit').val(employee.lastname);
			$('#addressEdit').val(employee.address);
			$('#cityEdit').val(employee.city);
			$('#stateidEdit').val(employee.stateid);
			$('#countryidEdit').val(employee.countryid);
			$('#phoneEdit').val(employee.phone);
			$('#emailEdit').val(employee.email);
			$('#dateOfBirthEdit').val(employee.dateOfBirth);
			$('#socialSecurityNumberEdit').val(employee.socialSecurityNumber);
			$('#employeeClassificationidEdit').val(employee.employeeClassificationid);
			$('#hireDateEdit').val(employee.hireDate);

		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(employee, status){
			$('#idDetails').val(employee.id);
			$('#firstnameDetails').val(employee.firstname);
			$('#lastnameDetails').val(employee.lastname);
			$('#addressDetails').val(employee.address);
			$('#cityDetails').val(employee.city);
			$('#stateidDetails').val(employee.stateid);
			$('#countryidDetails').val(employee.countryid);
			$('#phoneDetails').val(employee.phone);
			$('#emailDetails').val(employee.email);
			$('#dateOfBirthDetails').val(employee.dateOfBirth);
			$('#socialSecurityNumberDetails').val(employee.socialSecurityNumber);
			$('#employeeClassificationidDetails').val(employee.employeeClassificationid);
			$('#hireDateDetails').val(employee.hireDate);
		});
		$('#detailsModal').modal();			
	});

	
	

		
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
	

});
