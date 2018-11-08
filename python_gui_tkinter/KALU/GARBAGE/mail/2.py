import smtplib

from email.message import EmailMessage
from email.headerregistry import Address
from email.utils import make_msgid

server = smtplib.SMTP('smtp.gmail.com', 587)
server.starttls()

username = ""
password = ""
server.login(username, password)

FROM = "jimutbahanpal@gmail.com" #<from-address>
TO = "jimutbahanpal@yahoo.com" #[<to-addres>]
SUBJECT = "Hello!"
TEXT = "This message was sent with Python's smtplib."
message = 'Subject: {}\n\n{}'.format(SUBJECT, TEXT)
message = EmailMessage()
asparagus_cid = make_msgid()
message['Subject'] = "This is a test msg"
message['From'] = Address("Jimut", "Jimut", "jimutbahanpal@gmail.com")
message['To'] = (Address("Jimut B.", "Jimut1", "jimutbahanpal@yahoo.com"),
             Address("Jimut B. Pal", "Jimut", "paljimutbahan@gmail.com"))
message.set_content("""\
Rse!

Cela ressemble à un excellent recipie[1] déjeuner.

[1] http://www.yummly.com/recipe/Roasted-Asparagus-Epicurious-203718

--Pepé
""")
message.add_alternative("""\
<html>
  <head>This is a test msg lol</head>
  <body>
  <h1> Jimut is testing with some templates!<h1>
  <b> This is bold!</b>
  <i> This is italics</i>
  <u> This is underline </u>
    <p>Salut!</p>
    <p>Cela ressemble à un excellent
        <a href="http://www.yummly.com/recipe/Roasted-Asparagus-Epicurious-203718">
            recipie
        </a> déjeuner.
    </p>
    <img src="cid:{asparagus_cid}" />
  </body>
</html>
""".format(asparagus_cid=asparagus_cid[1:-1]), subtype='html')

# Now add the related image to the html part.
with open("roasted-asparagus.jpg", 'rb') as img:
    message.get_payload()[1].add_related(img.read(), 'image', 'jpeg',
                                     cid=asparagus_cid)

# Make a local copy of what we are going to send.
with open('outgoing.msg', 'wb') as f:
    f.write(bytes(message))
server.sendmail(FROM, TO, str(message))
server.quit()
