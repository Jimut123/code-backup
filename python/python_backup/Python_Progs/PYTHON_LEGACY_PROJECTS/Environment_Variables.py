#Program to acess environment variables
import os
print('*-------------------------------------*')
print(os.environ)
print('*-------------------------------------*')
#Acess a particular environment variable
print(os.environ['SSH_AUTH_SOCK'])
print('*-------------------------------------*')
print(os.environ['PATH'])
print('*-------------------------------------*')

