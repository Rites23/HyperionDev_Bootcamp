// Code for the colors theme change is below 

let theme = localStorage.getItem('theme') // Here we initialize the local storage to store each of the selected themes 

if(theme == null){// If the user has not selected a theme or has selected the default circle/white circle the theme will remain light
	setTheme('light')
}else{
	setTheme(theme)
}

let themeDots = document.getElementsByClassName('theme-dot') // We get the ID's of the dots in the html document.


for (var i=0; themeDots.length > i; i++){ // We loop through all of the theme dots to determine which dot has been selected and call the function set theme to execute the selected colour changing the theme style.
	themeDots[i].addEventListener('click', function(){
		let mode = this.dataset.mode
		console.log('Option clicked:', mode)
		setTheme(mode)
	})
}

function setTheme(mode){// Here we enter our themes in a function which consists of conditions based on the users choice of which theme colour they would like to have.
	if(mode == 'light'){
		document.getElementById('theme-style').href = 'styles.css' // We get the selected theme dot from the loop and if it has been selected the code in the loop will execute
	}

	if(mode == 'blue'){
		document.getElementById('theme-style').href = 'blue.css'
	}

	if(mode == 'green'){
		document.getElementById('theme-style').href = 'green.css'
	}

	if(mode == 'purple'){
		document.getElementById('theme-style').href = 'purple.css'
	}

	localStorage.setItem('theme', mode) // In order to save the users selected theme we store the selected theme into local storage so that when a user refreshes the page or closes the browser and returns the previuosly selected theme will remain.
}