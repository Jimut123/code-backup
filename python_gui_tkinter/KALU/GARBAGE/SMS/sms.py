# Download the helper library from https://www.twilio.com/docs/python/install
from twilio.rest import Client


# Your Account Sid and Auth Token from twilio.com/console
account_sid = ''    #'AC13c16edc8f9f3ae37006470f6a7c4eca'  #'AC13c16edc8f9f3ae37006470f6a7c4eca'
auth_token = ''   #'5001944d507e84ba1f4809ad9a15858e' #'your_auth_token'
client = Client(account_sid, auth_token)

message = client.messages.create(
                              body='Hello there This is a test message from twilio!!',
                              from_='+99098',
                              to='+8'
                          )

print(message.sid)

