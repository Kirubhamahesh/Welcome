<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="NewFile.css">
<link href="https://fonts.googleapis.com/css?family=Acme" rel="stylesheet">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    padding-top: 100px; /* Location of the box */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: black; /* Fallback color */
    background-color: black; /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
    background-color:lightpink;
    margin: auto;
   
    border: 1px solid #888;
    width: 60%;
    height: 70%;
}

/* The Close Button */
.close {
    color: #aaaaaa;
    float: right;
    font-size: 28px;
    font-weight: bold;
}



.close:hover,
.close:focus {
    color: #000;
    text-decoration: none;
    cursor: pointer;
}

input
{
width:260px;
height:35px;
font-size:17px;
}

input:hover
{
border:2px solid lightred;
}
body{
    font-family: 'Acme', sans-serif;
}
#myBtn
{

}
</style>
</head>
<body>



<!-- Trigger/Open The Modal -->
<button id="myBtn">Donar Registration</button>

<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
   <form name="form1" action="servlet" method="get">
            <br> <br> <br>
           <label style="margin-top: 40px; font-size: 22px; margin-left: 102px; padding-top: 222px;">Name:</label>
           <input type="text" name="name"  style="margin-left: 112px;" ><br><br>

           
           
            <label style="margin-top: 60px; font-size: 22px; margin-left: 92px; padding-top: 222px;">Contact</label>
           <input type="text" name="cont" style="margin-top: 20px; margin-left: 112px;"><br><br>

            
           <label style="margin-top: 50px; font-size: 22px; margin-left: 102px; padding-top: 222px;">City</label>
           <input type="text" name="city" style="margin-left: 141px; margin-top:10px;"><br><br>


           <label style="margin-top: 45px; font-size: 22px; margin-left: 102px; padding-top: 222px;">Gender</label>

           
             <input type="checkbox" name="gender" style="width: 20px; height: 20px; margin-left: 112px;  margin-top:10px;">
             <label style="margin-top:10px;">Male</label>

            
             <input type="checkbox" name="gender" style="width: 20px; height: 20px; margin-left: 12px;  margin-top:10px;">  
             <label style="margin-top:10px;">Female</label>  <br><br>

            
             <label style="margin-top: -10px; font-size: 22px; margin-left: 102px;">Address</label><br>
            <textarea rows="4" cols="50" style="margin-top: -21px;margin-left: 274px; " name="addr">
                   
                    </textarea><br><br><br> 
                    
              <input type="submit" name="addr" style="margin-left: 201px; width:130px;"><br><br>
            </form>
       
  </div>

</div>



<script>

function check()
{
	
	}
// Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>



</body>
</html>
