var currentUserIndex=1;
var userArray=[
{"name":"John","gender":"Male","img":"img/john.png"},
{"name":"Jane","gender":"Female","img":"img/img_avatar2.png"}
];
function toggleUser(){
    currentUserIndex=1-currentUserIndex;
    var nextUser=userArray[currentUserIndex];
    displayUser(nextUser);
}
function  displayUser(user){
   // console.log(user);  
document.getElementById("userImage").src=user.img;
document.getElementById("userName").textContent=user.name;
document.getElementById("userGender").textContent=user.gender;
 }