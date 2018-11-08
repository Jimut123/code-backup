class MailTemplate():
	template = """\
	<html>
	  <title> This is the title</title>
	  <head> Some head in this place</head>
	  <body>

	  <h1> 
	  		Header of the mail
	  </h1>

	  <b> 
	  		This is bold!
	  </b>
	  <i> 
	  	This is italics
	  </i>
	  <u> 
	  	This is underline 
	  </u>
	   <p>
	   Salut!
	   </p>
	    <p>Follow on github!
	        <a href="https://github.com/Jimut123">
	            recipie
	        </a> 
	    </p>
	    <img src="cid:{asparagus_cid}" />
	  </body>
	</html>
	"""
	content = """\
	Rse!
	Cela ressemble à un excellent recipie[1] déjeuner.
	[1] http://www.yummly.com/recipe/Roasted-Asparagus-Epicurious-203718
	--Pepé
	"""
