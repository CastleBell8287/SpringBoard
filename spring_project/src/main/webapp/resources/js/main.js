const toggleBtn=document.querySelector('.nav_toggle');

const menu = document.querySelector('.nav_menu');


toggleBtn.addEventListener('click',()=>{
    menu.classList.toggle('active');
});

//로그인 기능

//회원 삭제 수정 
$(function(){
	$("#btnDelete").click(function(){
		if(confirm("삭제하시겠습니까?")){
			document.form1.action = "${path}/project/member/delete";
			document.form1.submit();
		}
	});
	$("#btnUpdate").click(function(){
		if(confirm("수정하시겠습니까?")){
			document.form1.action = "${path}/project/member/update";
			document.form1.submit();
		}
	});
});