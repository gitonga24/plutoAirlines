$('document').ready(function() {

	$('table #editButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(passenger, status){
			$('#idEdit').val(passenger.id);
			$('#firstnameEdit').val(passenger.firstname);
			$('#lastnameEdit').val(passenger.lastname);
			$('#addressEdit').val(passenger.address);
			$('#cityEdit').val(passenger.city);
			$('#stateidEdit').val(passenger.stateid);
			$('#countryidEdit').val(passenger.countryid);
			$('#phoneEdit').val(passenger.phone);
			$('#emailEdit').val(passenger.email);
			$('#dateOfBirthEdit').val(passenger.dateOfBirth);
			$('#socialSecurityNumberEdit').val(passenger.socialSecurityNumber);
			$('#rewardPointsEdit').val(passenger.rewardPoints);
			$('#hireDateEdit').val(passenger.hireDate);

		});
		$('#editModal').modal();			
	});
		
	$('table #detailsButton').on('click', function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$.get(href, function(passenger, status){
			$('#idDetails').val(passenger.id);
			$('#firstnameDetails').val(passenger.firstname);
			$('#lastnameDetails').val(passenger.lastname);
			$('#addressDetails').val(passenger.address);
			$('#cityDetails').val(passenger.city);
			$('#stateidDetails').val(passenger.stateid);
			$('#countryidDetails').val(passenger.countryid);
			$('#phoneDetails').val(passenger.phone);
			$('#emailDetails').val(passenger.email);
			$('#dateOfBirthDetails').val(passenger.dateOfBirth);
			$('#socialSecurityNumberDetails').val(passenger.socialSecurityNumber);
			$('#rewardPointsDetails').val(passenger.rewardPoints);
			$('#hireDateDetails').val(passenger.hireDate);
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
