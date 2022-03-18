function getDate(){
    var d = new Date();
        //return d+'';                  // "Sun Dec 08 2013 18:55:38 GMT+0100"
        return d.toDateString();        // "Sun Dec 08 2013"
        //return d.toISOString();       // "2013-12-08T17:55:38.130Z"
        //return d.toLocaleDateString() // "8/12/2013" on my system
        //return d.toLocaleString()     // "8/12/2013 18.55.38" on my system
        //return d.toUTCString() 

}

$("#marqueeText").text(getDate());

$('#buySubmit').click(function() {
    var x = parseInt($("#txtNumb").val());
    var y = parseInt($("#stock").val());
    window.location = "http://127.0.0.1:5500/Buy.html?id=" + x + "&stock=" + y;
 });


  function getCurrentDate(){
    	function pad2(n) {
    		  return (n < 10 ? '0' : '') + n;
    		}

    		var date = new Date();
    		var month = pad2(date.getMonth()+1);//months (0-11)
    		var day = pad2(date.getDate());//day (1-31)
    		var year= date.getFullYear();

    		var formattedDate =  year+"-"+month+"-"+day;
    		
//     		alert(formattedDate); //2021-02-28
    		return formattedDate;
    }


function deleteAlert() {
	alert("データを削除しました");
}
function resetAlert() {
	alert("パスワードをリセットしました");
}
function buyAlert() {
	alert("本を買いました");
}

function bookSearch() {
	var txt1 = document.getElementById("bookSearchTxt").value;
	var rad1 = document.getElementById("searchByIsbn");
	var rad2 = document.getElementById("searchByTitle");
	
	if(rad1.checked){
			window.location.assign('http://localhost:8080/books/search/isbn/'+txt1);

	}
	if(rad2.checked){
			window.location.assign('http://localhost:8080/books/search/title/'+txt1);
	}
}


function cashierBookSearch() {
	var txt1 = document.getElementById("bookSearchTxt").value;
	var rad1 = document.getElementById("searchByIsbn");
	var rad2 = document.getElementById("searchByTitle");
	
	if(rad1.checked){
			window.location.assign('http://localhost:8080/cashier/booklist/isbn/'+txt1);

	}
	if(rad2.checked){
			window.location.assign('http://localhost:8080/cashier/booklist/title/'+txt1);
	}
}

