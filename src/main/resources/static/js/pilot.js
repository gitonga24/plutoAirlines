$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(pilot, status){
			$('#idEdit').val(pilot.id);
			$('#firstnameEdit').val(pilot.firstname);
			$('#lastnameEdit').val(pilot.lastname);
			$('#addressEdit').val(pilot.address);
			$('#cityEdit').val(pilot.city);
			$('#stateidEdit').val(pilot.stateid);
			$('#countryidEdit').val(pilot.countryid);
			$('#phoneEdit').val(pilot.phone);
			$('#emailEdit').val(pilot.email);
			$('#dateOfBirthEdit').val(pilot.dateOfBirth);
			$('#socialSecurityNumberEdit').val(pilot.socialSecurityNumber);
			$('#pilotClassificationidEdit').val(pilot.pilotClassificationid);
			$('#hireDateEdit').val(pilot.hireDate);

		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(pilot, status){
			$('#idDetails').val(pilot.id);
			$('#firstnameDetails').val(pilot.firstname);
			$('#lastnameDetails').val(pilot.lastname);
			$('#addressDetails').val(pilot.address);
			$('#cityDetails').val(pilot.city);
			$('#stateidDetails').val(pilot.stateid);
			$('#countryidDetails').val(pilot.countryid);
			$('#phoneDetails').val(pilot.phone);
			$('#emailDetails').val(pilot.email);
			$('#dateOfBirthDetails').val(pilot.dateOfBirth);
			$('#socialSecurityNumberDetails').val(pilot.socialSecurityNumber);
			$('#pilotClassificationidDetails').val(pilot.pilotClassificationid);
			$('#hireDateDetails').val(pilot.hireDate);
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
