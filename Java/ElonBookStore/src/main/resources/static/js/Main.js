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


 