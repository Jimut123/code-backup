import smtplib
import string
username = "jimutbahanpal@gmail.com"     #"jimutbahanpal@yahoo.com"
password = "jimut1234S#"
#server.login(username, password)
HOST = "mySMTP.server.com"
SUBJECT = "Test email from Python"
TO = "jimutbahanpal@yahoo.com"
FROM = "jimutbahanpal@gmail.com"
text = "Python rules them all!"
BODY = string.join((
        "From: %s" % FROM,
        "To: %s" % TO,
        "Subject: %s" % SUBJECT ,
        "",
        text
        ), "\r\n")
server = smtplib.SMTP(HOST)
server.login(username, password)
server.sendmail(FROM, [TO], BODY)
server.quit()
