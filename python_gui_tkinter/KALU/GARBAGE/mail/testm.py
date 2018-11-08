import smtplib
 
server = smtplib.SMTP('smtp.gmail.com', 587)
server.starttls()
server.login("jimutbahanpal@gmail.com", "jimut1234S#")
 
msg = "YOUR MESSAGE!"
server.sendmail("jimutbahanpal@gmail.com", "jimutbahanpal@yahoo.com", msg)
server.quit()
