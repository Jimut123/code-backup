from mail_EmailSender import EmailSender

from mail_Secrets import Secret 									# Build a class for this project
from mail_MailTemplate import MailTemplate

ob1 = EmailSender
ob1.sendmail("jimutbahanpal@gmail.com",
			 "jimutbahanpal@yahoo.com",
			 "Reg the arrival and proj",
			 MailTemplate.template,
			 MailTemplate.content,
			 False,
			 "roasted-asparagus.jpg",
			 "outgoingmsg.txt")
