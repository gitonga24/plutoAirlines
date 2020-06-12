$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(flightAttendant, status){
			$('#idEdit').val(flightAttendant.id);
			$('#firstnameEdit').val(flightAttendant.firstname);
			$('#lastnameEdit').val(flightAttendant.lastname);
			$('#addressEdit').val(flightAttendant.address);
			$('#cityEdit').val(flightAttendant.city);
			$('#stateidEdit').val(flightAttendant.stateid);
			$('#countryidEdit').val(flightAttendant.countryid);
			$('#phoneEdit').val(flightAttendant.phone);
			$('#emailEdit').val(flightAttendant.email);
			$('#dateOfBirthEdit').val(flightAttendant.dateOfBirth);
			$('#socialSecurityNumberEdit').val(flightAttendant.socialSecurityNumber);
			$('#flightAttendantClassificationidEdit').val(flightAttendant.flightAttendantClassificationid);
			$('#hireDateEdit').val(flightAttendant.hireDate);

		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(flightAttendant, status){
			$('#idDetails').val(flightAttendant.id);
			$('#firstnameDetails').val(flightAttendant.firstname);
			$('#lastnameDetails').val(flightAttendant.lastname);
			$('#addressDetails').val(flightAttendant.address);
			$('#cityDetails').val(flightAttendant.city);
			$('#stateidDetails').val(flightAttendant.stateid);
			$('#countryidDetails').val(flightAttendant.countryid);
			$('#phoneDetails').val(flightAttendant.phone);
			$('#emailDetails').val(flightAttendant.email);
			$('#dateOfBirthDetails').val(flightAttendant.dateOfBirth);
			$('#socialSecurityNumberDetails').val(flightAttendant.socialSecurityNumber);
			$('#flightAttendantClassificationidDetails').val(flightAttendant.flightAttendantClassificationid);
			$('#hireDateDetails').val(flightAttendant.hireDate);
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
