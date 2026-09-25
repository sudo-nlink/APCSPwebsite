



var year = document.getElementById("year");

if (year) {
    year.innerHTML = new Date().getFullYear();
}





var darkButton = document.getElementById("darkButton");

if (darkButton) {

    darkButton.addEventListener("click", function(event) {

        
        event.preventDefault();

        
        document.body.classList.toggle("dark-mode");

        
        if (document.body.classList.contains("dark-mode")) {

            this.innerHTML =
                '<span class="glyphicon glyphicon-adjust"></span> Light Mode';

        } else {

            this.innerHTML =
                '<span class="glyphicon glyphicon-adjust"></span> Dark Mode';

        }

    });

}





var projectLinks = document.querySelectorAll(".project-links a");

for (var i = 0; i < projectLinks.length; i++) {

    projectLinks[i].addEventListener("click", function(event) {

        
        event.preventDefault();

        
        var projectID = this.getAttribute("href");

        
        var project = document.querySelector(projectID);

        
        if (project) {

            project.scrollIntoView({
                behavior: "smooth"
            });

        }

    });

}
