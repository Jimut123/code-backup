from mail_EmailSender import EmailSender

from mail_Secrets import Secret 									# Build a class for this project
from mail_MailTemplate import MailTemplate

ob1 = EmailSender
ob1.sendmail("jimutbahanpal@gmail.com",
			 "jimutbahanpal@yahoo.com",
			 "Test mail in my software!",
			 MailTemplate.template,
			 MailTemplate.content,
			 True,
			 "roasted-asparagus.jpg",
			 "outgoingmsg.txt")
