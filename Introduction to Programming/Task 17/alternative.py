# Code to demonstrate working of
# Alternate cases in String
# Using upper() + lower() + loop
  
# initializing string 
test_str = "Hello World"
  
# printing original string 
print(str(test_str))
  
# Using upper() + lower() + loop
# Alternate cases in String
word = ""
for i in range(len(test_str)):
    if not i % 2 :
       word = word + test_str[i].upper()
    else:
       word = word + test_str[i].lower()

# printing result 
print(str(word))