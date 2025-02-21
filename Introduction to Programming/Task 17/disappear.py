# Ask the user to input a string and then ask the user which characters they
# would like to make disappear.

sent = input("Enter your Sentence: ")
strp = input("Enter the Characters which you want to strip: ")

# We would use a for loop to get the entered characters disappeared. 

for i in strp:
    sent = sent.replace(i,'')
    
# The following will be printed once the sentences and words are completed. 
#   
print("The final result is :", sent)