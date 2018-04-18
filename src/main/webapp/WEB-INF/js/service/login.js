function login(){
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	$.ajax({ //如果ajax调用后端请求，如果后端返回 return "/jsp-name",那么后台返回了那个jsp页面内容，可惜ajax这个老表不会跳，所以要自己写
		type: "POST",
		url:"user/login.json",
		data:{
			username:username, //此处的username和password不能加引号
			password:password
		},
		timeout:30000,
		success:function(data){
			if(data.result == "success"){
				window.location.href = "user/toLoginSuccess.html";
			}else{
				window.location.href = "user/exit.html";
			}
		},
		error:function(XMLHttpRequest, textStatus, errorMsg){
			
		},
		complete:function(XMLHttpRequest, textStatus){
			
		}
	})
}