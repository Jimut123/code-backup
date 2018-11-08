import smtplib

from mail_Secrets import Secret 									# Build a class for this project
from mail_MailTemplate import MailTemplate

from email.message import EmailMessage
from email.headerregistry import Address
from email.utils import make_msgid

class EmailSender:
    def sendmail(senderName, 								# Name of the sender
    			 recvName,									# Name of the recipient here
    			 subject, 	 								# Give the subject here
    			 template, 									# Send the template here
    			 content,									# normal text
    			 img_flag=False,						  	# By default image flag is set to false
    			 img_name="",								# add image name here
    			 bckupmsgfilename="outgoingmsg.txt" 		# add the name of the backup msg here
    			):					
	    server = smtplib.SMTP('smtp.gmail.com', 587)
	    server.starttls()
	    server.login(Secret.username, Secret.password)	# load the server
	    message = EmailMessage()
	    asparagus_cid = make_msgid()
	    message['Subject'] = subject
	    message['From'] = senderName
	    message['To'] = recvName
	    #setting the contents here, just the mail here
	    message.set_content(content)
	    #Adding the template here and formatting to html
	    message.add_alternative(template.format(asparagus_cid=asparagus_cid[1:-1]), subtype='html')
	    # Now add the related image to the html part.
	    if img_flag == True:
	    	with open(img_name,'rb') as img:
	    		message.get_payload()[1].add_related(img.read(),'image','jpeg',cid=asparagus_cid)
	    # Make a local copy of what we are going to send.
	    with open(bckupmsgfilename, 'wb') as f:
	    	f.write(bytes(message))
	    server.sendmail(senderName, recvName, str(message))
	    server.quit()
