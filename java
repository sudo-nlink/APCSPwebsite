//javascript

document.getElementById("year").innerHTML = new Date().getFullYear();


document.getElementById("darkButton").addEventListener("click", function(event)) {
    

    event.preventDefault();
    

    document.body.classList.toggle("dark-mode");
    

    if (document.body.classList.contains("dark-mode")) {
        this.innerHTML =
        '<span class="glyphicon glyphicon-adjust"></span> Light Mode';
    } else {
        this.innerHTML =
        '<span class="glyphicon glyphicon-adjust"></span> Dark mode';
    }
});
