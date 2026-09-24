//javascript

//automatically puts current year into footer.
document.getElementById("year").innerHTML = new Date().getFullYear();

//dark mode button.
document.getElementById("darkButton").addEventListener("click", function(event)) {
    
    //stops #link from jumping to top of page
    event.preventDefault();
    
    //on/off for dark mode
    document.body.classList.toggle("dark-mode");
    
    //changes text on button.
    if (document.body.classList.contains("dark-mode")) {
        this.innerHTML =
        '<span class="glyphicon glyphicon-adjust"></span> Light Mode';
    } else {
        this.innerHTML =
        '<span class="glyphicon glyphicon-adjust"></span> Dark mode';
    }
});
