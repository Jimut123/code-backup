# Import smtplib for the actual sending function
import smtplib

# And imghdr to find the types of our images
import imghdr

# Here are the email package modules we'll need
from email.message import EmailMessage

server = smtplib.SMTP('smtp.gmail.com', 587)
server.starttls()
server.login("", "")
# Create the container email message.
msg = EmailMessage()
msg['Subject'] = 'Test Python png\'s'
me = 'jimutbahanpal@gmail.com'
family =  ['jimutbahanpal@yahoo.com','paljimutbahan@gmail.com'] #the list of all recipients' email addresses
msg['From'] = me
msg['To'] = ', '.join(family)
msg.preamble = 'Test Python png message test'

# Open the files in binary mode.  Use imghdr to figure out the
# MIME subtype for each specific image.
pngfiles = ['python1.png','python.png']
for file in pngfiles:
    with open(file, 'rb') as fp:
        img_data = fp.read()
    msg.add_attachment(img_data, maintype='image',
                                 subtype=imghdr.what(None, img_data))

# Send the email via our own SMTP server.
'''
with smtplib.SMTP('localhost') as s:
    s.send_message(msg)
'''
server.sendmail("jimutbahanpal@gmail.com", "jimutbahanpal@yahoo.com", msg)
server.quit()
