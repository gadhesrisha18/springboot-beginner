function getAndDisplaymyRandomUser() {
    fetch("http://localhost:8080/api/users")
        .then(function(res){
            return res.json();
        })
        .then(function(data) {
var userData = data[Math.floor(Math.random() * data.length)];
            var myUserObject = {};

            myUserObject.name = userData.name;
            myUserObject.gender = userData.gender;
            myUserObject.image = userData.image;

            displayUser(myUserObject);
        })
        .catch(function(err){
            console.log(err);
        });
}
function displayUser(user) {
    document.getElementById("userName").textContent = user.name;
    document.getElementById("userGender").textContent = user.gender;
    document.getElementById("userPicture").src = user.image;
}