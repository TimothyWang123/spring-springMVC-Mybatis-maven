function login(){
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	$.ajax({
		type: "POST",
		url:"/test/login.json",
		contentType : "application/json; charset=utf-8",
		data:{
			"username":username,
			"password":password
		},
		timeout:30000,
		success:function(data){
			
		},
		error:function(XMLHttpRequest, textStatus, errorMsg){
			
		},
		complete:function(XMLHttpRequest, textStatus){
			
		}
	})
}