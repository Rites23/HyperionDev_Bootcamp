#Requested user to enter their full name. That will be store in the variable "name"

name = (input("Input your full name \n"))

# If the user does not enter anything it will print out the following.

if len(name) <=0:
        print("You haven’t entered anything. Please enter your full name.") 

# If the user enters less then 4 characters and more the 25 characters it will print the following. 

if len(name) >=4 and len(name) <25: 
      print("Please make sure that you have entered your name and surname.")
else: print("Please make sure that only entered your full name")
        
# We will need the user to iput at least two names. If entered correctly it will print the following. 

name=name.split(' ')
if len(name) == 2:
        print("Thank you for entering your name.")
