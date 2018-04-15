function validate() {
	var name = document.getElementById("city").value;
	var state = document.getElementById("state").value;
	if (name == '') {
		alert('Please enter a valid name.');
		return false;
	} else if (state == '') {
		alert('Please enter a valid state.');
		return false;
	} else {
		return true;
	}
}

function deletecity(id) {
	$.ajax({
		type : "DELETE",
		url : "/city/" + id,
		success : function(result) {
			console.log(result);
			alert('City has been deleted successfully');
			location.reload(true);
		},
		error : function(e) {
			console.log(e);
			alert('error');
		}
	});
}

function editcity(id) {
	$.ajax({
		type : "PUT",
		url : "/city/" + id,
		data : $("#cityForm").serialize(),
		success : function(result) {
			console.log(result);
			alert('City has been updated successfully');
			location.reload(true);
		},
		error : function(e) {
			console.log(e);
			alert('error');
		}
	});
}
